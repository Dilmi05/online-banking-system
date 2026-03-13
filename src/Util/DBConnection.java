package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Replace these with your database info
    private static final String URL = "jdbc:mysql://localhost:3306/Bankingsystem";
    private static final String USER = "root";
    private static final String PASSWORD = "ama610156";

    // Method to get a connection
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Connect to the database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Failed to connect to database!");
            e.printStackTrace();
        }
        return connection;
    }

    // Test the connection
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();
        if (conn != null) {
            System.out.println("Connection is working!");
        }
    }
}