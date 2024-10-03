package Arrays;

public class Fibbarray 
{
    public static void main(String[] args){
        long[] arr = new long[20];
        long n1= 0, n2 =1, n3;
    
        for (int i =0; i< arr.length;)
        {

            n3 = n1+n2;
            if(n3 % 2 ==0){
                arr[i] = n3;
                i++;
            }
            n1 = n2;
            n2 = n3;

        
        }
        long sum=0;
       for (int i =0; i< arr.length; i++)
       {
            sum+=arr[i];
            System.out.println("A[" +i+"]=="+arr[i]);
            System.out.println("SUM"+sum);
           


       } 
       //System.out.println("SUM"+sum);


    }

    
}
