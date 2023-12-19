import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class InternationalIndonesia extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label1, label2, label3, imgLabel;
    private Font f1, f2, f3, f4, f5;
    private ImageIcon logo;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;
    private ButtonGroup radioButtonGroup;
    private JRadioButton pack1, pack2, pack3;
    private int selected = 0;
    JLabel background;
    ImageIcon image;

    InternationalIndonesia() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tour Management");
        this.setSize(900, 510);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 30);
        f2 = new Font("Segoe UI Semibold", Font.BOLD, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 20);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 25);

    

        // Cursor for JButtons and Radio Buttons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Title
        label1 = new JLabel();
        label1.setText("3 Packs Available for Indonesia Tour!");
        label1.setBounds(295, 35, 600, 50);
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel();
        label2.setText("Select One : ");
        label2.setBounds(295, 70, 510, 50);
        label2.setFont(f1);
        c.add(label2);

        // Pack 1 Details
        pack1 = new JRadioButton("Pack 1");
        pack1.setBounds(320, 120, 100, 50);
        pack1.setFont(f3);
        pack1.setBackground(Color.decode("#F2F2F2"));
        c.add(pack1);

        label3 = new JLabel();
        label3.setText("* First Class");
        label3.setBounds(320, 150, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 5 Star Hotel");
        label3.setBounds(320, 180, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* By Airplane");
        label3.setBounds(320, 210, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 5 Persons");
        label3.setBounds(320, 240, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 6 Days");
        label3.setBounds(320, 270, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $1510");
        label3.setBounds(320, 300, 520, 50);
        label3.setFont(f4);
        c.add(label3);

        // Pack 2 Details
        pack2 = new JRadioButton("Pack 2");
        pack2.setBounds(510, 120, 100, 50);
        pack2.setFont(f3);
        pack2.setBackground(Color.decode("#F2F2F2"));
        c.add(pack2);

        label3 = new JLabel();
        label3.setText("* Second Class");
        label3.setBounds(510, 150, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 3 Star Hotel");
        label3.setBounds(510, 180, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* By Airplane");
        label3.setBounds(510, 210, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Persons");
        label3.setBounds(510, 240, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Days");
        label3.setBounds(510, 270, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $800");
        label3.setBounds(510, 300, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        // Pack 3 Details
        pack3 = new JRadioButton("Pack 3");
        pack3.setBounds(720, 120, 510, 50);
        pack3.setFont(f3);
        pack3.setBackground(Color.decode("#F2F2F2"));
        c.add(pack3);

        label3 = new JLabel();
        label3.setText("* Third Class");
        label3.setBounds(720, 150, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 2 Star Hotel");
        label3.setBounds(720, 180, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* By Airplane");
        label3.setBounds(720, 210, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Persons");
        label3.setBounds(720, 240, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 3 Days");
        label3.setBounds(720, 270, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $600");
        label3.setBounds(720, 300, 510, 50);
        label3.setFont(f4);
        c.add(label3);

        // To group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(pack1);
        radioButtonGroup.add(pack2);
        radioButtonGroup.add(pack3);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(148, 375, 215, 50);
        btn1.setFont(f5);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(384, 375, 215, 50);
        btn2.setFont(f5);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);

        btn3 = new JButton("Pay");
        btn3.setBounds(617, 375, 215, 50);
        btn3.setFont(f5);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        image = new ImageIcon("./images/indoni.jpeg");
        background = new JLabel();
        background.setBounds(0, 0, 1000, 510);
        background.setIcon(image);
        c.add(background);

        Handler handler = new Handler();
        pack1.addActionListener(handler);
        pack2.addActionListener(handler);
        pack3.addActionListener(handler);

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                IntCountries frame = new IntCountries();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (selected == 0) {
                    JOptionPane.showMessageDialog(null, "You did not select any packs.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    Paymentoption frame = new Paymentoption();
                    frame.setVisible(true);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == pack1) {
                selected = 1;
            } else if (e.getSource() == pack2) {
                selected = 2;
            } else if (e.getSource() == pack3) {
                selected = 3;
            }
        }
    }

    public static void main(String[] args) {

        InternationalIndonesia frame = new InternationalIndonesia();
        frame.setVisible(true);
    }
}
