package pethub;

import java.util.Scanner;

public class Animal_Owner extends User {   
    private Dog Dog;
    private Cat Cat;
    private Fish Fish;
    private Bird Bird;
    public Animal_Owner(String name, String surname, long phoneNumber,Dog Dog,Cat Cat,Fish Fish,Bird Bird) {
        super(name, surname, phoneNumber);    
        this.Dog=Dog;
        this.Cat=Cat;
        this.Fish=Fish;
        this.Bird=Bird;       
    }       
    public void AddPost(){
        System.out.println("If you want add a post please press 1. ");
        Scanner keyb=new Scanner(System.in);
        int answer=keyb.nextInt();
        if(answer==1){
        System.out.println("Why do you want to give away your pet?: ");
        String answer3=keyb.nextLine();
        String answer2=keyb.nextLine();
        
            System.out.println("If you want to see your post , you press 6.");
            int press=keyb.nextInt();
            if(press==6){
                boolean sonuc=Post(answer,answer2);
                 if(sonuc){
              }
             }}
    }   
    
    public static boolean Post(int answer,String answer2){
        if(answer==1){
            System.out.println("Your post is: " + answer2 );
        return true;}
        return false;
    }
    
    @Override
    public void information(){
        super.information();
        System.out.println(Dog);
        System.out.println(Cat);
        System.out.println(Fish);
        System.out.println(Bird);
    }
    
    public Cat getCat() {
        return Cat;
    }

    public void setCat(Cat Cat) {
        this.Cat = Cat;
    }

    public Fish getFish() {
        return Fish;
    }

    public void setFish(Fish Fish) {
        this.Fish = Fish;
    }

    public Bird getBird() {
        return Bird;
    }

    public void setBird(Bird Bird) {
        this.Bird = Bird;
    }
   
     public Dog getDog() {
        return Dog;
    }

    public void setDog(Dog Dog) {
        this.Dog = Dog;
    }  
}
