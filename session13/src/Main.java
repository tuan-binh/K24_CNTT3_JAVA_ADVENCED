import utils.DataConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        /**
         * Hưng thực hiện 2 lệnh MUA 10000000 (-)
         * Hưng thực hiện 1 lệnh BÁN 5000000 (+)
         * */
        Connection con = DataConnect.openConnect();
        try {
            // B1 : set auto commit = false
            con.setAutoCommit(false);
            // B2: Thực hiện các câu lệnh SQL
            String sqlBuy = """
                    UPDATE accounts SET balance = balance - ? WHERE id = ?
                    """;

            String sqlSell = """
                    UPDATE accounts SET balance = balance + ? WHERE id = ?
                    """;

            String sqlTransfers = """
                    INSERT INTO transfers (type, amount, account_id)
                    VALUES
                    (?, ?, ?)
                    """;

            int accountId = 1;
            int amountBuy = 10000000;
            int amountSell = 5000000;

            PreparedStatement preparedBuy = con.prepareStatement(sqlBuy);
            preparedBuy.setDouble(1, amountBuy);
            preparedBuy.setInt(2, accountId);
            PreparedStatement preparedSell = con.prepareStatement(sqlSell);
            preparedSell.setDouble(1, amountSell);
            preparedSell.setInt(2, accountId);
            PreparedStatement preparedTransfer = con.prepareStatement(sqlTransfers);
            preparedTransfer.setString(1, "BUY");
            preparedTransfer.setDouble(2, amountBuy);
            preparedTransfer.setDouble(3, accountId);

            // 2 lệnh mua 10.000.000
            preparedBuy.executeUpdate();
            preparedBuy.executeUpdate();

            preparedTransfer.executeUpdate();
            preparedTransfer.executeUpdate();

            int result = 10 / 0;
            // 1 lệnh bán 5.000.000
            preparedSell.executeUpdate();

            preparedTransfer.clearParameters();
            preparedTransfer.setString(1, "SELL");
            preparedTransfer.setDouble(2, amountSell);
            preparedTransfer.setDouble(3, accountId);
            preparedTransfer.executeUpdate();


            // B3: Thực hiện Commit
            con.commit();
        } catch (SQLException e) {
            // B3: Nếu lỗi thì rollback
            con.rollback();
            System.err.println(e.getMessage());
        } finally {
            // B4: Thực hiện đóng kết nối
            con.close();
        }
        /**
         * Bài toán:
         * - Chuyển tiền
         * A -> B
         * - csdl:
         *   + account
         *
         *   + transfer
         *
         * - test case
         *   + chuyển thành công
         *   + số dư không đủ
         *   + chuyển số tiền rớt mạng (giữa trùng bị lỗi)
         * */
    }
}