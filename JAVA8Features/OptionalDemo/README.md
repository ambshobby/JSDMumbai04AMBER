Sure! The `Optional` class in Java is a container object used to represent the presence or absence of a value. It helps avoid `NullPointerExceptions` and encourages better handling of absent values. Here’s a demonstration of how to use the `Optional` class, including creation, common methods, and examples.

### Creating an Optional

You can create an `Optional` instance in several ways:

1. **Using `Optional.of()`**: For a non-null value.
2. **Using `Optional.ofNullable()`**: For a nullable value.
3. **Using `Optional.empty()`**: To create an empty `Optional`.

### Example Code

```java
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalValue = Optional.of("Hello, Optional!");
        System.out.println("Optional Value: " + optionalValue.get()); // Output: Hello, Optional!

        // Creating an Optional with a nullable value
        String nullableValue = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableValue);
        System.out.println("Is value present? " + optionalNullable.isPresent()); // Output: false

        // Creating an empty Optional
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Is empty optional present? " + emptyOptional.isPresent()); // Output: false

        // Using ifPresent to execute code if value is present
        optionalValue.ifPresent(value -> System.out.println("Value is present: " + value));

        // Using orElse to provide a default value
        String defaultValue = optionalNullable.orElse("Default Value");
        System.out.println("Value or default: " + defaultValue); // Output: Default Value

        // Using orElseThrow to throw an exception if value is absent
        try {
            String valueOrException = emptyOptional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Output: Value not present
        }

        // Using map to transform the value if present
        Optional<String> transformedOptional = optionalValue.map(String::toUpperCase);
        System.out.println("Transformed Value: " + transformedOptional.get()); // Output: HELLO, OPTIONAL!
        
        // Using filter to check conditions
        Optional<String> filteredOptional = optionalValue.filter(value -> value.contains("Optional"));
        System.out.println("Filtered Value Present: " + filteredOptional.isPresent()); // Output: true
    }
}
```

### Output
```
Optional Value: Hello, Optional!
Is value present? false
Is empty optional present? false
Value is present: Hello, Optional!
Value or default: Default Value
Value not present
Transformed Value: HELLO, OPTIONAL!
Filtered Value Present: true
```

### Common Methods of `Optional`

- **`get()`**: Returns the value if present; throws `NoSuchElementException` if not.
- **`isPresent()`**: Returns `true` if there is a value present.
- **`ifPresent(Consumer<? super T> action)`**: Executes the given action if a value is present.
- **`orElse(T other)`**: Returns the value if present; otherwise, returns `other`.
- **`orElseGet(Supplier<? extends T> other)`**: Returns the value if present; otherwise, invokes `other` and returns its result.
- **`orElseThrow(Supplier<? extends X> exceptionSupplier)`**: Returns the value if present; otherwise, throws an exception supplied by the given supplier.
- **`map(Function<? super T, ? extends U> mapper)`**: If a value is present, applies the provided mapping function to it and returns an `Optional` describing the result.
- **`filter(Predicate<? super T> predicate)`**: If a value is present, evaluates the predicate and returns an `Optional` describing the value if it matches; otherwise, returns an empty `Optional`.

### Conclusion

The `Optional` class is a powerful tool for dealing with potentially absent values in a more elegant way than using `null`. It promotes better coding practices and reduces the likelihood of `NullPointerExceptions`. By using the various methods provided by `Optional`, you can write clearer and more maintainable code.