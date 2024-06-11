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

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    

}
