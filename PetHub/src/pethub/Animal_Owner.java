package pethub;
import java.util.Scanner;

public class Animal_Owner extends User {
    private Dog Dog;
    private Cat Cat;
    private Fish Fish;
    private Bird Bird;

    public Animal_Owner(String name, String surname, long phoneNumber, Dog Dog, Cat Cat, Fish Fish, Bird Bird) {
        super(name, surname, phoneNumber);
        this.Dog = Dog;
        this.Cat = Cat;
        this.Fish = Fish;
        this.Bird = Bird;
    }

    public static boolean AddPost() {
        //Sql Connection
        DataBaseOperation newPost = new DataBaseOperation();
        DataBaseOperation selectPost = new DataBaseOperation();
        Scanner keyb = new Scanner(System.in);
        System.out.println("Do you want to see or add post");
        String answer1 = keyb.nextLine();

        if (answer1.equalsIgnoreCase("add")) {
            System.out.println("Which animal do you want to give to someone?");
            String answer2 = keyb.nextLine();
            System.out.println("Why do you want to give away your pet?: ");
            String answer3 = keyb.nextLine();
            System.out.println("Add detail: ");
            String answer4 = keyb.nextLine();

            newPost.insertPost(answer1, answer2, answer3, answer4);


            System.out.println("------Your Post-------");
            boolean result = Post(answer2, answer3, answer4);
            if (result) {
                System.out.println("Post added successfully.");
            }
        }
        else if(answer1.equalsIgnoreCase("see")){
           System.out.println("------Posts-------");
           selectPost.selectAllPosts();          
        }
        else {
            System.out.println("Your choice is invalid.");
        }
        return true;
    }

    public static boolean Post(String answer1, String answer2, String answer4) {
        if (answer1.equalsIgnoreCase("dog") || answer1.equalsIgnoreCase("cat") ||
            answer1.equalsIgnoreCase("fish") || answer1.equalsIgnoreCase("bird")) {
            Animals.AddStory();
            System.out.println("Animal is: " + answer1);
            System.out.println("Their owner give him/her because: " + answer2);
            System.out.println("Detail is: " + answer4);
        }
        return true;
    }
    //Overloading
    public static boolean Post(String answer1){
        if(answer1.equalsIgnoreCase("no")){
            System.out.println("You don't add a post");
        }
        return false;
    }

    //Override
    @Override
    public void Information() {
        //Composition
        super.Information();
        System.out.println(Dog);
        System.out.println(Cat);
        System.out.println(Fish);
        System.out.println(Bird);
    }
}
