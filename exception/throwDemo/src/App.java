
/*public static boolean isNumeric(String string) {
    int intValue;
        
    System.out.println(String.format("Parsing string: \"%s\"", string));
        
    if(string == null || string.equals("")) {
        System.out.println("String cannot be parsed, it is null or empty.");
        return false;
    }
    
    try {
        intValue = Integer.parseInt(string);
        return true;
    } catch (NumberFormatException e) {
        System.out.println("Input String cannot be parsed to Integer.");
    }
    return false;
}*/
class FloatException <T>
{ private T value;

    public FloatException(T value) 
    {
    this.value = value;
    }
    public boolean                                                                                                                                                                               
    {
        String s=v1T.toString();
        //System.out.println("T value is ",v1T.toString());
        // if(Integer.parseInt(s))
        // {
        //     return true;

        // }
    }
}
public class App {
    public static <T> void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        FloatException <T> obj1=new FloatException(1.2);
    }
}
