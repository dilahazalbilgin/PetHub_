package pethub;

import java.util.Scanner;

public class Cat extends Animals implements Gendered{
    private String gender;
    private boolean reproductive;
    
    public Cat(String name, int animalAge,String animalSpecies, String gender, boolean reproductive) {
        super(name, animalSpecies, animalAge);
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void makeSound() {
        System.out.println("Is it make a sound?");
        Scanner keyb=new Scanner(System.in);
        String sound=keyb.nextLine();
        if(sound.equalsIgnoreCase("yes")){
            System.out.println("It's a noisy cat!");
        }else{System.out.println("I's a quite cat");} 
    }
    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + animalAge + ", Species='" + animalSpecies + "', gender='" + gender + "', reproductive=" + reproductive + "}";
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
       this.gender= gender;
    }

    @Override
    public boolean isReproductive() {
        return reproductive;
    }

    @Override
    public void setReproductive(boolean reproductive) {
        this.reproductive= reproductive;
    }
    
}
