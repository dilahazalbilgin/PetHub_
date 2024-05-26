package pethub;
public class Cat extends Animals implements Gendered{
    private String gender;
    private boolean reproductive;
    
    public Cat(String name, int animalAge,String animalSpecies, String gender, boolean reproductive) {
        super(name, animalSpecies, animalAge);
        this.gender = gender;
        this.reproductive = reproductive;
    }

    @Override
    public void makeSound() {
        System.out.println("cat meows");
    }
    @Override
    public String toString() {
        return "Cat{name='" + name + "', age=" + animalAge + ", Species='" + animalSpecies + "', gender='" + gender + "', reproductive=" + reproductive + "}";
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
