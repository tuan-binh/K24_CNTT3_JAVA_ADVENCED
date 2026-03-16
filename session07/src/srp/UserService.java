package srp;

// SRP
public class UserService {
    // thực hiện chức năng thêm người dùng
    public void createUser(User user) {
        // tính lưu vào database
        Database db = new Database();
        db.save(user);
        // tính năng gửi mail để xác nhận
        EmailSender emailSender = new EmailSender();
        emailSender.sendEmail("Xin chào bạn tú nhé có ăn cơm chưa");
    }
}
