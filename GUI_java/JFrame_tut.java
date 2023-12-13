import javax.swing.*;
import java.awt.*;

public class JFrame_tut {
    public static void main(String[] args) {

        JLabel label = new JLabel();
        label.setText("Enter your name");
        label.setBackground(Color.white);

        JFrame frame = new JFrame();
        frame.setTitle("Our first jframe tut");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(450, 450);
        frame.getContentPane().setBackground(new Color(0xFFFFFF));
        frame.add(label);
    }
}
