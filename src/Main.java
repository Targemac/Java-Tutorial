import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        /*
         * How to work with DATES & TIMES using JAVA
         * (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
         * */

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        //        Custom format
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        }
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        }

    }
}
