
// Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
    
    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method in the functional interface.");
    }
}

// Class implementing the interface
class MyClass implements MyFunctionalInterface {
    @Override
    public void execute() {
        System.out.println("Executing from MyClass.");
    }
    
    // Regular method
    public void regularMethod() {
        System.out.println("This is a regular method in MyClass.");
    }
    
    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method in MyClass.");
    }
}

public class App{
    public static void main(String[] args) {
        // Using regular method
        MyClass myClass = new MyClass();
        myClass.regularMethod(); // Output: This is a regular method in MyClass.

        // Using default method
        myClass.defaultMethod(); // Output: This is a default method in the functional interface.

        // Using lambda expression
        MyFunctionalInterface lambda = () -> System.out.println("Executing from lambda expression.");
        lambda.execute(); // Output: Executing from lambda expression.

        // Using method reference
        MyFunctionalInterface methodRef = myClass::execute;
        methodRef.execute(); // Output: Executing from MyClass.

        // Using static method
        MyClass.staticMethod(); // Output: This is a static method in MyClass.
    }
}
/* */
