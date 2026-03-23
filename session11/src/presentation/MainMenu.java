package presentation;

import persistence.AppointmentRepository;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {

        AppointmentRepository appointmentRepository = AppointmentRepository.getInstance();

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1. Hiển thị
                2. Thêm mới
                3. Sửa
                4. Xoá
                5. Tìm kiếm theo id
                6. Thoát
                Lựa chọn của bạn:
                """);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                appointmentRepository.getAllAppointments().forEach(System.out::println);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.err.println("Vui lòng nhập từ 1 -> 6");
        }
    }
}
