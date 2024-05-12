import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Converter extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField field1, field2;
    private JButton calculate;

    public Converter() {
        JFrame frame = new JFrame();
        frame.setTitle("Kilometer-to-Miles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1000, 500);
        frame.setLayout(null);
        frame.setResizable(false);

        label1 = new JLabel("Miles: ");
        label1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label1.setForeground(Color.black);
        label1.setBounds(100, 50, 150, 50);
        frame.add(label1);

        field1 = new JTextField();
        field1.setBounds(250, 50, 200, 50);
        field1.setText("Enter in miles");
        field1.setFont(new Font("MV Boli", Font.BOLD, 15));
        field1.setForeground(Color.gray);
        frame.add(field1);

        label2 = new JLabel("Kilometers: ");
        label2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label2.setForeground(Color.black);
        label2.setBounds(100, 150, 150, 50);
        frame.add(label2);

        field2 = new JTextField();
        field2.setBounds(250, 150, 200, 50);
        field2.setText("kilometers");
        field2.setFont(new Font("MV Boli", Font.BOLD, 15));
        field2.setForeground(Color.gray);
        frame.add(field2);

        calculate = new JButton("Calculate");
        calculate.setBounds(280, 270, 100, 50);
        calculate.setFocusable(false);
        calculate.setFont(new Font("Times New Roman", Font.BOLD, 15));
        calculate.setBackground(Color.gray);
        calculate.setBorder(BorderFactory.createEtchedBorder());
        calculate.addActionListener(this);
        frame.add(calculate);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == calculate) {
                float a = Integer.parseInt(field1.getText());
                float b = a * 1.609f;
                field2.setText("" + b);
            }
        } catch (NumberFormatException e1) {
            field2.setText("Please enter valid number");
        }
    }
}

public class PracticeTwo {
    public static void main(String[] args) {
        new Converter();
    }
}
