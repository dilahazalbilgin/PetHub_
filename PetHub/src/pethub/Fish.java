package pethub;
public class Fish extends Animals implements Gendered{
    
    private String breed;
    private String gender;
    private boolean reproductive;
    
    public Fish(String animalSpecies, int animalAge, String breed, String gender, boolean reproductive) {
        super(animalSpecies, animalAge);
        this.breed = breed;
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void makeSound() {
        System.out.println("fish doesnt make noise"); 
    }

    @Override
    public String getGender() {
         return gender;
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
