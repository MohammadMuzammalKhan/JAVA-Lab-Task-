import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BMI extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4, label5, label6;
    private JTextField field1, field2, field3, field4;
    private JButton computeBMI, clear, exit;

    public BMI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1000, 500);
        frame.setLayout(null);
        frame.setTitle("BMI Calculator");
        frame.setResizable(false);

        label1 = new JLabel("Height:");
        label1.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        label1.setForeground(Color.black);
        label1.setBounds(100, 25, 100, 50);
        frame.add(label1);

        field1 = new JTextField("feet");
        field1.setFont(new Font("MV Boli", Font.BOLD, 15));
        field1.setForeground(Color.gray);
        field1.setBounds(200, 25, 100, 50);
        frame.add(field1);

        label2 = new JLabel("feet");
        label2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label2.setBounds(310, 25, 50, 50);
        frame.add(label2);

        field2 = new JTextField("inches");
        field2.setFont(new Font("MV Boli", Font.BOLD, 15));
        field2.setForeground(Color.gray);
        field2.setBounds(400, 25, 100, 50);
        frame.add(field2);

        label3 = new JLabel("inches");
        label3.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label3.setBounds(510, 25, 100, 50);
        frame.add(label3);

        label4 = new JLabel("Weight:");
        label4.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        label4.setForeground(Color.black);
        label4.setBounds(100, 150, 100, 50);
        frame.add(label4);

        field3 = new JTextField("weight");
        field3.setFont(new Font("MV Boli", Font.BOLD, 15));
        field3.setForeground(Color.gray);
        field3.setBounds(200, 150, 100, 50);
        frame.add(field3);

        label5 = new JLabel("pounds");
        label5.setFont(new Font("Times New Roman", Font.ITALIC, 20));
        label5.setForeground(Color.black);
        label5.setBounds(310, 150, 100, 50);
        frame.add(label5);

        label6 = new JLabel("BMI:");
        label6.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        label6.setForeground(Color.black);
        label6.setBounds(100, 250, 100, 50);
        frame.add(label6);

        field4 = new JTextField("BMI");
        field4.setFont(new Font("MV Boli", Font.BOLD, 15));
        field4.setForeground(Color.gray);
        field4.setBounds(200, 250, 300, 50);
        frame.add(field4);

        computeBMI = new JButton("Compute BMI");
        computeBMI.setFont(new Font("TImes New Roman", Font.BOLD, 20));
        computeBMI.setFocusable(false);
        computeBMI.setBackground(Color.gray);
        computeBMI.setBorder(BorderFactory.createEtchedBorder());
        computeBMI.setBounds(100, 350, 300, 50);
        frame.add(computeBMI);

        clear = new JButton("Clear");
        clear.setFont(new Font("Times New Roman", Font.BOLD, 15));
        clear.setFocusable(false);
        clear.setBackground(Color.gray);
        clear.setBorder(BorderFactory.createEtchedBorder());
        clear.setBounds(450, 350, 100, 50);
        frame.add(clear);

        exit = new JButton("Exit");
        exit.setFont(new Font("Times New Roman", Font.BOLD, 15));
        exit.setFocusable(false);
        exit.setBackground(Color.gray);
        exit.setBorder(BorderFactory.createEtchedBorder());
        exit.setBounds(600, 350, 100, 50);
        frame.add(exit);

        computeBMI.addActionListener(this);
        clear.addActionListener(this);
        exit.addActionListener(this);

        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try 
        {

            if (e.getSource() == computeBMI) {
                int f = Integer.parseInt(field1.getText());
                int i = Integer.parseInt(field2.getText());
                float weight = Float.parseFloat(field3.getText());
                float tot_inches = f * 12 + i;
                float height = tot_inches * 0.0254f;
                float bmi = (weight / (height * height));
                field4.setText("%0.2f" + bmi);
            }
            if (e.getSource() == clear) 
            {
                field1.setText("");
                field2.setText("");
                field3.setText("");
                field4.setText("");
            }
            if (e.getSource() == exit) 
            {
                System.exit(0);
            }
        } catch (NumberFormatException e1) 
        {
            field4.setText("Please enter valid entries");
        }
    }
}

public class PracticeThree {
    public static void main(String[] args) {
        new BMI();
    }
}
