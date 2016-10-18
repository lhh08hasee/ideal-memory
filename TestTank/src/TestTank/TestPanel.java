package TestTank;

import java.awt.*;

/**
 * Created by Andy on 2016/9/30.
 */
public class TestPanel {
    public static void main(String[] args) {
        new NewFrame("This is a Panel",300,300,400,300);
    }
}
    class NewFrame extends Frame{
        private Panel p1,p2,p3,p4;
        NewFrame(String s,int x,int y,int w,int h){
            super(s);
            setLayout(null);
            p1 = new Panel(null);
            p2 = new Panel(null);
            p3 = new Panel(null);
            p4 = new Panel(null);
            p1.setBackground(Color.cyan);
            p2.setBackground(Color.black);
            p3.setBackground(Color.blue);
            p4.setBackground(Color.red);
            p1.setBounds(0,0,w/2,h/2);
            p2.setBounds(0,h/2,w/2,h/2);
            p3.setBounds(w/2,0,w/2,h/2);
            p4.setBounds(w/2,h/2,w/2,h/2);
            add(p1);add(p2);add(p3);add(p4);
            setBounds(x,y,w,h);
            setVisible(true);
        }
    }

