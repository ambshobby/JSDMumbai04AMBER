import java.util.Iterator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //Creating and adding elements  
        TreeSet<String> set=new TreeSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ravi");  
        set.add("Ajay");  
        //traversing elements  
        Iterator<String> itr=set.iterator();  
        while(itr.hasNext())
        {  
        System.out.println(itr.next());  
        }  
    }
}
