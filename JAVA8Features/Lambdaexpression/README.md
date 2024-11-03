

### Java Lambda Expressions

**Definition**: A lambda expression in Java is a concise way to represent a function that can be passed as an argument to a method or used to implement a functional interface. 

### Characteristics
1. **Anonymous Function**: No need to declare a function with a name.
2. **Target Type**: It can be used wherever a functional interface is expected.
3. **Syntax**: More concise than traditional anonymous inner classes.

### Syntax
```java
(parameters) -> expression
// or
(parameters) -> { statements; }
```

### Functional Interface
A functional interface is an interface that contains exactly one abstract method. Examples include `Runnable`, `Callable`, and custom interfaces.

### Examples

#### Example 1: Basic Lambda Expression
```java
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // A simple lambda expression to print elements of a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Using lambda with forEach
        names.forEach(name -> System.out.println(name));
    }
}
```

#### Example 2: Using Lambda for a Functional Interface
```java
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Implementing the interface using a lambda expression
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        
        System.out.println("Addition: " + addition.operate(5, 3));       // Output: 8
        System.out.println("Subtraction: " + subtraction.operate(5, 3)); // Output: 2
    }
}
```

#### Example 3: Using Lambda with Streams
```java
import java.util.Arrays;
import java.util.List;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Using lambda with filter and map
        List<Integer> squares = numbers.stream()
                                       .map(n -> n * n)
                                       .toList();
        
        System.out.println(squares);  // Output: [1, 4, 9, 16, 25]
    }
}
```

#### Example 4: Sorting with Lambda
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");
        
        // Sorting using a lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));
        
        System.out.println(names);  // Output: [Alice, Bob, Charlie]
    }
}
```

### Advantages of Lambda Expressions
- **Conciseness**: Reduces boilerplate code.
- **Improved Readability**: Makes the code easier to read and understand.
- **Facilitates Functional Programming**: Enhances the ability to use functional programming techniques in Java.

### Disadvantages
- **Debugging Complexity**: Can be harder to debug than named methods.
- **Limited to Functional Interfaces**: Must be used in contexts where functional interfaces are expected.

### Conclusion
Lambda expressions in Java provide a powerful and flexible way to write function-like behavior in a concise manner. They are widely used in Java's stream API and enhance the language's capability for functional programming.
