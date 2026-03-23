package btth;

import utils.DataConnect;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Date;

public class HospitalBusiness {
    public void updateMedicineStock(int id, int addQuantity) {
        try (Connection con = DataConnect.openConnect()) {
            PreparedStatement prepared = con.prepareStatement(
                    "UPDATE medicines SET stock = stock + ? WHERE id = ?"
            );
            prepared.setInt(1, addQuantity);
            prepared.setInt(2, id);
            int row = prepared.executeUpdate();
            if (row > 0) {
                System.out.println("Cập nhật thành công");
            } else {
                System.err.println("Cập nhật thất bại");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void getDailyRevenue(Date date) {
        try (Connection con = DataConnect.openConnect()) {

            CallableStatement call = con.prepareCall("{ call proc_get_daily_revenue(?,?) }");
            call.setDate(1, new java.sql.Date(date.getTime()));
            call.registerOutParameter(2, Types.DOUBLE);

            call.executeQuery();

            Double revenue = call.getDouble(2);

            System.out.println(revenue);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
