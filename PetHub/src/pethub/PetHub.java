package pethub;

import java.util.Scanner;

public class PetHub {
    static boolean online = true;
    static int numberOfEntries = 3;
    

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETHUB!!! \nIF YOU HAVE AN ACCOUNT, PRESS 1 AND LOG IN \nIF YOU DON'T HAVE AN ACCOUNT, PRESS 2 AND SIGN IN!");
        
        Insert u1=new Insert();
        u1.insertUser("can","ugurtepe","cannatar","0987","can@gmail.com");

        //LogIn u1=new LogIn();        
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        

        if (choice == 1) {
            LogIn.SignIn(scanner);
        } else if (choice == 2) {
            //LogIn.SignUp(scanner);
        } else {
            System.out.println("Invalid choice!");
        }
        
        Connect.connect();
        CreateData.createNewDatabase("SSSIT.db");
        CreateTable.createNewTable();
        Insert app = new Insert();  

        app.insertUser("Ece", "Sarıyer", "ejess","05412681907", "1907");  
        app.insertUser("Kübra", "Batalgazi", "kubrabb", "05056487596","5151");  
        app.insertUser("İrem", "Karakurt", "iremkrkrt", "05326895060", "6060");
        app.insertUser("Hazal", "Bilgin", "hbilginn", "05326895061", "6161");
        
        app.insertAnimal("umut",3, "dog", "yes", "male", 1);
 
        
        Select selectApp = new Select();
        selectApp.selectAll();
    }}