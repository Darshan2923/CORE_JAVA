import javax.swing.*;
import java.awt.*;

public class JFrame_tut {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Our first jframe tut");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(450, 450);
        frame.getContentPane().setBackground(new Color(0x123456));
    }
}
