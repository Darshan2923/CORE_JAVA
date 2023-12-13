import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {
    JLabel name, street, city, pinCode;
    JTextField _name, _street, _city, _pinCode;
    JButton MyInfo;

    public Frame() {
        getContentPane().setBackground(new Color(123, 52, 250));
        setLayout(null);
        setLocation(500, 100);
        setSize(600, 600);
        code: setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        name = new JLabel("Enter your name");
        name.setBounds(50, 50, 200, 40); // Adjusted the position
        name.setFont(new Font("MV Boli", Font.BOLD, 20));
        name.setForeground(Color.WHITE);
        add(name);
        _name = new JTextField(); // Corrected variable assignment
        _name.setBounds(200, 50, 200, 40); // Adjusted the position
        add(_name);

        street = new JLabel("Enter street you live in");
        street.setBounds(50, 100, 200, 40);
        street.setFont(new Font("MV Boli", Font.BOLD, 20));
        street.setForeground(Color.WHITE);
        add(street); // Corrected variable name
        _street = new JTextField(); // Corrected variable assignment
        _street.setBounds(200, 100, 200, 40);
        add(_street);

        city = new JLabel("Enter city you live in");
        city.setBounds(50, 150, 200, 40); // Adjusted the position
        city.setFont(new Font("MV Boli", Font.BOLD, 20));
        city.setForeground(Color.WHITE);
        add(city);
        _city = new JTextField();
        _city.setBounds(200, 150, 200, 40); // Adjusted the position
        add(_city);

        pinCode = new JLabel("Enter your pinCode");
        pinCode.setBounds(50, 200, 200, 40); // Adjusted the position
        pinCode.setFont(new Font("MV Boli", Font.BOLD, 20));
        pinCode.setForeground(Color.WHITE);
        add(pinCode); // Corrected variable name
        _pinCode = new JTextField(); // Corrected variable assignment
        _pinCode.setBounds(200, 200, 200, 40); // Adjusted the position
        add(_pinCode);

        MyInfo = new JButton("Submit");
        MyInfo.setBounds(200, 300, 100, 50); // Adjusted the position
        MyInfo.addActionListener(e -> {
            String textName = _name.getText();
            String textCity = _city.getText();
            String textStreet = _street.getText();
            String textPin = _pinCode.getText();

            if (textName.isEmpty() || textCity.isEmpty() || textStreet.isEmpty() || textPin.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Give Valid Inputs", "INVALID", JOptionPane.WARNING_MESSAGE);
            } else {
                _name.setFont(new Font("Arial", Font.ITALIC, 32));
                _city.setFont(new Font("Arial", Font.ITALIC, 32));
                _street.setFont(new Font("Arial", Font.ITALIC, 32));
                _pinCode.setFont(new Font("Arial", Font.ITALIC, 32));
            }
        });
        add(MyInfo);
        setVisible(true);

    }
}

public class Forms {
    public static void main(String[] args) {
        new Frame();
    }
}
