public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Employee e1=new Employee("Ranjan", "Banarjee", 10, 30, 2500, 10, 25000.3,6 );
        System.out.println("Time to retire"+e1.timeToRetirement(e1.age,e1.yearsWorked));
    
    }
}
