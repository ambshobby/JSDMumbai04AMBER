
@FunctionalInterface  
interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
 
public class App implements sayable 
{  
            public void say(String msg){  
                System.out.println(msg);  
            }  
        public static void main(String[] args) throws Exception 
        {
            System.out.println("Hello, World!");
        App fie = new App();  
        fie.say("Hello there");  
    }  
}  