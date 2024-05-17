package pethub;

import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.SQLException;  
   
public class NewClass3 {  
   
    private Connection connect() {  
        String url = "jdbc:sqlite:C://sqlite/SSSIT.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void insert(String name, double capacity) {  
        String sql = "INSERT INTO employees(name, capacity) VALUES(?,?)";  
   
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setString(1, name);  
            pstmt.setDouble(2, capacity);  
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
   
    public static void main(String[] args) {  
   
        NewClass3 app = new NewClass3();  
        // insert three new rows  
        app.insert("Eje", 61);  
        app.insert("Kübra", 1461);  
        app.insert("İrem", 6161);  
    }  
   
}
