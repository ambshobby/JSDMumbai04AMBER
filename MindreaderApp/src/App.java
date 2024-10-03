import java.util.*;
 class Player_A
{
    int p_scr=0;
    String name;
    int p_input;
    public Player_A(String namepassed)
    {
        this.name=namepassed;
    }
    
}
class Computer_player
{
    int c_scr=0;
    String name="ROBO.1";
    int c_pred=0;

}

public class App 
{
    public static void main(String[] args) throws Exception 
    {
       Player_A A=new Player_A("KUTTA");

       Computer_player C=new Computer_player();
        
       Scanner sc=new Scanner(System.in);
        for(;;)
        {
            System.out.println("Enter your coin reading");
            A.p_input=sc.nextInt();
     
            System.out.println("You entered "+A.p_input);
     
            //checking 1
            if(A.p_input==C.c_pred)
            {
                 C.c_scr++;
            }
            else
            {
                 A.p_scr++;
            }

            System.out.println("Computer Score"+C.c_scr);
            System.out.println("Player Score"+A.p_scr);
            //stopping condition 
                if(C.c_scr==2)
                {
                    System.out.println("Computer is Winner ,player wish you luck");
                    break;
                }
                else if(A.p_scr==2)
                {
                    System.out.println("Player is Winner ,Computer wish you luck");
                    break;
                }

            
        }
      sc.close();
    }
}