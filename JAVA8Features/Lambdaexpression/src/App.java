interface Addable{  
    int add(int a,int b);  
}  
/* Anonymus function will not work with this not possible 
class A
{
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int addding(int a, int b)
    {
        return a+b;
    }


}*/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        //int x=(a,b)->(a+b);

        //A aobj=(a,b)->(a+b);

        System.out.println();
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{ return (a-b); };  
        //System.out.println("AD2"+ad2);
        System.out.println(ad2.add(100,200));  

    }
}
