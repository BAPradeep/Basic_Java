package Video_Practice.GUI.Gamer_TIme;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class MyPanel extends JPanel implements ActionListener{
    
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image Flash;
    Image Background;
    Timer timer;
    int xVelocity = 1, yVelocity = 2;
    int x=0 , y=0;

    MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLUE);

        Flash = new ImageIcon("C:/Users/Pradeep B A/Downloads/ICON/Wrong.png").getImage();
        timer = new Timer(1000, this);
        timer.start();
        
    }

    public void paint(Graphics g){
        super.paint(g); // paint background
        Graphics2D g2d = (Graphics2D)g;

        g2d.drawImage(Flash, x, y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=PANEL_WIDTH-Flash.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();

        if(y>=PANEL_HEIGHT-Flash.getWidth(null) || y<0){
            yVelocity = yVelocity* -1;
        }
        y = y+yVelocity;
        repaint();;
    }
}
