// 
import java.util.*;
import java.util.stream.*;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using Stream API to process the list of numbers
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)        // Filtering even numbers
            .map(n -> n * n)               // Squaring the even numbers
            .collect(Collectors.toList());   // Collecting results into a List

        System.out.println("Even Numbers Squared: " + evenNumbers);
    }
}

