package stream_api;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nameBadStudents = new ArrayList<>(
                List.of(
                    "Nguyễn Trần Bảo K",
                    "Bàng Trọng T",
                    "Nguyễn Quốc D",
                    "Nguyễn Tiến T"
                )
        );
        System.out.println(nameBadStudents);
        Set<String> sortedString = nameBadStudents.stream().sorted((String::compareTo)).collect(Collectors.toSet());
        System.out.println(sortedString);

        boolean result = nameBadStudents.stream().anyMatch((name) -> name.equals("Bàng Trọng T"));
        if(result) {
            System.out.println("Đã tồn tại");
        }
        // anyMatch()
        // allMatch()
        // noneMatch()
        // min, max
        // limit
        // distinct

    }
}
