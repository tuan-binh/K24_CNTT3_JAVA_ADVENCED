import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        // Exception
        // Checked Exception
        // IOEception

//        FileReader reader = new FileReader("D://GAMES");


        // Unchecked Exception

//        Person person = null;
//        person.learning();

//        int[] arr = {1,2,3};
//        System.out.println(arr[3]);


        // Bài toán:
        // nhập giá trị số nguyên dương
        // nếu nó nhập chuỗi thông báo lỗi
        // nếu nó nhỏ hơn 0 thì cũng thông báo lỗi
        // Sai thì phải nhập lại
        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Nhập vào 1 số nguyên dương: ");
//            int number = 0;
//            try {
//                number = Integer.parseInt(sc.nextLine());
//
//            }catch (NumberFormatException e) {
//                System.err.println("Vui lòng nhập lại số nguyên dương: ");
//            }
//            if(number < 0) {
//                System.err.println("Không được nhập số âm");
//            }
//            System.out.println(number);
//        } while (true);

        // sử dụng đối tượng để validate
        // - fullName:
        // - không dược bỏ trông
        // - dateOfBirth:
        // - nhập đúng định dạng dd/MM/yyyy

        // nhập ngày
//        System.out.println("Nhập vào ngày sinh nhật của mìn: ");
//        do {
//            String dateString = sc.nextLine();
//            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//            Date date = null;
//            try {
//                date = format.parse(dateString);
//                System.out.println(date);
//            } catch (ParseException e) {
//                System.err.println("Vui lòng nhập đúng định dạng: dd/MM/yyyy");
//            }
//        } while (true);

        // Bài toán:
        /**
         * Nhập tuổi
         * nhập đúng định dạng số hay không
         * kiểm tra < 0 -> ném lỗi không được nhỏ hơn 0
         * kiểmt ra < 18 -> ném lỗi chưa đủ 18 tuổi
         * */

        try {
            int age = inputAge(sc);
            System.out.println(age);
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }

    }

    public static int inputAge(Scanner sc) throws InvalidAgeException {
        do {
            try {
                System.out.println("Nhập tuổi: ");
                int age = Integer.parseInt(sc.nextLine());
                if( age < 0 ) {
                    throw new InvalidAgeException("Vui lòng nhập số lớn hơn 0");
                } else if (age < 18) {
                    throw new InvalidAgeException("Chưa đủ 18 tuổi");
                } else {
                    return age;
                }
            }catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập đúng định dạng số");
            }



        }while (true);
    }

}