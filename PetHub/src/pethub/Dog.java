package pethub;

import java.util.Scanner;

//Inheritance
public class Dog extends Animals implements Gendered {
    private String gender;
    private boolean reproductive;

    public Dog(String name, int animalAge,String animalSpecies,String gender, boolean reproductive) {
        super(name, animalSpecies, animalAge);
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void AnimalInformation(){
        super.AnimalInformation();
        System.out.println("Gender is: "+gender);
        System.out.println("Reproductive is: "+reproductive );
    }

    @Override
    public void MakeSound() {
        System.out.println("Is it make a sound?");
        Scanner keyb=new Scanner(System.in);
        String sound=keyb.nextLine();
        if(sound.equalsIgnoreCase("yes")){
            System.out.println("It's a noisy dog!");
        }else{System.out.println("I's a quite dog");} 
    }

    @Override
    public String getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + animalAge + ", Species='" + animalSpecies + "', gender='" + gender + "', reproductive=" + reproductive + "}";
    }

    public String getAnimalSpecies() {
        return animalSpecies;
    }

    public void setAnimalSpecies(String animalSpecies) {
        this.animalSpecies = animalSpecies;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean isReproductive() {
        return reproductive;
    }

    @Override
    public void setReproductive(boolean reproductive) {
        this.reproductive = reproductive;
    }
}
