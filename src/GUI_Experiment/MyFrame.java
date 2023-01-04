package GUI_Experiment;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        this.setSize(420,420);
        this.setTitle("MENU ARSENALE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("Destiny2Logo.png");
        this.setIconImage(image.getImage());
        //this.getContentPane().setBackground(Color.BLACK);
    }
}
