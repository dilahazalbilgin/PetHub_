package pethub;

import java.util.Scanner;

public class PetHub {
    static boolean online = true;
    static int numberOfEntries = 3;

    public static void main(String[] args) {
        System.out.println("WELCOME TO PETHUB!!! \nIF YOU HAVE AN ACCOUNT, PRESS 1 AND LOG IN \nIF YOU DON'T HAVE AN ACCOUNT, PRESS 2 AND SIGN IN!");

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
        
        /*NewClass.connect();
        NewClass1.createNewDatabase("SSSIT.db");
        NewClass2.createNewTable();
        NewClass3 app = new NewClass3();  
        // insert three new rows  
        app.insert("Eje", 61);  
        app.insert("Kübra", 1461);  
        app.insert("İrem", 6161);
        //Animal_Owner.Post("yes", "idk", "cat", numberOfEntries, "aa");*/

    }    
}