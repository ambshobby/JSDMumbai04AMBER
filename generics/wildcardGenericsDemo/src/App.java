
import java.util.ArrayList;
import java.util.List;

abstract class person
{
    abstract void details();
}

class Student extends person
{   
    String name;

    public Student(String name) {
        this.name = name;
    }

    void details()
    {
        System.out.println("In the Student oject details method"+this.name);
    }


}

//class employee 
class Employee extends person
{   
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void details()
    {
        System.out.println("In the Employee oject details method"+this.name);
    }


}
//class pilot
class Pilot extends person
{   
    String name;

    public Pilot(String name) {
        this.name = name;
    }

    void details()
    {
        System.out.println("In the Pilot oject details method"+this.name);
    }


}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Student> stud_list=new ArrayList<Student>();
        stud_list.add(new Student("AJ"));
        stud_list.add(new Student("RJ"));
        stud_list.add(new Student("HJ"));
        PrintBaba(stud_list);

        List<Employee> Emp_list=new ArrayList<Employee>();
        Emp_list.add(new Employee("Suresh employee"));
        Emp_list.add(new Employee("Ramesh employee"));
        Emp_list.add(new Employee("Mahesh employee"));
        PrintBaba(Emp_list);

        if(Emp_list.contains(Emp_list.get(0)))
        {
            System.out.println("Jingalalalalfkjsdh mila hai");
        }
        // List<? extends person> pall=new ArrayList<? extends person>();
        // pall.addall(stud_list);
        // pall.addall(Emp_list);

    }
    public static void PrintBaba(List<? extends person> templist)
    {
        System.out.println("The delails in the list are as follows");
        for(person item:templist)
        {
            item.details();
        }
    }
}
