
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        List<String> names=Arrays.asList("rangu", "mangu","maju","ningu","nagu","Manjari","monu");
        
        List<String> temp=names.stream()
                                .filter((name)->name.toLowerCase().startsWith("m"))
                                .collect(Collectors.toList());
        for (String string : temp) 
        {
            System.out.println(string);
        }
        
    }
}
