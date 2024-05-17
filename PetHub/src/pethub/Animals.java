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

    public static boolean AddStory(){
        System.out.println("You might add a story,please write it: ");
        Scanner keyb=new Scanner(System.in);
        String story=keyb.nextLine();
        System.out.println("Your story is: " +story);
        return true;
    }

    
    public void AnimalInformation(){
        boolean sonuc1=AddStory();
        if(sonuc1){}
        System.out.println("Animal Species: " +animalSpecies);
        System.out.println("Animal age: " +animalAge);
    }
    
    public void wantsAnimal(){
        System.out.println("Which animal do you want to adopt? :");
        Scanner keyb=new Scanner(System.in);
        System.out.println("1-Dog\n2-Cat\n3-Bird\n4-Fish");
        int n1=keyb.nextInt();
        if(n1==1){      
        }
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


    public boolean isReproductive() {
        return reproductive;
    }

    public void setReproductive(boolean reproductive) {
        this.reproductive = reproductive;
    }

    
}
 