package pethub;

import java.util.Scanner;

public class PetHub {
    public static void main(String[] args) {
       
        //NewClass.connect();
        //Insert insertApp = new Insert();
        //insertApp.insertAnimal("boncuk",2, "cat", "yes", "female", 61);
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
      
      Select selectApp = new Select();
     //app.selectAllUsers();
     //selectApp.selectAllAnimals();
     // app.selectAllPosts();
     //selectApp.selectAnimalBySpecies("dog");
     //selectApp.selectAnimalBySpecies("cat");
     //selectApp.selectAnimalBySpecies("fish");
     //selectApp.selectAnimalBySpecies("bird");

    }
    
}
