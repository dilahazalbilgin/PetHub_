package pethub;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class CreateTable {  
   
    public static void createNewTable() {  
        String url = "jdbc:sqlite:C:/sqlite/SSSIT.db";  
          
        String sql = "CREATE TABLE IF NOT EXISTS User (\n"  
                + " id INTEGER PRIMARY KEY,\n"  
                + " name TEXT NOT NULL,\n"  
                + " surname TEXT NOT NULL,\n"
                + " username TEXT NOT NULL,\n"
                + " phoneNumber TEXT NOT NULL,\n"
                + " password TEXT NOT NULL\n"
                + ");";  
          
        try{  
            Connection conn = DriverManager.getConnection(url);  
            Statement stmt = conn.createStatement();  
            stmt.execute(sql);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }}}