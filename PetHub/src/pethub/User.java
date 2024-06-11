package pethub;

public class User {
    
    protected String name;
    protected String surname;
    protected long phoneNumber;
    
    public User(String name, String surname, long phoneNumber){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;       
    }          
        //User Information
        public void Information(){
        System.out.println("Your name: " + name);
        System.out.println("Your surname: " + surname);
        System.out.println("Your phone number: " + phoneNumber);
    }
}
