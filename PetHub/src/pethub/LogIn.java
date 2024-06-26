package pethub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogIn {
    static boolean online = true;
    static int numberOfEntries = 3;
    static Map<String, String> userDatabase = new HashMap<>();
    
    //Sql connection 
    public static void SignUp(Scanner scanner) { 
        DataBaseOperation newUser=new DataBaseOperation();
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
                                System.out.println("Do you want to add an animal to the system or a post?");
                                System.out.println("1-Add Animal\n2-Add Post");
                                int select=scanner.nextInt();
                                if(select==1){
                                    Animals.AddAnimal();
                                }else if(select==2){
                                   Animal_Owner.AddPost();   
                                }                  
                        } else if (press == 2) {
                            System.out.println("Please enter the action you want to perform");
                            System.out.println("1-Add Info\n2-Want Animal");
                            int enter1 = scanner.nextInt();
                            scanner.nextLine(); 
                            switch (enter1) {
                                case 1:
                                    Animal_WantingTo_Own.AddInfo();
                                    break;
                                case 2:
                                    Animal_WantingTo_Own.WantsAnimal();
                                    break;
                                default:
                                    System.out.println("Please press 1 or 2");
                                    break;
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
    private static Connection connect() {
        Connection conn = null;
        String url = "jdbc:sqlite:C:/sqlite/SSSIT.db"; 
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static boolean login(String username, String password) {
       String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
       
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                numberOfEntries--;
                System.out.println("Incorrect username or password!");
                if (numberOfEntries == 0) {
                    online = false;
                }
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    } 
}