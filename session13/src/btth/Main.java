package btth;

import utils.DataConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection con = DataConnect.openConnect();
        try{
            con.setAutoCommit(false);
            //Lập hoá đơn
            String sqlCreate = """
                    INSERT INTO INVOICES (PATIENTS_id, amount, create_date)
                    VALUES (?, ?, ?)
                    """;
            //Cập nhật hồ sơ bệnh nhân
            String sqlUpdate = """
                    UPDATE PATIENTS SET PATIENT_name = ? AND PATIENTS_status = ? WHERE PATIENTS_id = ?
                    """;

            //Giải phóng giường bệnh
            String sqlUpdateBed = """
                    UPDATE BEDS SET BEDS_status = ? WHERE BEDS_id = ?
                    """;

            PreparedStat

        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }
}
