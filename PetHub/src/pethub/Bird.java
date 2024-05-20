package pethub;
public class Bird extends Animals implements Gendered{
    private String gender;
    private boolean reproductive;
    
    public Bird(String name,String animalSpecies, int animalAge, String gender, boolean reproductive) {
        super(name, animalSpecies, animalAge);
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void makeSound() {
        System.out.println("bird sings");
    }

    @Override
    public String getGender() {
         return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender=gender;
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
