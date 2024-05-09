package pethub;
public class Dog extends Animals implements Gendered {
    
    public Dog(String animalSpecies, int animalAge, String animalDetails, String animalStories) {
        super(animalSpecies, animalAge, animalDetails, animalStories);
        
        System.out.println("Dog said HAV");
        
    }

    @Override
    public String getGender() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void makeSound(){}
}
