package btth;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        UserManagement userManagement = new UserManagement();
        // yêu cầu 1: tạo user
        User haquanghuy = userManagement.createUser("Hà Quang Huy","huy@gmail.com","USER","INACTIVE");
        // yêu cầu 2: kiểm tra username hợp lệ hay không
        Boolean isUsername = IUserAccount.isStandardLength(haquanghuy.getFullName());
        System.out.println(isUsername);
        // yêu cầu 3: lấy email của user
        String email = userManagement.getEmailByUser(haquanghuy);
        System.out.println(email);
        // yêu cầu 4: tạo danh sách user
        // Phan Phước Anh
        // Nguyễn Trần Bảo Khánh
        // Nguyễn Trấn Thành
        // Bàng Trọng Tú

        List<User> users = new ArrayList<>(
                List.of(
                        userManagement.createUser("Phan Phước Anh","boycodon@gmail.com","USER","ACTIVE"),
                        userManagement.createUser("Nguyễn Trần Bảo Khánh","khanhsky@gmail.com","LEADER","ACTIVE"),
                        userManagement.createUser("Nguyễn Trấn Thành","thanhcry@gmail.com","USER","ACTIVE"),
                        userManagement.createUser("Bành Trọng Tú","tuchuatay@gmail.com","SUB_LEADER","INACTIVE")
                )
        );
        Consumer<User> userConsumer = System.out::println;
        users.forEach(userConsumer);
    }
}
