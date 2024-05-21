package pethub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

    private Connection connect() {
        String url = "jdbc:sqlite:C:/sqlite/SSSIT.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
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
}
