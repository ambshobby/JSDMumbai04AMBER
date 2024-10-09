package Controlflow;
import java.util.Scanner;


/*Part 1: Commission Calculator
Using IntelliJ, write a Java app that takes numerical input from a user
The app should calculate commission based on this chart used by the retail store.
Sales Range	Commission
above 10000$	30%
5001 - 9999$	20%
1001 - 4999$	10%
below 1000$	N/A */

public class Commission 
{
    public static void main(String Args[])
    {
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter the sales amount for which we have to calculate commission ");
        int sales_amount=sc.nextInt();
        int commission_per=0;
        float com;
        
        if(sales_amount<=1000)
        {
            System.out.println("Sorry better luck next time your sales is not fit ");
        }
        else if(sales_amount>=1001 && sales_amount <=4999)
        {
            
            commission_per=10;
            com=Calc_comm(commission_per, sales_amount);
            System.out.println("****************************************");
            System.out.println("Your Commission is calculated at 10 %");
            System.out.println("Commission amount is"+com);
            System.out.println("****************************************");
            
        }
        else if (sales_amount>=5000 && sales_amount<=9999)
        {
            commission_per=20;
            com=Calc_comm(commission_per, sales_amount);
            System.out.println("****************************************");
            System.out.println("Your Commission is calculated at 20%");
            System.out.println("Commission amount is"+com);
            System.out.println("****************************************");
        }
       else if(sales_amount>=10000)
       {
            commission_per=30;
            com=Calc_comm(commission_per, sales_amount);
            System.out.println("****************************************");
            System.out.println("Your Commission is calculated at 30 %");
            System.out.println("Commission amount is"+com);
            System.out.println("****************************************");
       }
       else
       {
        System.out.println("Invalid Input");
        
       }
    



    }//end of main
    //fuction for commission calculation 

    public static float Calc_comm(int com,int sales_amount)
    {
        return (sales_amount*com)/100;
    }
}
