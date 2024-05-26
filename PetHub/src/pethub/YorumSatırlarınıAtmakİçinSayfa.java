package pethub;
public class YorumSatırlarınıAtmakİçinSayfa {
    //Dog dog1=new Dog("golden",20,"It's a boy \nHe likes play ","I want a adopted");
        //Animals[] a=new Animals[1];
        //a[0]=dog1;
        //for (Animals k:a) {
            //System.out.println("Animal Species: " + dog1.getAnimalSpecies()+"\nAnimal Age: "+ dog1.animalAge+"\nAnimal Details: "+dog1.getAnimalDetails()+"\nAnimal Stories: "+ dog1.animalStories);
            //k.AddType();//}  
            
            //Animal_WantingTo_Own a1= new Animal_WantingTo_Own ("cesur","atak",61);
            //User[] b=new User[1];
            //b[0]=a1;
            //for(User t:b){
            //a1.informationOfAWTO();
            //}  
}
           /* Dog d1=new Dog("d",5,"d","d","k","d,",true);
            Cat a=new Cat("d",5,"d","d","k","d,",true);
            Fish b=new Fish("d",5,"d","d","k","d,",true);
            Bird c=new Bird("d",5,"d","d","k","d,",true);
            
            Animal_Owner d=new Animal_Owner("s","d",556,d1,a,b,c);
            User[] k=new User[2];
            d.AddPost();*/

            /*Dog d1=new Dog("d",5,"d",true);
            Cat a=new Cat("d",5,"d",true);
            Fish b=new Fish("d",5,"d",true);
            Bird c=new Bird("d",5,"d",true);
            
            Animal_WantingTo_Own d=new Animal_WantingTo_Own("s","d",556,d1,a,b,c);
            User[] k=new User[2];
            d.information();*/

/* app.insertUser("Ece", "Sarıyer", "ejess","05412681907", "1907");  
        app.insertUser("Kübra", "Batalgazi", "kubrabb", "05056487596","5151");  
        app.insertUser("İrem", "Karakurt", "iremkrkrt", "05326895060", "6060");
        app.insertUser("Hazal", "Bilgin", "hbilginn", "05326895061", "6161");
        
        app.insertAnimal("umut",3, "dog", "yes", "male", 1);*/


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

        //Select selectApp = new Select();
        //selectApp.selectAll();

   /* public void register(String name, String surname,String username, String password, String email) {
        //Creating user
        Insert app = new Insert();
        app.insertUser(name, surname, username, password, email);
    }*/




/*package pethub;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LogIn {
    static boolean online = true;
    static int numberOfEntries = 3;
    static Map<String, String> userDatabase = new HashMap<>(); // Kullanıcı bilgilerini saklamak için

    public static void SignUp(Scanner scanner) { 
Insert newUser=new Insert();
        System.out.println("Please enter the name");
        String name1 = scanner.nextLine();
        System.out.println("Please enter the surname");
        String name2 = scanner.nextLine();
        System.out.println("Please enter the username");
        String username = scanner.nextLine();
        System.out.println("Please enter the phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please create a password");
        String password = scanner.nextLine();
        
        newUser.insertUser(name1,name2,name3,name4,name5);  
        userDatabase.put(username, password);     
        System.out.println("Your account has been created successfully, please log in");
        SignIn(scanner);
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
                        System.out.println("Are you an animal owner or wanting to own an animal?\nIf you are an animal owner, please press 1\nIf you want to own an animal, please press 2");
                        int press = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        if (press == 1) {
                            System.out.println("Please enter the action you want to perform");
                            System.out.println("1-Add Post\n2-See Post");
                            int enter = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (enter == 1) {
                                Animal_Owner.AddPost();
                            } else if (enter == 2) {
                                // See Post functionality
                            } else {
                                System.out.println("Please press 1 or 2");
                            }
                        } else if (press == 2) {
                            System.out.println("Please enter the action you want to perform");
                            System.out.println("1-Add Info\n2-Want Animal");
                            int enter1 = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            if (enter1 == 1) {
                                Animal_WantingTo_Own.Add();
                            } else if (enter1 == 2) {
                                Animal_WantingTo_Own.WantsAnimal();
                            } else {
                                System.out.println("Please press 1 or 2");
                            }
                        }
                        break;
                    } else {
                        if (numberOfEntries == 0) {
                            online = false;
                            break;
                        }
                    }
                }
            } else {
                System.out.println("Your attempts have been exhausted, your account is blocked.");
            }
        }
    }

    public static boolean login(String username, String password) {
        // Kullanıcı adı ve şifreyi doğrulamak için
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            return true;
        } else {
            numberOfEntries--;
            System.out.println("Incorrect username or password!");
            if (numberOfEntries == 0) {
                online = false;
            }
            return false;
        }
    }
}*/

    /*static boolean online = true;
    static int numberOfEntries = 3;*/

//NewClass.connect();
        //Insert insertApp = new Insert();
        //insertApp.insertAnimal("boncuk",2, "cat", "yes", "female", 61);
        
 //Select selectApp = new Select();
     //app.selectAllUsers();
     //selectApp.selectAllAnimals();
     // app.selectAllPosts();
     //selectApp.selectAnimalBySpecies("dog");
     //selectApp.selectAnimalBySpecies("cat");
     //selectApp.selectAnimalBySpecies("fish");
     //selectApp.selectAnimalBySpecies("bird");



        /*Dog d=new Dog("g",6,"d","d,","s");
        Animals[] a=new Animals[1];
        a[0]=d;
        for (Animals k:a) {
            k.AnimalInformation();*/


        
        /*Dog d=new Dog("saj",5,"s","s",true);
        Cat c=new Cat("a",5,"s","s",false);  
        Fish f=new Fish("a",5,"s","s",false);
        Bird b=new Bird("a",5,"s","s",false);
        
        
        
            Animal_Owner a=new Animal_Owner("hakan","fidan",56431,d,c,f,b);
            User[] k=new User[2];
            for(User t:k){
            a.Information();*/

    /*Animals petmanager=new Animals();
    
    petmanager.add(new Dog("k",6,"k","j",false));
    petmanager.add(new Cat("k",6,"k","j",false));
    
        for (Gendered pet : petmanager) {
            pet.setGender("Female");
            pet.setReproductive(true);
            System.out.println("Pet gender: " + pet.getGender());
            System.out.println("Is reproductive: " + pet.isReproductive());
        }*/
    
        