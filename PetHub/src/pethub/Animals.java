package pethub;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Abstract class
public abstract class Animals {
    private List<Gendered> pets;
    protected String name;
    protected String animalSpecies;
    protected int animalAge;
    protected boolean reproductive;

    public Animals(String name,String animalSpecies, int animalAge) {
        this.name=name;
        this.animalSpecies = animalSpecies;
        this.animalAge = animalAge;
        //ArrayList
        pets=new ArrayList<>();
       List<Gendered> pets = new ArrayList<>();     
    }

    public static boolean AddStory(){
        System.out.println("Do you want to add a story");
        Scanner keyb=new Scanner(System.in);
        String answer=keyb.nextLine();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("Please write a story:");
             String story=keyb.nextLine();
             System.out.println("Your story is: " +story);
        }else{System.out.println("Story doesn't have");}
        return true;
    }
    
    public static boolean AddAnimal(){
        DataBaseOperation Animal=new DataBaseOperation();
        Scanner keyb=new Scanner(System.in);
        System.out.println("What is the name of the animal ");
        String name=keyb.nextLine();
        System.out.println("What is the age of the animal ");
        int age=keyb.nextInt();
        System.out.println("What is the species of the animal");
        String a=keyb.nextLine();
        String species=keyb.nextLine();
        System.out.println("Can it reproductive?");
        String reproductive=keyb.nextLine();
        System.out.println("What is the gender of the animal");
        String gender=keyb.nextLine();
        Animal.insertAnimal(name, age, species, reproductive, gender);
        System.out.println("----Your animal----\nname:"+name+"\nage: "+age+"\nspecies: "+ species+"\nreproductive: "+reproductive+"\ngender: "+gender);       
        return true;
    }
    
    public void AnimalInformation(){
        System.out.println("Animal Species: " +animalSpecies);
        System.out.println("Animal age: " +animalAge);
        //Interface       
        pets.add(new Dog(name, animalAge, animalSpecies, "gender", reproductive));
        for (Gendered pet : pets) {
            pet.setGender("Female");
            pet.setReproductive(true);
            System.out.println("Pet gender: " + pet.getGender());
            System.out.println("Is reproductive: " + pet.isReproductive());
        } 
    }
    
    //Abstract Method
    public abstract void MakeSound();
    
    public void InitializePets() {
        for (Gendered pet : pets) {
            pet.setGender("Female");
            pet.setReproductive(true);
        }
    }
    public void PrintPetDetails() {
        for (Gendered pet : pets) {
            System.out.println("Pet gender: " + pet.getGender());
            System.out.println("Is reproductive: " + pet.isReproductive());
        }
    }
  
    
}
 