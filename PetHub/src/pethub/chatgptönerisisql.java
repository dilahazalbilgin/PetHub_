/*package pethub;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PetHub {
    static boolean online = true;
    static int numberOfEntries = 3;

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETHUB!!! \nIF YOU HAVE AN ACCOUNT, PRESS 1 AND LOG IN \nIF YOU DON'T HAVE AN ACCOUNT, PRESS 2 AND SIGN IN!");
        NewClass.connect();
        NewClass1.createNewDatabase("SSSIT.db");
        NewClass2.createNewTable();
        NewClass3 app = new NewClass3();  
        // insert three new rows  
        /*app.insert("Eje", 61);  
        app.insert("Kübra", 1461);  
        app.insert("İrem", 6161);*/
        //Animal_Owner.Post("yes", "idk", "cat", numberOfEntries, "aa");

        /*Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Hesabın varsa 1i seç");
        System.out.println("hesap oluşturmak istiyorsan 2yi seç");

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
        scanner.nextLine(); 
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        String sql = "INSERT INTO users(name, surname, phone, username, password) VALUES(?,?,?,?,?)";

        try (Connection conn = NewClass.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setString(1, name);
        pstmt.setString(2, surname);
        pstmt.setLong(3, phoneNumber);
        pstmt.setString(4, username);
        pstmt.setString(5, password);
        pstmt.executeUpdate();
        System.out.println("Account created successfully!");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
        
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
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

    try (Connection conn = NewClass.connect();
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
*/