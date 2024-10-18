import java.util.HashMap;

public class SalesRep extends Employee
{
   //private double salesMade;
    private HashMap<Integer, SalesRep> salesTeam;
    private double salesMade;


public void addSalesRep(int id, SalesRep salesRep) {
    salesTeam.put(id, salesRep);
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
                 int yearsWorked
                 ) 
    {
    super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
    //this.salesMade = salesMade;
    this.salesTeam = new HashMap<>();
    }   

    
}
