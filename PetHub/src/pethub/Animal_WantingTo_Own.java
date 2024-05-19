package pethub;

import java.util.Scanner;

public class Animal_WantingTo_Own extends User{ 
    private Dog Dog;
    private Cat Cat;
    private Fish Fish;
    private Bird Bird;
    protected int petNumber;   
    public Animal_WantingTo_Own(String name, String surname, long phoneNumber,Dog Dog,Cat Cat,Fish Fish,Bird Bird) {
        super(name, surname, phoneNumber);
        this.Dog= Dog;
        this.Cat=Cat;
        this.Fish=Fish;
        this.Bird=Bird; 
    }

    public Animal_WantingTo_Own( int petNumber, String name, String surname, long phoneNumber) {
        super(name, surname, phoneNumber);
        this.petNumber = petNumber;
    }  
    public static boolean add(){  
        System.out.println("what is your gender?");
        Scanner keyb=new Scanner(System.in);
        String gender1=keyb.nextLine();
        System.out.println("do you have an animal?");
        String a1=keyb.nextLine();
        if(a1.equals("yes")){
            System.out.println("Please write animals");
            String a2=keyb.nextLine();
            System.out.println("your animals: " + a2);
        }else{System.out.println("First animalll");}
        System.out.println("Your gender is: " +gender1);
        return true;
    }   
        public static boolean wantsAnimal(){
        System.out.println("Which animal do you want to adopt?: ");
        Scanner keyb=new Scanner(System.in);
        System.out.println("1-Dog\n2-Cat\n3-Bird\n4-Fish");
        int n1=keyb.nextInt();
        if(n1==1){
            System.out.println("Do you want to see dog's post?");
            String answer0=keyb.nextLine();
            String cevap=keyb.nextLine();
            if(cevap.equalsIgnoreCase("yes")){
            Animal_Owner.Post(answer0, answer0, answer0, answer0);
            
            //Animal_Owner.Post(answer0, answer2, answer1, answer4);
            }             
        }else if(n1==2){
        }else if(n1==3){
        }else if(n1==4){
        }
        return true;
    }
    @Override
    public void information(){
        boolean sonuc2=wantsAnimal();
        if(sonuc2){}
        boolean sonuc1=add();
        if(sonuc1){}
        
        super.information();
        
    }
    public int getPetNumber() {
        return petNumber;
    }

    public void setPetNumber(int petNumber) {
        this.petNumber = petNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public long getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Dog getDog() {
        return Dog;
    }

    public void setDog(Dog Dog) {
        this.Dog = Dog;
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
    }
