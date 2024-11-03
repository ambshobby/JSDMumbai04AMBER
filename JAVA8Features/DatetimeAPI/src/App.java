import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Classical Date/Time API
        System.out.println("Using Classical Date/Time API:");

        // Get current date
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Current Date: " + sdf.format(now));

        // Adding days using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Add 5 days
        Date newDate = calendar.getTime();
        System.out.println("Date after adding 5 days: " + sdf.format(newDate));

        // Java 8 Date/Time API
        System.out.println("\nUsing Java 8 Date/Time API:");

        // Get current date
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date: " + localDate);

        // Adding days using LocalDate
        LocalDate newLocalDate = localDate.plusDays(5); // Add 5 days
        System.out.println("Date after adding 5 days: " + newLocalDate);
    }
}
