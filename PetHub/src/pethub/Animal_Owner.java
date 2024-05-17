package pethub;
import java.util.Scanner;
public class Animal_Owner extends User {   
    private Dog Dog;
    private Cat Cat;
    private Fish Fish;
    private Bird Bird;
    public Animal_Owner(String name, String surname, long phoneNumber,Dog Dog,Cat Cat,Fish Fish,Bird Bird) {
        super(name, surname, phoneNumber);    
        this.Dog= Dog;
        this.Cat=Cat;
        this.Fish=Fish;
        this.Bird=Bird;       
    }       
    public void AddPost(){
        System.out.println("Do you want add a post? ");
        Scanner keyb=new Scanner(System.in);
        String answer=keyb.nextLine();
        if(answer.equals("yes")){
        System.out.println("Which animal do you want to adopt?");
        String answer1=keyb.nextLine();
        if(answer1.equalsIgnoreCase("dog")){
            
        }
        System.out.println("Why do you want to give away your pet?: ");
        String answer2=keyb.nextLine();
        System.out.println("Add detail?");
        String answer0=keyb.nextLine();
        String answer4=keyb.nextLine();
        
            System.out.println("Do you want to see your post?");
            String press=keyb.nextLine();
            if(press.equals("yes")){
                boolean result=Post(answer,answer2,answer1,answer4);
                 if(result){
              }
             }}
    }      
    public static boolean Post(String answer,String answer2,String answer1,String answer4){
        if(answer.equals("yes")){
            System.out.println("You adopt a " +answer1);
            System.out.println("Your post is: " + answer2 );
            System.out.println("Detail: "+answer4 );
        return true;
        }
        return false;
    }
    
    @Override
    public void information(){
        super.information();
        System.out.println(Dog);
        System.out.println(Cat);
        System.out.println(Fish);
        System.out.println(Bird);
        Scanner keyb=new Scanner(System.in);
        System.out.println("If you want to see your post press 1");
        String press1=keyb.nextLine();
        //if(press1==1){
        //boolean sonuc=Post();
        }
        
   // }
    
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
