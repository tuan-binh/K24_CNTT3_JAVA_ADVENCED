package funtional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = (firstNumber, secondNumber) -> (double) firstNumber / secondNumber;

        System.out.println(calculate.devide(3, 4));

        // Predicate -> kiểm tra giá trị (nhận 1 giá trị để kiểm tra) -> boolean
        Predicate<Integer> checkPrime = (number) -> {
            if (number < 2) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        };

        List<Integer> num = new ArrayList<>(List.of(1, 5, 2, 6, 9, 3));

        System.out.println(checkPrime.test(100));


        // Function<A,B> --> Để làm gì??? biến đổi dữ liệu từ A -> B
        Function<Boolean,String> hung = (gender) -> gender ? "Nam" : "Nữ";
        System.out.println(hung.apply(false));


        // Consumer -> xử lý dữ liệu nhưng ko trả về
        Consumer<String> consumer = (name) -> {
            if(name.equals("Hưng")) {
                System.out.println(name + " Lẩu gà bình thuận");
            } else {
                System.out.println(name + " Sống đúng với giới tính của mình");
            }
        };
        consumer.accept("Đức");



        // Supplier - Tạo dữ liệu () -> 1 giá trị
        Supplier<Integer> randomOTP = () -> (int) Math.floor(Math.random() * 900000) + 100000;
        System.out.println(randomOTP.get());



    }
}
