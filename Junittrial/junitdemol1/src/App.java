import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int add(int a,int b)
    {
        return a+b;
    }
    @Test
    public void testAdd()
    {
     assertEquals("message ",100,add(20,30));   
    }
}