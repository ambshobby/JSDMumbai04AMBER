import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
       int num_check,flag=0;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked ");
        num_check=sc.nextInt();
       if(num_check==0||num_check==1)
       {
        System.out.println("Not a prime");
       }
       else
       {
            for(int i=2;i<=num_check;i++)
            {
                if(num_check%i==0)
            {
                flag=1;
            }
            }
            if(flag==1)
            {
                System.out.println("number is  not prime");
            }
            else 
            {
                System.out.println("number is  prime");
            }
       }
    }
}
