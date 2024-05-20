package pethub;

public class Dog extends Animals implements Gendered {
    private String gender;
    private boolean reproductive;

    public Dog(String name,String animalSpecies, int animalAge,String gender, boolean reproductive) {
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
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public String getGender() {
        return gender;
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
