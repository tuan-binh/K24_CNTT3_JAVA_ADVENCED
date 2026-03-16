package btth;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1 nhập bên ngoài và validate bên ngoài sau đó gọi phương thức registerUser
        Scanner sc = new Scanner(System.in);
        do {
            try {
                String name = inputName(sc);
                int age = inputAge(sc);
                String email = inputEmail(sc);
                registerUser(name, age, email);
            } catch (InvalidEmailException | InvalidAgeException e) {
                System.err.println(e.getMessage());
            }
        } while (true);


        // 2 truyền vào rồi validate
    }

    public static String inputEmail(Scanner sc) throws InvalidEmailException {

        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        String regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$";
        if (email.matches(regex)) {
            return email;
        }
        throw new InvalidEmailException("Email không đúng định dạng");
    }

    public static int inputAge(Scanner sc) throws InvalidAgeException {
        do {
            try {
                System.out.println("Nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                if (age < 18) {
                    throw new InvalidAgeException("Đã uống rượu bia thì không được lái xe");
                } else {
                    return age;
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập đúng định dạng");
            }
        } while (true);
    }

    // 1 file chuyên để nhập
    // nhập chuỗi
    // nhập số

    public static String inputName(Scanner sc) {
        do {
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            if (name.isBlank()) {
                System.err.println("Vui lòng không được bỏ trống");
            } else {
                return name;
            }
        } while (true);
    }

    public static void registerUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        System.out.println("Đăng ký thành công");
    }

}
