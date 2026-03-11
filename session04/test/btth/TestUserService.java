package btth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUserService {

    UserService userService;
    // yêu cầu: sử dụng beforeEach để khởi tạo UserService
    @BeforeEach
    public void initData() {
        userService = new UserService();
    }

    // test case 1: thêm mới kiểm tra độ dài của ds
    // assertTrue
    @Test
    public void testFeatureAdd() {
        userService.addUser(
                new User(1, "Ngô Quang Anh","anh@gmail.com")
        );
        Assertions.assertEquals(1, userService.users.size());
    }

    // test case 2: kiểm thử thêm có ném ngoại lệ hay không
    // assertThrows
    @Test
    public void testFeatureAddThrows() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
           userService.addUser(
                   new User(
                           1,
                           "     ",
                           "null@gmail.com"
                   )
           );
        });
    }

    // test case 3: kiểm thử người dùng khôn tồn tại nó phải trả về null
    @Test
    public void testFindUserById() {
        Assertions.assertNull(userService.findUserById(1));
    }

    // test case 4: định dạng email hợp lệ
    @Test
    public void testFeatureValidEmail() {
        Assertions.assertTrue(userService.isValidEmail("tu@gmail.com"));
    }
}
