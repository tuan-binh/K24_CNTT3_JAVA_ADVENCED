package btth;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserManagement {

    public User createUser( String fullName, String email, String role, String status ) {
        Supplier<User> handleCreateUser = () -> {
            return new User(
                    fullName,
                    email,
                    role,
                    status
            );
        };
        return handleCreateUser.get();
    }

    public boolean checkStatus(User user) {
        Predicate<User> checkStatus = (u) -> u.getStatus().equals("ACTIVE");
        return checkStatus.test(user);
    }

    public String getEmailByUser(User user) {
//        Function<User,String> getEmail = (u) -> u.getEmail();
        Function<User,String> getEmail = User::getEmail;
        return getEmail.apply(user);
    }

}
