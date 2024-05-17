package pethub;
import java.util.Scanner;

public abstract class Animals {
    protected String animalSpecies;
    protected int animalAge;
    protected boolean reproductive;
    
    public Animals(String animalSpecies, int animalAge) {
        this.animalSpecies = animalSpecies;
        this.animalAge = animalAge;
    }
    
    public static boolean AddType(){
        System.out.println("You must add a type");
        Scanner keyb=new Scanner(System.in);
        String species=keyb.nextLine();
        System.out.println("species: " +species);
        return true;
    }

    public static boolean AddAge(){
        System.out.println("You must add an age");
        Scanner keyb=new Scanner(System.in);
        int age=keyb.nextInt();
        System.out.println("Age: " +age);
        return true;
    }

    public static boolean AddStory(){
        System.out.println("You must add a story");
        Scanner keyb=new Scanner(System.in);
        String story=keyb.nextLine();
        System.out.println("Story: " +story);
        return true;
    }
    
    public void Detail(){
    
    }
    
    public void AnimalInformation(){
        System.out.println("Animal Species: " +animalSpecies);
        System.out.println("Animal age: " +animalAge);
        System.out.println("Animal");
    }
    
    public abstract void makeSound();
    
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

    public void wantsAnimal(){
        System.out.println("Which animal do you want to adopt? :");
        Scanner keyb=new Scanner(System.in);
        System.out.println("1-Dog\n2-Cat\n3-Bird\n4-Fish");
        int n1=keyb.nextInt();
        if(n1==1){      
        }
    }

    public boolean isReproductive() {
        return reproductive;
    }

    public void setReproductive(boolean reproductive) {
        this.reproductive = reproductive;
    }

    
}
 