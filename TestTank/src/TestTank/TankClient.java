package TestTank;

/**
 * Created by Andy on 2016/9/28.
 */
import javax.swing.*;
import java.awt.*;


public class TankClient extends JFrame{
    @Override
    public void paint(Graphics g) {
       Color c =g.getColor();
        g.setColor(Color.red);
        g.fillOval(50,50,30,30);
        g.setColor(c);
    }

    public void lauchFrame(){
        setLocation(400,300);
        setSize(800,800);
        setTitle("TankWar");
        setVisible(true);
        setResizable(false);
        setBackground(Color.cyan);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        TankClient tc = new TankClient();
        tc.lauchFrame();
    }
}