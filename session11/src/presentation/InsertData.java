package presentation;

import utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập vào tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào gender: ");
        boolean gender = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập vào phone: ");
        String phone = sc.nextLine();

        String sql = "INSERT INTO persons (full_name, age, gender, phone) VALUE ('" + name + "'," + age + "," + gender + ",'" + phone + "')";

        // batch()
        // try - catch - resources
        try (Connection con = DatabaseConnection.openConnection()) {
            Statement statement = con.createStatement();

            int row = statement.executeUpdate(sql);

            System.out.println("Số bản ghi: " + row);
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
