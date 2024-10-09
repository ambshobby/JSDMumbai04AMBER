import java.util.*;
class Player_A
{
    int p_scr=0;
    String name;
    int p_input;
    public Player_A(String namepassed)
    {
     name=namepassed;
    }

    public void playerdetails()
    {   
        System.out.println("Name of player is "+name);
        System.out.println("Score ="+p_scr);
    }
}
class Computer_player
{  int c_scr=0;
    String name="Bahubali";
   
    
    int c_pred;
    
    public int Prediction() 
    {
        Random r = new Random();
        return r.nextInt(2);

    }

    public void playerdetails()
    {   
        System.out.println("Name of player is "+name);
        System.out.println(" Score ="+c_scr);
    }

}

public class App 
{
    public static void main(String[] args) throws Exception 
    {
       Player_A A=new Player_A("Kattappa");

       Computer_player C=new Computer_player();
        
       Scanner sc=new Scanner(System.in);
        for(;;)
        {
            System.out.println("Enter your coin reading");
            A.p_input=sc.nextInt();
     
            System.out.println("You entered "+A.p_input);
      C.c_pred = C.Prediction();
            //checking 1
            if(A.p_input==C.c_pred)
            {
                 C.c_scr++;
                 System.out.println("====================Current Score===========================");
                 A.playerdetails();
                 C.playerdetails();
            }
            else
            {
                 A.p_scr++;
                 System.out.println("====================Current Score===========================");
                 A.playerdetails();
                 C.playerdetails();
            }

            //System.out.println("Computer Score"+C.c_scr);
            //System.out.println("Player Score"+A.p_scr);
            //stopping condition 
                if(C.c_scr==3)
                {
                    //System.out.println("Computer "+C.name+"is Winner ,player wish you luck");
                    System.out.println("*********************Winner is ****************");
                    C.playerdetails();
                    System.out.println("******************* ****************");
                    break;
                }
                else if(A.p_scr==3)
                {
                    //System.out.println("Player"+A.name+" is Winner ,Computer wish you luck");
                    System.out.println("*********************Winner is ****************");
                    A.playerdetails();
                    System.out.println("******************* ****************");
                    break;
                }

            
        }
      sc.close();
    }
}