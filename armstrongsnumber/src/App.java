import java.util.*; 
public class App {
    public static void main(String[] args) throws Exception 
    {
        int number;
        System.out.println("Enter the NUmber to be checked ");
        Scanner sc =new Scanner(System.in);
        number=sc.nextInt();
        //find the length of number ;
        int len=String.valueOf(number).length();

        int temp=number;
        int rm;
        
        int sum=0;
        while(number>0)
        {

            rm=number%10;
            sum+=Math.pow(rm,len);
           
            number/=10;

        }

        if(temp==sum)
        {
            System.out.println(" A ARMSTRONG");
        }
        else
        {
            System.out.println(" NOT A ARMSTRONG");
        }
        sc.close();
    }
}
