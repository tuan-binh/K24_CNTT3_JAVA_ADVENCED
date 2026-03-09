package reference_method;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> numberString = new ArrayList<>(List.of("3","7","9"));
        // ép kiểu
        List<Integer> numberInteger =
                numberString.stream()
                        .map(Integer::parseInt)
                        .toList();
        System.out.println(numberInteger);

    }
}
