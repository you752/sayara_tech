package javaapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    private static final String URL =
            "jdbc:mysql://localhost:3306/sayaratech";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver NOT FOUND!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }
        return null;
    }
}