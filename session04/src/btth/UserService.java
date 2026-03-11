package btth;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        // kiểm tra
        if (user.getUsername().isBlank()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }
        // thêm mới
        users.add(user);
    }

    public User findUserById(int id) {
        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean isValidEmail(String email) {
//        String regex = "";
        return email.contains("@") &&
                (email.endsWith(".com") ||
                        email.endsWith(".vn")) &&
                email.indexOf("@") != 0;
    }
}
