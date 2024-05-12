import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField field1, field2, field3;
    private JButton add, sub, mul, div, reset;

    public Calculator() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(1000, 500);
        frame.setResizable(false);

        label1 = new JLabel();
        label1.setText("Enter First Number: ");
        label1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label1.setBounds(50, 50, 200, 30);
        label1.setBackground(Color.black);
        frame.add(label1);

        field1 = new JTextField();
        field1.setText("Enter number here");
        field1.setFont(new Font("MV Boli", Font.BOLD, 15));
        field1.setForeground(Color.gray);
        field1.setBounds(250, 50, 200, 30);
        frame.add(field1);

        label2 = new JLabel();
        label2.setText("Enter First Second: ");
        label2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label2.setBounds(50, 100, 200, 30);
        label2.setBackground(Color.black);
        frame.add(label2);

        field2 = new JTextField();
        field2.setText("Enter number here");
        field2.setFont(new Font("MV Boli", Font.BOLD, 15));
        field2.setForeground(Color.gray);
        field2.setBounds(250, 100, 200, 30);
        frame.add(field2);

        label3 = new JLabel();
        label3.setText("Result: ");
        label3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label3.setBounds(50, 150, 200, 30);
        label3.setBackground(Color.black);
        frame.add(label3);

        field3 = new JTextField();
        field3.setText("Result");
        field3.setFont(new Font("MV Boli", Font.BOLD, 15));
        field3.setForeground(Color.gray);
        field3.setBounds(250, 150, 200, 30);
        field3.setEditable(false);
        frame.add(field3);

        add = new JButton();
        add.setBounds(50, 250, 150, 50);
        add.setText("+");
        add.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add.setFocusable(false);
        add.setBackground(Color.GRAY);
        add.setBorder(BorderFactory.createEtchedBorder());
        frame.add(add);

        sub = new JButton();
        sub.setBounds(250, 250, 150, 50);
        sub.setText("-");
        sub.setFont(new Font("Times New Roman", Font.BOLD, 20));
        sub.setFocusable(false);
        sub.setBackground(Color.GRAY);
        sub.setBorder(BorderFactory.createEtchedBorder());
        frame.add(sub);

        mul = new JButton();
        mul.setBounds(450, 250, 150, 50);
        mul.setText("*");
        mul.setFont(new Font("Times New Roman", Font.BOLD, 20));
        mul.setFocusable(false);
        mul.setBackground(Color.GRAY);
        mul.setBorder(BorderFactory.createEtchedBorder());
        frame.add(mul);

        div = new JButton();
        div.setBounds(650, 250, 150, 50);
        div.setText("/");
        div.setFont(new Font("Times New Roman", Font.BOLD, 20));
        div.setFocusable(false);
        div.setBackground(Color.GRAY);
        div.setBorder(BorderFactory.createEtchedBorder());
        frame.add(div);

        reset = new JButton();
        reset.setBounds(350, 350, 150, 50);
        reset.setFocusable(false);
        reset.setText("Reset");
        reset.setFont(new Font("Times New Roman", Font.BOLD, 20));
        reset.setBackground(Color.gray);
        reset.setBorder(BorderFactory.createEtchedBorder());
        frame.add(reset);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        reset.addActionListener(this);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == add) {
                int a = Integer.parseInt(field1.getText());
                int b = Integer.parseInt(field2.getText());
                int result = a + b;
                field3.setText("" + result);
            }
            if (e.getSource() == sub) {
                int a = Integer.parseInt(field1.getText());
                int b = Integer.parseInt(field2.getText());
                int result = a - b;
                field3.setText("" + result);
            }
            if (e.getSource() == mul) {
                int a = Integer.parseInt(field1.getText());
                int b = Integer.parseInt(field2.getText());
                int result = a * b;
                field3.setText("" + result);
            }
            if (e.getSource() == div) {
                float a = Integer.parseInt(field1.getText());
                float b = Integer.parseInt(field2.getText());
                float result = a / b;
                field3.setText("" + result);
            }
            if (e.getSource() == reset) {
                field1.setText("");
                field2.setText("");
                field3.setText("");
            }
        } catch (NumberFormatException e1) {
            field3.setText("Please input integers only");
        } catch (ArithmeticException e2) {
            field3.setText("You can't divide by zero");
        }
    }
}

public class PracticeOne {
    public static void main(String[] args) {
        new Calculator();
    }
}