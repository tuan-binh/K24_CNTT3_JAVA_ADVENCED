import utils.DataConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Statement
        //     |
        // PrepareStatement
        //     |
        // CallableStatement
        Scanner sc = new Scanner(System.in);

        try (Connection con = DataConnect.openConnect()) {

            // viết sql
            String sql = "INSERT INTO favourite_team (team_name,price,owner) VALUES (?,?,?)";
            PreparedStatement prepare = con.prepareStatement(sql);
            // set các tham số
            for (int i = 0; i < 3; i++) {
                System.out.println("Nhập vào tên đội bóng tôi yêu: ");
                prepare.setString(1,sc.nextLine());
                System.out.println("Nhập vào giá trị đội hình: ");
                prepare.setDouble(2,Double.parseDouble(sc.nextLine()));
                System.out.println("Nhập tên chủ tịch: ");
                prepare.setString(3,sc.nextLine());
                // thực thi
                int row = prepare.executeUpdate();
                if(row > 0) {
                    System.out.println("Thêm thành công đội bóng tôi yêu");
                } else {
                    System.err.println("Có lỗi xảy ra");
                }
                // xoá thông tin tham số cũ
                prepare.clearParameters();
            }




        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}