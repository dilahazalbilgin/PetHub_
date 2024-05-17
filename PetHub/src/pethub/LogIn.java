package pethub;

import java.util.Scanner;
import static pethub.PetHub.numberOfEntries;
import static pethub.PetHub.online;

public class LogIn {
    public static void SignUp(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your phone number:");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Boş satırı tüket

        User newUser = User.createAccount(name, surname, phoneNumber);
        System.out.println("Account created successfully!");
        newUser.information();
    }

    public static void SignIn(Scanner scanner) {
        if (online) {
            if (numberOfEntries > 0) {
                while (online) {
                    System.out.println("Enter your username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter your password:");
                    String password = scanner.nextLine();
                    boolean result = login(username, password);
                    if (result) {
                        System.out.println("Login successful!");
                        System.out.println("Are you animal owner or animal wanting to own?\nIf you animal owner please press to 1\nIf you want to animal own please press to 2");
                        int press=scanner.nextInt();
                        if(press==1){
                        Animal_Owner.Post("yes", "idk", "cat", numberOfEntries, "aa");
                        }else if(press==2){
                        Animal_WantingTo_Own.add();
                        }else{System.out.println("Please press 1 or 2");}
                        break;
                    } else {
                        if (numberOfEntries == 0) {
                            online = false;
                            break;
                        }
                    }
                    if (!online) {
                        System.out.println("Your attempts have been exhausted!");
                    }
                }
            } else {
                System.out.println("Your attempts have been exhausted, your account is blocked.");
            }
        }
    }

    public static boolean login(String username, String password) {
        if (username.equals("hazal") && password.equals("6161")) {
            return true;
        } else if (username.equals("eje") && password.equals("1907")) {
            return true;
        } else {
            numberOfEntries--;
            System.out.println("Incorrect username or password!");
            if (numberOfEntries == 0) {
                online = false;
            }
            return false;
        }
    }
}
