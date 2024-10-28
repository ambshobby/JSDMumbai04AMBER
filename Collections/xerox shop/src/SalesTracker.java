// 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalesTracker<T extends SalesRecord> {
    private List<T> salesRecords;

    public SalesTracker() {
        salesRecords = new ArrayList<>();
    }

    public void addRecord(T record) {
        salesRecords.add(record);
    }

    public double getDailySales(Date date) {
        return salesRecords.stream()
                .filter(record -> record.getDate().equals(date))
                .mapToDouble(SalesRecord::getTotalSales)
                .sum();
    }

    public double getMonthlySales(int month, int year) {
        return salesRecords.stream()
                .filter(record -> {
                    Date date = record.getDate();
                    return date.getMonth() == month && date.getYear() == year;
                })
                .mapToDouble(SalesRecord::getTotalSales)
                .sum();
    }
}

