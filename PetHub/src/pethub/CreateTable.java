package pethub;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class CreateTable {  
   
    public static void createNewTable() {  
        String url = "jdbc:sqlite:C:/sqlite/SSSIT.db";  
          
        String userTable = "CREATE TABLE IF NOT EXISTS User (\n"  
                + " id INTEGER PRIMARY KEY,\n"  
                + " name TEXT NOT NULL,\n"  
                + " surname TEXT NOT NULL,\n"
                + " username TEXT NOT NULL,\n"
                + " phoneNumber TEXT NOT NULL,\n"
                + " password TEXT NOT NULL\n"
                + ");";  
        
        String animalTable = "CREATE TABLE IF NOT EXISTS Animal(\n"
                + " id INTEGER PRIMARY KEY,\n"
                + " name TEXT NOT NULL,\n"
                + " age INTEGER,\n"
                + " animalSpecies TEXT NOT NULL,\n"
                + " reproductive TEXT NOT NULL,\n"
                + " gender TEXT NOT NULL,\n"
                + " owner_id INTEGER,\n"
                + " FOREIGN KEY (owner_id) REFERENCES User(id)\n"
                + ");";
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(userTable); 
            stmt.execute(animalTable);
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }}



}