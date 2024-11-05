import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text you want ");

        String x=sc.nextLine();
        JFrame ambika=new JFrame();
        ambika.setLayout(null);
        JButton jb=new JButton();
        jb.setBounds(100,200,120,30);
        final JTextField jt=new JTextField();
        jt.setBounds(50,100,200,30);
        
        // jb.addActionListener((ActionEvent e) -> 
        //     {
        //     jt.setText("Welcome to Javatpoint.");  
        //     }
        
        // );

        jb.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        jt.setText(x);  
                    }  
                });  

        ambika.add(jb);
        ambika.add(jt);
        ambika.setVisible(true);
        
    }
}
