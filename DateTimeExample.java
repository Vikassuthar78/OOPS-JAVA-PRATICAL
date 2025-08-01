import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime Zoned = ZonedDateTime.now(ZoneId.of("asia/kolkata"));

        System.out.println("today: " + today);
        System.out.println("Time now: " + now);
        System.out.println("Local DateTime: " + dateTime);
        System.out.println("Zoned DateTime: " + Zoned);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Formatted: " + dateTime.format(formatter));

    }
}
