package pethub;

import java.util.Scanner;

public class PetHub {
    static boolean online = true;
    static int numberOfEntries = 3;

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETHUB!!! \nIF YOU HAVE AN ACCOUNT, PRESS 1 AND LOG IN \nIF YOU DON'T HAVE AN ACCOUNT, PRESS 2 AND SIGN IN!");
        NewClass.connect();
        NewClass1.createNewDatabase("61");
        NewClass2.createNewTable();
        NewClass3.main(args);
        //Animal_Owner.Post("yes", "idk", "cat", numberOfEntries, "aa");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Boş satırı tüket

        if (choice == 1) {
            SignIn(scanner);
        } else if (choice == 2) {
            SignUp(scanner);
        } else {
            System.out.println("Invalid choice!");
        }
    }

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
