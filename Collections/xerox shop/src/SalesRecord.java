
import java.util.Date;

public class SalesRecord {
    private Date date;
    private int copiesSold;
    private double pricePerCopy;

    public SalesRecord(Date date, int copiesSold, double pricePerCopy) {
        this.date = date;
        this.copiesSold = copiesSold;
        this.pricePerCopy = pricePerCopy;
    }

    public double getTotalSales() {
        return copiesSold * pricePerCopy;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "SalesRecord{" +
                "date=" + date +
                ", copiesSold=" + copiesSold +
                ", pricePerCopy=" + pricePerCopy +
                '}';
    }
}
