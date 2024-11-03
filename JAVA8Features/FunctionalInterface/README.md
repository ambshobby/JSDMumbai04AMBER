Yes, a functional interface in Java can indeed inherit methods from the `Object` class. Here’s a detailed explanation:

### Functional Interface

**Definition**: A functional interface is an interface that contains exactly one abstract method. It can have multiple default or static methods, but only one abstract method.

**Example of a Functional Interface**:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();  // Abstract method

    // Default method
    default void myDefaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void myStaticMethod() {
        System.out.println("This is a static method.");
    }
}
```

### Inheritance from Object Class

Since all classes in Java implicitly extend the `Object` class, any functional interface also inherits the methods of `Object`. This means that you can override methods like `equals()`, `hashCode()`, and `toString()` in a functional interface.

#### Example of Overriding Object Methods in a Functional Interface
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();  // Abstract method

    @Override
    String toString();  // Overriding Object's toString method
}

public class Example {
    public static void main(String[] args) {
        MyFunctionalInterface instance = () -> System.out.println("Executing myMethod!");

        System.out.println(instance); // Calls overridden toString()
    }
}
```

### Key Points

1. **Abstract Method**: A functional interface must have exactly one abstract method. This is the method that will be implemented by the lambda expression or method reference.

2. **Default and Static Methods**: The functional interface can have any number of default and static methods, which can provide additional functionality.

3. **Inheritance of Object Methods**: The functional interface can override methods inherited from `Object`, but it must still adhere to the rule of having only one abstract method.

4. **Use Case**: Functional interfaces are often used as types for lambda expressions and method references, allowing for cleaner and more expressive code.

### Conclusion
In summary, a functional interface can inherit methods from the `Object` class and can override them as needed. This allows you to provide custom implementations for methods like `equals()`, `hashCode()`, and `toString()`, while still maintaining the contract of a functional interface.