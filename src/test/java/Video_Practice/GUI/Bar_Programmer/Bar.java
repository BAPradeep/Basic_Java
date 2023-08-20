package Video_Practice.GUI.Bar_Programmer;

import java.awt.*;
import javax.swing.*;

public class Bar {
    
    JFrame frame = new JFrame("Program Bar");
    JProgressBar pBar = new JProgressBar(0,100);

    Bar(){

        pBar.setValue(0);
        pBar.setBounds(0, 80, 420, 50);
        pBar.setStringPainted(true);
        pBar.setFont(new Font("MV Boli", Font.BOLD, 20));
        pBar.setForeground(Color.RED);
        pBar.setBackground(Color.BLACK);

        frame.add(pBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int counter = 0;
        
        while(counter<=1000){
            pBar.setValue(counter);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter +=1;
        }
        pBar.setString("FInished ;-)");
    }
}
