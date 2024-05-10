package pethub;

public class Dog extends Animals implements Gendered {
    private String breed;
    private String gender;
    private boolean reproductive;

    public Dog(String animalSpecies, int animalAge, String animalDetails, String animalStories, String breed, String gender, boolean reproductive) {
        super(animalSpecies, animalAge, animalDetails, animalStories);
        this.breed = breed;
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public String getGender() {
        return gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
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
