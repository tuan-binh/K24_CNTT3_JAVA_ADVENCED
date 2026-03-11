package btth;

import java.util.List;

public class UserService {
    // yêu cầu 1: lọc user
    public List<User> getVerifiedUser(List<User> users) {
        return users.stream().filter(User::getVerified).toList();
    }

    // yêu cầu 2: phân loại
    public Tier classifyTier(long month) {
        if(month > 24) {
            return new Gold("gold");
        } else if (month > 12) {
            return new Silver("silver");
        } else {
            return new Bronze("bronze");
        }
    }
}
