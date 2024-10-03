package Arrays;

public class Arrayallocation 
{
 public static void main(String[] args)
 {
    int[] A1=new int[6];
    for(int i=0;i<A1.length ;i++)
    {
        int y=i+20*300;
        A1[i]=y;
    }
    for(int i=0;i<A1.length ;i++)
    {
        System.out.println(A1[i]);
    }
    System.out.println(A1);

 }    
}

