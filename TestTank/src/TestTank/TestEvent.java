package TestTank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Andy on 2016/9/28.
 */
public class TestEvent extends JFrame{
    static JButton button = new JButton("隐藏按钮");
    public void mouseListen(){
        setTitle("mouse test");
        setResizable(false);
        setBounds(300,300,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        add(button);
        MouseMove mm = new MouseMove();
        button.addMouseListener(mm);
        button.setBounds(new Rectangle(45,100,90,30));
        button.setBackground(Color.cyan);
        button.setVisible(true);
    }
   class MouseMove extends MouseAdapter{
       @Override
       public void mouseClicked(MouseEvent e) {
            TestEvent.button.setVisible(false);
       }
       @Override
       public void mouseExited(MouseEvent e) {
           TestEvent.button.setVisible(true);
       }
   }
    public static void main(String[] args) {
        TestEvent te = new TestEvent();
        te.mouseListen();
    }
}
