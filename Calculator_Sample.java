import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator_Sample implements ActionListener{
    private JFrame fr;
    private JPanel p1, p2;
    private JTextField txt;
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    private String tu;
    public Calculator_Sample(){
        fr = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        p1.setLayout(new BorderLayout());
        p2.setLayout(new GridLayout(4, 4));
        txt = new JTextField();
        b1 = new JButton("7");
        b1.addActionListener(this);
        b2 = new JButton("8");
        b2.addActionListener(this);
        b3 = new JButton("9");
        b3.addActionListener(this);
        b4 = new JButton("+");
        b4.addActionListener(this);
        b5 = new JButton("4");
        b5.addActionListener(this);
        b6 = new JButton("5");
        b6.addActionListener(this);
        b7 = new JButton("6");
        b7.addActionListener(this);
        b8 = new JButton("-");
        b8.addActionListener(this);
        b9 = new JButton("1");
        b9.addActionListener(this);
        b10 = new JButton("2");
        b10.addActionListener(this);
        b11 = new JButton("3");
        b11.addActionListener(this);
        b12 = new JButton("x");
        b12.addActionListener(this);
        b13 = new JButton("0");
        b13.addActionListener(this);
        b14 = new JButton("c");
        b14.addActionListener(this);
        b15 = new JButton("=");
        b15.addActionListener(this);
        b16 = new JButton("/");
        b16.addActionListener(this);
        
        p1.add(txt, BorderLayout.NORTH);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        
        fr.add(p1, BorderLayout.NORTH);
        fr.add(p2, BorderLayout.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ev){
        if (ev.getSource() == b4){
            txt.setText("");
        }
        else if (ev.getSource() == b8){
            txt.setText("");
        }
        else if (ev.getSource() == b12){
            txt.setText("");
        }
        else if (ev.getSource() == b16){
            txt.setText("");
        }
        else if (ev.getSource() == b14){
            txt.setText("");
        }
        else if (ev.getSource() == b3){
            txt.setText(tu  + "9");
        }
    }
}
