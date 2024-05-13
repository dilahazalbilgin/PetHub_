package pethub;
import java.util.Scanner;
public class PetHub {
    static boolean online=true;
    static int numberOfEntries=3;
    public static void main(String[] args) {  
        System.out.println("PETHUB'A HOŞGELDİNİZ!!! \nEĞER HESABINIZ VARSA 1'E BASARAK GİRİŞ YAPIN! \nHESABINIZ YOKSA 2'YE BASARAK YENİ HESAP OLUŞTURUN!");
        
        Dog d1=new Dog("d",5,"d","d","k","d,",true);
            Cat a=new Cat("d",5,"d","d","k","d,",true);
            Fish b=new Fish("d",5,"d","d","k","d,",true);
            Bird c=new Bird("d",5,"d","d","k","d,",true);
            
            Animal_Owner d=new Animal_Owner("s","d",556,d1,a,b,c);
            User[] k=new User[2];
            d.AddPost();
            
        
    }
    public static boolean SignIn(int giris){
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
        return false;
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


