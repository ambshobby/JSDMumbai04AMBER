interface Addable{  
    int add(int a,int b);  
}  

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Lambda expression without return keyword.  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Lambda expression with return keyword.    
        Addable ad2=(int a,int b)->{ return (a-b); };  
        //System.out.println("AD2"+ad2);
        System.out.println(ad2.add(100,200));  

    }
}
