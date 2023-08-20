package Video_Practice.GUI.Slider;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider implements ChangeListener {
    
    JFrame frame;
    JLabel label;
    JPanel panel;
    JSlider slider;

    Slider(){

        frame = new JFrame("Slider Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,32);

        slider.setPreferredSize(new Dimension(600,350));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10); 

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25); // for example max 200, each step 25 like 0,25,50,75,100

        slider.setPaintLabels(true); // its using show in number 
        slider.setFont(new Font("MV boli",Font.PLAIN, 15));
        label.setFont(new Font("MV boli",Font.PLAIN, 25));

        //slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.setOrientation(SwingConstants.VERTICAL); //rotate 

        label.setText("*C = "+slider.getValue());
        slider.addChangeListener(this);

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(560, 520);
        frame.setVisible(true);
        
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("*C = "+slider.getValue());
    }
}
