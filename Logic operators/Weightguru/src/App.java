import java.util.Scanner;
/*Part 2: Weight Guru Challenge
Create a Java program that tells whether your body to weight ratio is good or could be better.
The java app should take in your weight and height from the console and calculate your body to weight ratio.
You can use this article as a standardized guide for how to apply the logic. */
public class App 
{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello,asdasdasdasd World!");
        Scanner sc =new Scanner(System.in);
        float weight, height;

        System.out.println("Enter weight in KG");
        weight=sc.nextFloat();
        System.out.println("Enter Height in feet");
        height=0.3048f*(sc.nextFloat());

        float BMI=calcBMI(weight,height);
        String Result=  AnalyseBMI(BMI);
        System.out.println("BMI is-------------->"+BMI);
        System.out.println("RESULT is-------------->"+Result);

    }
    public static float calcBMI(float weight,float h)
    {
        return weight/(h*h);
    }

    public static String AnalyseBMI(float BMI)
    {
            if( BMI<18.5)
            {
                return "UnderWeight";

            }
            else if(BMI>=18.5 && BMI <24.9)
            {
                return "Normal Weight";

            }
            else if(BMI>=25.0 && BMI <29.9)
            {
                return "Over Weight";

            }
            else 
            {
                return "OBESE red alert" ;
            }
    }
}
