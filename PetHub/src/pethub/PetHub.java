package pethub;

import java.util.Scanner;

public class PetHub {
    public static void main(String[] args) {
        
        /*Dog d=new Dog("saj",5,"s","s",true);
        Cat c=new Cat("a",5,"s","s",false);  
        Fish f=new Fish("a",5,"s","s",false);
        Bird b=new Bird("a",5,"s","s",false);
        
        
        
            Animal_Owner a=new Animal_Owner("hakan","fidan",56431,d,c,f,b);
            User[] k=new User[2];
            for(User t:k){
            a.Information();*/
             
            
            
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