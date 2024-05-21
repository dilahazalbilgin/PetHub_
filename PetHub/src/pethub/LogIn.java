package pethub;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import static pethub.PetHub.numberOfEntries;
import static pethub.PetHub.online;

public class LogIn {
    
    
    private Connection connect(){
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
        }
    
    public  void SignUp(Scanner scanner,String name,String surname,String username,String password,String email) {
        String sql = "INSERT INTO Users(name, surname,username,password,email) VALUES(?,?,?,?,?)";
        try{
            Connection conn = this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setString(2,surname);
            pstmt.setString(3,username);
            pstmt.setString(4,password);
            pstmt.setString(5,email);
            pstmt.executeUpdate();
            System.out.println("User registered successfully");
        } catch (SQLException e){
            System.out.println("Username or email has already taken");
        }
 
        
        
        /*System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your phone number:");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Boş satırı tüket

        User newUser = User.createAccount(name, surname, phoneNumber);
        System.out.println("Account created successfully!");
        newUser.Information();*/
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
                            System.out.println("Please enter the action you are the perform");
                            System.out.println("1-Add Post\n2-See Post");
                            int enter=scanner.nextInt();
                            if(enter==1){Animal_Owner.AddPost();}
                            else if(press==2){
                             }
                            else{System.out.println("Please press 1 or 2 ");}
                        }else if(press==2){
                            System.out.println("Please enter the action you are the perform");
                            System.out.println("1-Add Info\n2-Want Animal");
                            int enter1=scanner.nextInt();
                            if(enter1==1){Animal_WantingTo_Own.Add();}
                            else if(enter1==2){Animal_WantingTo_Own.WantsAnimal();}
                            else{System.out.println("Please press 1 or 2 ");}
                        }
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

        }}}