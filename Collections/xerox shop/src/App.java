import java.util.Calendar;
import java.util.Date;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SalesTracker<SalesRecord> tracker = new SalesTracker<>();

        // Sample records
        tracker.addRecord(new SalesRecord(new Date(), 10, 0.10)); // Today's date
        tracker.addRecord(new SalesRecord(new Date(System.currentTimeMillis() - 86400000L), 5, 0.10)); // Yesterday

        // Get today's sales
        double todaySales = tracker.getDailySales(new Date());
        System.out.println("Today's Sales: $" + todaySales);

        // Get monthly sales (e.g., for October 2023)
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.OCTOBER, 1);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        double monthlySales = tracker.getMonthlySales(month, year);
        System.out.println("October 2023 Sales: $" + monthlySales);
    }
}
