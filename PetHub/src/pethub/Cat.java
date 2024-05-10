package pethub;
public class Cat extends Animals implements Gendered{
    private  String breed;
    private String gender;
    private boolean reproductive;
    
    public Cat(String animalSpecies, int animalAge, String animalDetails, String animalStories, String breed, String gender, boolean reproductive) {
        super(animalSpecies, animalAge, animalDetails, animalStories);
        this.breed = breed;
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void makeSound() {
        System.out.println("cat meows");
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
