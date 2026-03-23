package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final static String URL = "jdbc:mysql://localhost:3307/medicalAppointmentDB?createDatabaseIfNotExist=true";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "123456";

    // mở kết nối
    public static Connection openConnection() {
        Connection con;
        try {
            Class.forName(DRIVER); // Khai báo cho java biết driver

            // mở kết nối
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return con;
    }

    // hàm đóng kết nối
}
