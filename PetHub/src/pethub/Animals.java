package pethub;
import java.util.Scanner;

public abstract class Animals {
    protected String animalSpecies;
    protected int animalAge;
    protected String animalDetails;
    protected String animalStories;
    protected boolean reproductive;
    
    public Animals(String animalSpecies, int animalAge, String animalDetails, String animalStories) {
        this.animalSpecies = animalSpecies;
        this.animalAge = animalAge;
        this.animalDetails = animalDetails;
        this.animalStories = animalStories;
    }
    
    public void AddType(){
        System.out.println("You must add a type");
        Scanner keyb=new Scanner(System.in);
        String species=keyb.nextLine();
        System.out.println("species: " +species);
    }

    public void AddAge(){
        System.out.println("You must add an age");
        Scanner keyb=new Scanner(System.in);
        int age=keyb.nextInt();
        System.out.println("Age: " +age);
    }

    public void AddStory(){
        System.out.println("You must add a story");
        Scanner keyb=new Scanner(System.in);
        String story=keyb.nextLine();
        System.out.println("Story: " +story);
    }
    
    public static boolean AnimalInformation(String species,int age,String story){
        System.out.println("The species of this animal is : "+species);
        System.out.println("This animals age is: "+age);
        System.out.println("This animals story is: "+story);      
    return true;
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

    public String getAnimalDetails() {
        return animalDetails;
    }

    public void setAnimalDetails(String animalDetails) {
        this.animalDetails = animalDetails;
    }

    public String getAnimalStories() {
        return animalStories;
    }

    public void setAnimalStories(String animalStories) {
        this.animalStories = animalStories;
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
 