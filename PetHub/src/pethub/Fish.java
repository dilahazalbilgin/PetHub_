package pethub;
public class Fish extends Animals {
    
    public Fish(String animalSpecies, int animalAge, String animalDetails, String animalStories) {
        super(animalSpecies, animalAge, animalDetails, animalStories);
    }

    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
