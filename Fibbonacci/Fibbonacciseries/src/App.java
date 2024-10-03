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
