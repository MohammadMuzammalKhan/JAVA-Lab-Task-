import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.AsymmetricKey;

class Tasbeeh extends JFrame implements ActionListener {
    private JButton tasbihFatima, Awalkalma, Astagfar, Darood, ayatEkarima, Reset, Count;
    private JLabel label, count;
    private JPanel panel1, panel1_1, panel1_2, panel1_3;

    public Tasbeeh() {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 500, 500);
        frame.setLayout(new GridLayout());
        // frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // -------------For-panel1_1----------------------
        tasbihFatima = new JButton("Tasbih Fatima");
        tasbihFatima.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tasbihFatima.setFocusable(false);
        tasbihFatima.setBorder(BorderFactory.createEtchedBorder());

        Awalkalma = new JButton("Awal Kalma(100)");
        Awalkalma.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Awalkalma.setFocusable(false);
        Awalkalma.setBorder(BorderFactory.createEtchedBorder());

        Astagfar = new JButton("Astagfar(100)");
        Astagfar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Astagfar.setFocusable(false);
        Astagfar.setBorder(BorderFactory.createEtchedBorder());
        
        Darood = new JButton("Darood(100)");
        Darood.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Darood.setFocusable(false);
        Darood.setBorder(BorderFactory.createEtchedBorder());
        
        ayatEkarima = new JButton("Ayat-E-Karima(100)");
        ayatEkarima.setFont(new Font("Times New Roman", Font.BOLD, 20));
        ayatEkarima.setFocusable(false);
        ayatEkarima.setBorder(BorderFactory.createEtchedBorder());
        
        Reset = new JButton("Reset");
        Reset.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Reset.setFocusable(false);
        Reset.setBorder(BorderFactory.createEtchedBorder());

        panel1_1 = new JPanel();
        panel1_1.setLayout(new GridLayout(3, 3, 10, 10));
        panel1_1.add(tasbihFatima);
        panel1_1.add(Awalkalma);
        panel1_1.add(Astagfar);
        panel1_1.add(Darood);
        panel1_1.add(ayatEkarima);
        panel1_1.add(Reset);
        // -------------------panel1_2---------------------------

        panel1_2 = new JPanel();
        panel1_2.setBorder(BorderFactory.createLineBorder(Color.black));

        label = new JLabel("Select Tasbeeh: ");
        label.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        label.setForeground(Color.black);
        label.setBounds(10, 10, 100, 30);

        count = new JLabel();
        count.setText("0");
        count.setFont(new Font("Times New Roman", Font.BOLD, 50));
        count.setBounds(0, 10, 100, 50);
        count.setVerticalTextPosition(JLabel.CENTER);
        count.setHorizontalTextPosition(JLabel.CENTER);

        panel1_2.add(label);
        panel1_2.add(count);
        // ------------------panel1_3-------------------------

        panel1_3 = new JPanel();
        panel1_3.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1_3.setLayout(new GridLayout(1, 1));

        Count = new JButton("Count");
        Count.setFont(new Font("Times New Roman", Font.BOLD, 20));
        Count.setFocusable(false);
        Count.setBorder(BorderFactory.createEtchedBorder());
        panel1_3.add(Count);
        // --------------------panel1--------------------------
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1, 10, 10));
        // panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel1.add(panel1_1);
        panel1.add(panel1_2);
        panel1.add(panel1_3);

        tasbihFatima.addActionListener(this);
        Awalkalma.addActionListener(this);
        Astagfar.addActionListener(this);
        Darood.addActionListener(this);
        ayatEkarima.addActionListener(this);
        Reset.addActionListener(this);
        Count.addActionListener(this);
        frame.add(panel1);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == tasbihFatima) {
                label.setText("Say Subhan Allah: ");
                count.setText("0");
            }
            if (e.getSource() == Awalkalma) {
                label.setText("Say Kalma: ");
                count.setText("0");
            }
            if (e.getSource() == Astagfar) {
                label.setText("Say Astagfar: ");
                count.setText("0");
            }
            if (e.getSource() == Darood) {
                label.setText("Say Darood: ");
                count.setText("0");
            }
            if (e.getSource() == ayatEkarima) {
                label.setText("Ayat-E-Karima: ");
                count.setText("0");
            }
            if (e.getSource() == Reset) {
                label.setText("Select Tasbeeh: ");
                count.setText("0");
            }
            if (e.getSource() == Count) {
                int a = Integer.parseInt(count.getText());
                a++;
                if (label.getText().equals("Say Subhan Allah: ")) {
                    if (a == 33) {
                        label.setText("Say Alhamdulillah: ");
                        a = 0;
                    }
                } else if (label.getText().equals("Say Alhamdulillah: ")) {
                    if (a == 33) {
                        label.setText("Say Allah Akbar: ");
                        a = 0;
                    }
                } else if (label.getText().equals("Say Allah Akbar: ")) {
                    if (a == 34) {
                        label.setText("Say Subhan Allah: ");
                        a = 0;
                    }
                }
                count.setText("" + a);
            }
        } catch (NumberFormatException e1) {
        }

    }
}

public class PractiveFour {
    public static void main(String[] args) {
        new Tasbeeh();
    }
}
