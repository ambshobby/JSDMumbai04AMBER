// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class App {
       public static void main(String[] args) throws Exception {
             System.out.println("Hello, World!");

        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        // 1. Using a regular method
        Collections.sort(names, new App()::compareStrings);
        System.out.println("Sorted using regular method: " + names);

        // Resetting the list for the next example
        names = Arrays.asList("Charlie", "Alice", "Bob");

        // 2. Using a lambda expression
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted using lambda: " + names);

        // Resetting the list for the next example
        names = Arrays.asList("Charlie", "Alice", "Bob");

        // 3. Using a method reference
        Collections.sort(names, String::compareTo);
        System.out.println("Sorted using method reference: " + names);
    }

    // Regular method to compare two strings
    public int compareStrings(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
