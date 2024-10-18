public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /*String firstName,
                 String lastName, 
                 int registration, 
                 int age, 
                 int daysWorked, 
                 int vacationDaysTaken,
                 double salary, 
                 int yearsWorked, 
                 double salesMade */

       SalesRep s1=new SalesRep("A", "sss", 10, 30, 730, 05, 30000, 2, 10000);
       SalesRep s2=new SalesRep("B", "ss", 10, 30, 730, 05, 30000, 2, 20000);
       SalesRep s3=new SalesRep("C", "sss", 10, 30, 730, 05, 30000, 2, 30000);
    
       SalesManager SM=new SalesManager("Bhayankar", "sss", 10, 30, 730, 05, 30000, 2, 30000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
       SM.addSalesRep(1, s1);
        salesManager.addSalesRep(2, s2);
       SM.calculateComission();
    }   
}
