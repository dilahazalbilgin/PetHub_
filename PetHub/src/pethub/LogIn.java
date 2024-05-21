package pethub;
import java.util.Scanner;
import static pethub.PetHub.numberOfEntries;
import static pethub.PetHub.online;

public class LogIn {
    //deneme
    
    public void register(String name, String surname,String username, String password, String email) {
        //Creating user
        Insert app = new Insert();
        app.insertUser(name, surname, username, password, email);
    }
    
    public  static void SignUp(Scanner scanner) { 
        Insert u1=new Insert();
        System.out.println("Enter the name");
        String name1=scanner.nextLine();
        System.out.println("Enter the surname");
        String name2=scanner.nextLine();
        System.out.println("Enter the username");
        String name3=scanner.nextLine();
        System.out.println("Enter the phone");
        String name4=scanner.nextLine();
        System.out.println("Enter the password");
        String name5=scanner.nextLine();
        
         u1.insertUser(name1,name2,name3,name4,name5);
        
        
        /*System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("Enter your phone number:");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Boş satırı tüket

        User newUser = User.createAccount(name, surname, phoneNumber);
        System.out.println("Account created successfully!");
        newUser.Information();*/
    }

    public static void SignIn(Scanner scanner) {
        if (online) {
            if (numberOfEntries > 0) {
                while (online) {
                    System.out.println("Enter your username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter your password:");
                    String password = scanner.nextLine();
                    boolean result = login(username, password);
                    if (result) {
                        System.out.println("Login successful!");
                        System.out.println("Are you animal owner or animal wanting to own?\nIf you animal owner please press to 1\nIf you want to animal own please press to 2");
                        int press=scanner.nextInt();
                        if(press==1){
                            System.out.println("Please enter the action you are the perform");
                            System.out.println("1-Add Post\n2-See Post");
                            int enter=scanner.nextInt();
                            if(enter==1){Animal_Owner.AddPost();}
                            else if(press==2){
                             }
                            else{System.out.println("Please press 1 or 2 ");}
                        }else if(press==2){
                            System.out.println("Please enter the action you are the perform");
                            System.out.println("1-Add Info\n2-Want Animal");
                            int enter1=scanner.nextInt();
                            if(enter1==1){Animal_WantingTo_Own.Add();}
                            else if(enter1==2){Animal_WantingTo_Own.WantsAnimal();}
                            else{System.out.println("Please press 1 or 2 ");}
                        }
                        break;
                    } else {
                        if (numberOfEntries == 0) {
                            online = false;
                            break;
                        }
                    }
                    if (!online) {
                        System.out.println("Your attempts have been exhausted!");
                    }
                }
            } else {
                System.out.println("Your attempts have been exhausted, your account is blocked.");
            }
        }
    }

    public static boolean login(String username, String password) {
        if (username.equals("hazal") && password.equals("6161")) {
            return true;
        } else if (username.equals("eje") && password.equals("1907")) {
            return true;
        } else {
            numberOfEntries--;
            System.out.println("Incorrect username or password!");
            if (numberOfEntries == 0) {
                online = false;
            }
            return false;

        }}}