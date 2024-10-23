
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception 
    {
            System.out.println("Hello, World!");
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
            list.add("Ravi");//Adding object in arraylist 
            System.out.println("Array list status");
            printlist(list); 
            list.add("Vijay");  
            System.out.println("Array list status");
            printlist(list); 
            list.add("Ravi");  
            System.out.println("Array list status");
            printlist(list); 
            list.add("Ajay");  
            System.out.println("Array list status");
            printlist(list); 

            
            
    }
    public static void  printlist(ArrayList a)
    {
        //Traversing list through Iterator  
        
        Iterator itr=a.iterator();  
        while(itr.hasNext())
        {  
        System.out.println(itr.next());  
        }
    }

}
