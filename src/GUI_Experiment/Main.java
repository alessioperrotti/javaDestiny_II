package GUI_Experiment;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image= new ImageIcon(getClass().getResource("guns.png"));

        JLabel label = new JLabel();
        label.setText("Benvenuto nel menu arsenale");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        JFrame frame = new JFrame();  // non è necessario mettere un nome
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setBackground(Color.BLACK);
        frame.add(label);

    }
}
