
public class Employee 
{
    String firstName;
    String lastName;
    int registration;
    int age;
    int daysWorked;
    int vacationDaysTaken;
    double salary;
    int yearsWorked;

    

    public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
            double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }

    public int timeToRetirement(int age,int yearsWorked)
    {
        // time to retirement = min(60 - age, 40 - yearsWorked)
        return Math.min(60 - age, 40 - yearsWorked);
     }
  
     public int vacationTimeLeft(){
         // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
         return (daysWorked/360)*(30 - vacationDaysTaken);
     }
  
     public int calculateBonus(double salary)
     {
         // bonus = 2.2*salary
         return (int) ((int)2.2*salary);
     }
    
}
