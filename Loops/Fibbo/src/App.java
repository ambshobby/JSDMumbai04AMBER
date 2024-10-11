// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

/*Do While loops
Create a new Java class with a main method(so you can run your code) called Fibonacci

The Fibonacci numbers are a traditional computer science problem: "each number is the sum of the two preceding ones, starting from 0 and 1."

The beginning of the sequence is thus:

0 1 1 2 3 5 8 13 21 34 55 89 ...

Add the following import to be able to capture user input n

  import java.util.Scanner;
Implement a Do While loop that calculates Fibonacci(n)

n	Fibonacci(n)
0	0
1	1
2	1
3	2
4	3
5	5
6	8
7	13
...	... */
public class App {
    public static void main(String[] args) throws Exception {
      long n1=0,n2=1;
      short count =10;
        fibbo(n1,n2,count);
    }
    public static void fibbo(long n1,long n2,short count)
      {
        long[] a=new long[count];
        a[0]=0;
        a[1]=1;
        for(int i=2;i<count;i++)
        {
            long n3=n1+n2;
            a[i]=n3;
            n1=n2;
            n2=n3;
        }
        for(int i =0;i<a.length;i++)
        {
            System.out.println("A["+i+"]===>"+a[i]);
        }
      }
}
