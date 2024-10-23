import java.util.Iterator;
import java.util.LinkedHashSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LinkedHashSet<String> set=new LinkedHashSet<String>();  
        set.add("Ravi");  
        set.add("Vijay");  
        set.add("Ravi");  
        set.add("Ajay");  
        Iterator<String> itr=set.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
}  
    }
}
