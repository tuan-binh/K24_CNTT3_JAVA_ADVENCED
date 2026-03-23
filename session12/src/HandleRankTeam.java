import utils.DataConnect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class HandleRankTeam {
    public static void main(String[] args) {
        try (Connection con = DataConnect.openConnect()) {

            CallableStatement call = con.prepareCall("{ call proc_update_rank_football(?,?) }");

            // set tham số
            call.setInt(1,1);
            call.setInt(2,10);

            // thực thi câu lệnh
            int row = call.executeUpdate();
            if(row > 0) {
                System.out.println("Cập nhật thành công");
            } else {
                System.err.println("Cập nhật thất bại");
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
