package pethub;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetHub {
    public static void main(String[] args) {
    /*Animals petmanager=new Animals();
    
    pets.add(new Dog("k",6,"k","j",false));
    pets.add(new Cat("k",6,"k","j",false));
    
        for (Gendered pet : pets) {
            pet.setGender("Female");
            pet.setReproductive(true);
            System.out.println("Pet gender: " + pet.getGender());
            System.out.println("Is reproductive: " + pet.isReproductive());
        }
    
       */ 
        System.out.println("WELCOME TO PETHUB!!! \nIF YOU HAVE AN ACCOUNT, PRESS 1 AND LOG IN \nIF YOU DON'T HAVE AN ACCOUNT, PRESS 2 AND SIGN IN!");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        CreateData.createNewDatabase("SSSIT.db");
        CreateTable.createNewTable();
       
        if (choice == 1) {
            LogIn.SignIn(scanner);
        } else if (choice == 2) {
            LogIn.SignUp(scanner);
        } else {
            System.out.println("Please try again");
        }
    }
    
}