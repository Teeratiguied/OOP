import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel l1, l2;
    private JTextField txt1, txt2;
    private JButton b1,  b2, b3;
    public TellerGUI(){
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        txt1 = new JTextField("6000", 15);
        txt2 = new JTextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
        p1.setLayout(new BorderLayout());
        p1.add(l1, BorderLayout.WEST);
        p1.add(txt1);
        
        p2.setLayout(new BorderLayout());
        p2.add(l2, BorderLayout.WEST);
        p2.add(txt2);
        
        p3.setLayout(new GridLayout(1, 3));
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        fr.add(p3, BorderLayout.SOUTH);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
