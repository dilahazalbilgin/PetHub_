package pethub;

import java.util.Scanner;

public class Animal_Owner extends User {
    public Animal_Owner(String name, String surname, long phoneNumber) {
        super(name, surname, phoneNumber);    
    }  
    public void AddPost(){
        System.out.println("Why do you want to give away your pet?: ");
        Scanner keyb=new Scanner(System.in);
        String reson=keyb.nextLine();
    }
    public void AddDetail(){
        System.out.println("Do you want a add detail?");
        Scanner keyb=new Scanner(System.in);
        String det=keyb.nextLine();
        if(det=="yes"){
            System.out.println("please write a detail");
            String det1=keyb.nextLine();
            System.out.println("Detail: " +det1);
        }
    }   
}
