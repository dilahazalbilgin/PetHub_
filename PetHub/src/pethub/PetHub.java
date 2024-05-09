package pethub;
import java.util.Scanner;
public class PetHub {
    static boolean online=true;
    static int numberOfEntries=3;
    public static void main(String[] args) {  
        System.out.println("PETHUB'A HOŞGELDİNİZ!!! \nEĞER HESABINIZ VARSA 1'E BASARAK GİRİŞ YAPIN! \nHESABINIZ YOKSA 2'YE BASARAK YENİ HESAP OLUŞTURUN!");            
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
            
            
            Scanner scanner= new Scanner(System.in);
          int num=scanner.nextInt();
          if(num==1){        
        if(online){
       if(numberOfEntries>0){
           while(online){            
               System.out.println("Kullanıcı adınızı giriniz; ");
               String username1=scanner.nextLine();
               String username=scanner.nextLine();
               System.out.println("Parolanızı giriniz; ");
               String password=scanner.nextLine();    
               boolean sonuc = login(username,password);
               if(sonuc){
                   System.out.println("Uygulamaya giriş yapıldı");
                   break;
               }else{
               if(numberOfEntries==0){
               online=false;
               break;
               }
               }
               if(online==false){
                   System.out.println("Hak sayınız dolmuştur!!!");
               }
           }
       }else{
           System.out.println("Hak Sayınız Dolmuştur, hesabınız bloke oldu");
       }
       }}if(num==2){}      
       
       //Animal_WantingTo_Own a1= new Animal_WantingTo_Own("a","d",5);
            
         //   User[] users=new User[10];
          //  users[0]=a1;
       
       
      // for(User a:users){
         // a.A();
       
       //}
    }
    public void SignIn(){
        }
    
    public static boolean login(String username, String password){
    if(username.equals("hazal")&& password.equals("6161")){
    return true;
    }else if(username.equals("eje")&& password.equals("1907")){return true;}
    else{
        numberOfEntries--;
        System.out.println("Kullanıcı adı veya şifreniz hatalı!!!");
        if(numberOfEntries==0){
        online=false;
        }
        return false;}       
    } 
}

