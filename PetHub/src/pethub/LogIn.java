package pethub;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogIn {
    static boolean online = true;
    static int numberOfEntries = 3;
    static Map<String, String> userDatabase = new HashMap<>();

    public static void SignUp(Scanner scanner) { 
        Insert newUser=new Insert();
        System.out.println("Please enter the name");
        String name = scanner.nextLine();
        System.out.println("Please enter the surname");
        String surname = scanner.nextLine();
        System.out.println("Please enter the username");
        String username = scanner.nextLine();
        System.out.println("Please enter the phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please create a password");
        String password = scanner.nextLine();
        
        newUser.insertUser(name,surname,username,phoneNumber,password);  
        userDatabase.put(username, password);     
        System.out.println("Your account has been created successfully, please log in");
        SignIn(scanner);
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
                        System.out.println("Are you an animal owner or wanting to own an animal?\nIf you are an animal owner, please press 1\nIf you want to own an animal, please press 2");
                        int press = scanner.nextInt();
                        scanner.nextLine();
                        if (press == 1) {
                            System.out.println("Please enter the action you want to perform");
                            System.out.println("1-Add Post\n2-See Post");
                            int enter = scanner.nextInt();
                            scanner.nextLine(); 
                            if (enter == 1) {
                                Animal_Owner.AddPost();
                            } else if (enter == 2) {
                                
                            } else {
                                System.out.println("Please press 1 or 2");
                            }
                        } else if (press == 2) {
                            System.out.println("Please enter the action you want to perform");
                            System.out.println("1-Add Info\n2-Want Animal");
                            int enter1 = scanner.nextInt();
                            scanner.nextLine(); 
                            if (enter1 == 1) {
                                Animal_WantingTo_Own.Add();
                            } else if (enter1 == 2) {
                                Animal_WantingTo_Own.WantsAnimal();
                            } else {
                                System.out.println("Please press 1 or 2");
                            }
                        }
                        break;
                    } else {
                        if (numberOfEntries == 0) {
                            online = false;
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Your attempts have been exhausted, your account is blocked.");
            }
        }
    }

    public static boolean login(String username, String password) {
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
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