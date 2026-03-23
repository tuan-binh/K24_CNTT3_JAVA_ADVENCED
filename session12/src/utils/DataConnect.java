package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
    // driver
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    // url
    private final static String URL = "jdbc:mysql://localhost:3307/rikkei_hospital";
    // username
    private final static String USER = "root";
    // password
    private final static String PASSWORD = "123456";

    public static Connection openConnect() {
        Connection connection;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
