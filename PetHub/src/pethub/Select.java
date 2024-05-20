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
   
  
    public void selectAll(){  
        String sql = "SELECT * FROM user";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set  
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
      
     


}  