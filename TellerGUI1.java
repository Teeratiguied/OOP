import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class TellerGUI1 implements ActionListener{
    private JFrame fr;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JLabel l1;
    private JLabel l2;
    private JTextField tf1;
    private JTextField tf2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
   
    public TellerGUI1() {
        fr = new JFrame("Teller GUI");
        p1 = new JPanel(); p2 = new JPanel(); p3 = new JPanel(); p4 = new JPanel();
        l1 = new JLabel("  Balance"); l2 = new JLabel("  Amount");
        tf1 = new JTextField("6000"); tf2 = new JTextField();
        b1 = new JButton("Deposit"); b2 = new JButton("Withdraw"); b3 = new JButton("Exit");
        
        p1.setLayout(new GridLayout(1,2));
        p1.add(l1);
        tf1.setEditable(false);
        p1.add(tf1);
        
        p2.setLayout(new GridLayout(1,2));
        p2.add(l2);
        p2.add(tf2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        p3.setLayout(new FlowLayout());
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(p1);
        fr.add(p2);
        fr.add(p3);
        fr.add(p4);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        } else if (e.getActionCommand().equals("Deposit")) {
            double currentValue = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText());
            tf1.setText(String.valueOf(currentValue));
            
        } else if (e.getActionCommand().equals("Withdraw")) {
            double currentValue = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
            if (currentValue < 0) {
                tf1.setText(String.valueOf(0));
            } else {
                tf1.setText(String.valueOf(currentValue));
            }
        }
        
    }
}
