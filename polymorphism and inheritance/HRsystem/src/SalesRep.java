public class SalesRep extends Employee
{
   private double salesMade;

public double getSalesMade() {
    return salesMade;
}

public void setSalesMade(double salesMade) {
    this.salesMade = salesMade;
}

public SalesRep(String firstName,
                 String lastName, 
                 int registration, 
                 int age, 
                 int daysWorked, 
                 int vacationDaysTaken,
                 double salary, 
                 int yearsWorked, 
                 double salesMade) 
    {
    super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
    this.salesMade = salesMade;
    }   

    
}
