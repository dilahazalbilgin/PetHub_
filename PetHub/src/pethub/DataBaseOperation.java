package pethub;

import java.sql.Connection;  
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;  
import java.sql.Statement;
   
public class DataBaseOperation{    
    
    public Connection conn = null;  
    String url = "jdbc:sqlite:C:/sqlite/SSSIT.db"; 
    
    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
     public void insertUser(String name, String surname, String username, String phoneNumber, String password) {
        String sql = "INSERT INTO User(name, surname, username, phoneNumber, password) VALUES(?,?,?,?,?)";

        try (Connection conn = this.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, surname);
            pstmt.setString(3, username);
            pstmt.setString(4, phoneNumber);
            pstmt.setString(5, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertAnimal(String name, int age, String animalSpecies, String reproductive, String gender, int ownerId) {
        String sql = "INSERT INTO Animal(name, age, animalSpecies, reproductive, gender, owner_id) VALUES(?,?,?,?,?,?)";

        try (Connection conn = this.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, animalSpecies);
            pstmt.setString(4, reproductive);
            pstmt.setString(5, gender);
            pstmt.setInt(6, ownerId);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertPost(String yes_no, String whichAnimal, String why, String addDetail) {
        String sql = "INSERT INTO Post(yes_no, which_animal, why, add_detail) VALUES(?,?,?,?)";

        try (Connection conn = this.connect(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, yes_no);
            pstmt.setString(2, whichAnimal);
            pstmt.setString(3, why);
            pstmt.setString(4, addDetail);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void selectAllUsers(){  
        String sql = "SELECT * FROM User";  
          
        try {  
            this.conn = DriverManager.getConnection(url);  
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
            this.conn = DriverManager.getConnection(url);  
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
    
public void selectAnimalBySpecies(String species) {  
    String sql = "SELECT * FROM Animal WHERE animalSpecies = '" + species + "'";  
      
    try {  
        this.conn = DriverManager.getConnection(url);  
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
            this.conn = DriverManager.getConnection(url);  
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