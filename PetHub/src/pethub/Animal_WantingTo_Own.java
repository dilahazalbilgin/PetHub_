package pethub;

import java.util.Scanner;

public class Animal_WantingTo_Own extends User{
    
    protected int petNumber;   
    public Animal_WantingTo_Own(String name, String surname, long phoneNumber) {
        super(name, surname, phoneNumber);
    }

    public Animal_WantingTo_Own( int petNumber, String name, String surname, long phoneNumber) {
        super(name, surname, phoneNumber);
        this.petNumber = petNumber;
    }
    
    public static void addGender(){
        System.out.println("what is your gender\n1-Girl\n2-Boy");
        Scanner keyb=new Scanner(System.in);
        String gender1=keyb.nextLine();
        System.out.println("Your gender is: " +gender1);
        }   
    public  void addOwnAnimals(){
        System.out.println("do you have an animal?");
        Scanner keyb=new Scanner(System.in);
        String a1=keyb.nextLine();
        if(a1=="yes".toLowerCase()){
            System.out.println("Please write animals");
            String a2=keyb.nextLine();
            System.out.println("your animals: " + a2);
        }else{System.out.println("First animalll");}
    }   
    @Override
    public void information(){
    super.information();
    }
    public int getPetNumber() {
        return petNumber;
    }

    public void setPetNumber(int petNumber) {
        this.petNumber = petNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
