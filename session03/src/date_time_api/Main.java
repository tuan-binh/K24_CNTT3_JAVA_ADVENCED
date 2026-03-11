package date_time_api;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime vn = ZonedDateTime.now();
        System.out.println(vn);
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyo);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime);

        LocalTime start = LocalTime.of(23,0);
        LocalTime end = LocalTime.of(1,0);
        Duration duration = Duration.between(start,end);
        System.out.println(duration.toHours());

        String date = "09/03/2026 18:09:50";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime newDate = LocalDateTime.parse(date,dateTimeFormatter);
        System.out.println(newDate);
    }
}
