package pethub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1 {
    public static Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:C:/sqlite/SSSIT.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}