import java.util.*;  
class piku<T>
{
    T obj;
    void add(T obj)
    {
        this.obj=obj;
    }
    T get()
    {
        return obj;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        piku<String> stringpiku=new piku<String>();
        stringpiku.add("AJ");
        System.out.println("The value in obj is "+stringpiku.get());

        piku<Integer> intpiku=new piku<Integer>();
        intpiku.add(4564145);
        System.out.println("the value in int obj is "+intpiku.get());


        printgen(10);
        printgen("Ambika");
        printgen(10.77);
        printgen(stringpiku);
    }
    public static <E> void printgen(E dataE)
    {
        System.out.println("the data received is -----------"+dataE);
    }
}
