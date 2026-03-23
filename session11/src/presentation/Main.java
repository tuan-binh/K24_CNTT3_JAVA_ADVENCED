package presentation;

import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chuẩn bị kết nối");

        // Mở kết nối
        Connection con = DatabaseConnection.openConnection();

        // câu lệnh sql
        String sql = "SELECT * FROM persons";

        try {
            // tạo đối tượng statement
            Statement statement = con.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Full Name: "+rs.getString("full_name"));
                System.out.println("Age: "+rs.getInt("age"));
                System.out.println("Gender: "+(rs.getBoolean("gender") ? "Nam" : "Nữ"));
                System.out.println("Phone: "+rs.getString("phone"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Đã kết nối thành công");
    }
}