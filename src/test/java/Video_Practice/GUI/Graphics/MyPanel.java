package Video_Practice.GUI.Graphics;

import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(){

    }

    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(8));
        g2D.drawLine(0, 0, 500, 500);
       
        g2D.setPaint(Color.ORANGE);
        g2D.drawRect(0, 0, 250, 300);
        g2D.setPaint(Color.RED);
        g2D.fillRect(0, 0, 250, 300);

        g2D.setPaint(Color.GREEN);
        g2D.drawOval(400, 20, 250, 300);
        g2D.setPaint(Color.PINK);
        g2D.fillOval(400, 20, 250, 300);

        g2D.setPaint(Color.WHITE);
        g2D.drawOval(20, 350, 300, 300);
        g2D.setPaint(Color.RED);
        g2D.fillArc(20, 350, 300, 300,0,180);
        g2D.setPaint(Color.WHITE);
        g2D.fillArc(20, 350, 300, 300,180,180);

        int[] xpoint = {150,250,350};
        int[] ypoint = {300,150,300};
        g2D.setPaint(Color.GREEN);
        g2D.drawPolygon(xpoint, ypoint,3);
        g2D.fillPolygon(xpoint, ypoint,3);

        g2D.setPaint(Color.WHITE);
        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("U R A WINNER!  :-D", 50, 50);
    }
    
}
