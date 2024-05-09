package pethub;
public class Cat extends Animals{
    
    public Cat(String animalSpecies, int animalAge, String animalDetails, String animalStories) {
        super(animalSpecies, animalAge, animalDetails, animalStories);
    }

    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
