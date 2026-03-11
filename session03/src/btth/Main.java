package btth;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        List<User> users = new ArrayList<>(
                List.of(
                        new User("SV001","m@gmail.com","m123456",true, LocalDate.of(2024,2,10)),
                        new User("SV002","a@gmail.com","a123456",false,LocalDate.of(2024, 9,9))
                )
        );

        List<User> filteredUser = userService.getVerifiedUser(users);
        filteredUser.stream().forEach(System.out::println);

        // chuyển dổi User -> PublicUser

        users.stream().map(
                (u) -> {
                    LocalDate now = LocalDate.now();
                    Period time = Period.between(u.getCreatedAt(),now);
                    System.out.println(time);

//                    int month = 0;
//                    if(time.getYears() != 0) {
//                        month += time.getYears() * 12;
//                    }
//                    if(time.getMonths() != 0) {
//                        month += time.getMonths();
//                    }

                    return new PublicUser(u.getId(),u.getEmail(), userService.classifyTier(time.toTotalMonths()));

                }
        ).forEach(System.out::println);

    }
}
