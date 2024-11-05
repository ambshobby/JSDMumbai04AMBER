import javax.swing.*;
import java.awt.Color;
import helper_classes.*;

public class WindowBuilder {
  public static void main(String[] args) {

     JFrame frame = new JFrame("My Awesome Window");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(824, 445);
     JPanel panel = new JPanel();
     panel.setLayout(null);
     panel.setBackground(Color.decode("#1e1e1e"));

     JButton element1 = new JButton("Click Me");
     element1.setBounds(130, 40, 106, 29);
     element1.setBackground(Color.decode("#2e2e2e"));
     element1.setForeground(Color.decode("#D9D9D9"));
     element1.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element1.setBorder(new RoundedBorder(4, Color.decode("#979797"), 1));
     element1.setFocusPainted(false);
     OnClickEventHelper.setOnClickColor(element1, Color.decode("#232323"), Color.decode("#2e2e2e"));
     panel.add(element1);

     JTextArea element2 = new JTextArea("");
     element2.setBounds(449, 32, 106, 41);
     element2.setFont(CustomFontLoader.loadFont("./resources/fonts/Lato.ttf", 14));
     element2.setBackground(Color.decode("#B2B2B2"));
     element2.setForeground(Color.decode("#656565"));
     element2.setBorder(new RoundedBorder(2, Color.decode("#979797"), 0));
     OnFocusEventHelper.setOnFocusText(element2, "Your long Input!", Color.decode("#353535"),   Color.decode("#656565"));
     panel.add(element2);

     frame.add(panel);
     frame.setVisible(true);

  }
}