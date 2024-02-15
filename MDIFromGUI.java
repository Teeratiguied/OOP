import java.awt.BorderLayout;
import javax.swing.*;
public class MDIFromGUI {
    private JDesktopPane desktopPane;
    private JInternalFrame fr1, fr2, fr3;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi1, mi2, mi3, mi4, msi1, msi2;
    
    public MDIFromGUI(){
        fr = new JFrame();
        /*desktopPane = new JDesktopPane();
        fr1 = new JInternalFrame("Frame 1", true, true, true,true);
        fr2 = new JInternalFrame("Frame 2",true, true, true,true);
        fr3 = new JInternalFrame("Frame 3",true, true, true,true);
        
        fr1.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        fr1.pack();
        fr1.setVisible(true);
        
        fr2.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        fr2.pack();
        fr2.setVisible(true);
        
        fr3.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        fr3.pack();
        fr3.setVisible(true);
        
        desktopPane.add(fr1);
        desktopPane.add(fr2);
        desktopPane.add(fr3);
        
        this.add(desktopPane, BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(300, 300));
        this.pack();
        this*/
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        
        fr.setJMenuBar(mb);
        mb.add(m1); mb.add(m2); mb.add(m3);
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add( mi4);
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        
        fr.setSize(200, 200);
        fr.setVisible(true);

    }
}
