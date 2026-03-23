import utils.DataConnect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class HandleSearchRank {
    public static void main(String[] args) {
        try (Connection con = DataConnect.openConnect()) {

            CallableStatement call = con.prepareCall("{ call proc_search_by_rank(?,?) }");

            call.setInt(1, 10);
            // register
            call.registerOutParameter(2, Types.VARCHAR);
            // execute
            call.executeQuery();
            // get value
            String name = call.getString(2);
            System.out.println("Đội bóng tôi yêu: " + name);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}
