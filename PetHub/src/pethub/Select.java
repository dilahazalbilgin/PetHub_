package pethub;

import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  
   
public class Select {  
   
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:C:/sqlite/SSSIT.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
    
    public void selectAllUsers(){  
        String sql = "SELECT * FROM User";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
              
            while (rs.next()) {  
                System.out.println(rs.getInt("id") +  "\t" +   
                                   rs.getString("name") + "\t" +  
                                   rs.getString("surname") + "\t" +
                                   rs.getString("username") + "\t" +
                                   rs.getString("phoneNumber") + "\t" +
                                   rs.getString("password") + "\t");
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }

    
    public void selectAllAnimals() {  
        String sql = "SELECT * FROM Animal";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
              
            while (rs.next()) {  
                System.out.println(rs.getInt("id") +  "\t" +   
                                   rs.getString("name") + "\t" +  
                                   rs.getInt("age") + "\t" +
                                   rs.getString("animalSpecies") + "\t" +
                                   rs.getString("reproductive") + "\t" +
                                   rs.getString("gender") + "\t" +
                                   rs.getInt("owner_id") + "\t");
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }

    
    public void selectAllPosts() {  
        String sql = "SELECT * FROM Post";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
            while (rs.next()) {  
                System.out.println(rs.getInt("id") +  "\t" +   
                                   rs.getString("yes_no") + "\t" +  
                                   rs.getString("which_animal") + "\t" +
                                   rs.getString("why") + "\t" +
                                   rs.getString("add_detail") + "\t");
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
}
