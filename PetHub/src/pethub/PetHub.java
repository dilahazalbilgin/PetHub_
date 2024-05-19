package pethub;

import java.util.Scanner;

public class PetHub {
    static boolean online = true;
    static int numberOfEntries = 3;

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETHUB!!! \nIF YOU HAVE AN ACCOUNT, PRESS 1 AND LOG IN \nIF YOU DON'T HAVE AN ACCOUNT, PRESS 2 AND SIGN IN!");
        
        Animal_WantingTo_Own.wantsAnimal();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Boş satırı tüket

        if (choice == 1) {
            LogIn.SignIn(scanner);
        } else if (choice == 2) {
            LogIn.SignUp(scanner);
        } else {
            System.out.println("Invalid choice!");
        }
        
       Connect.connect();
        CreateData.createNewDatabase("SSSIT.db");
       CreateTable.createNewTable();
        Insert app = new Insert();  
        //insert three new row 
        app.insert("Ece", "Sarıyer", "ejess","05412681907", "1907");  
        app.insert("Kübra", "Batalgazi", "kubrabb", "05056487596","5151");  
        app.insert("İrem", "Karakurt", "iremkrkrt", "05326895060", "6060");
        app.insert("Hazal", "Bilgin", "hbilginn", "05326895061", "6161");
        //Animal_Owner.Post("yes", "idk", "cat", numberOfEntries, "aa");

    }}