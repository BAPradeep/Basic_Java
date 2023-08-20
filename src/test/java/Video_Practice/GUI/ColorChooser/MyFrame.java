package Video_Practice.GUI.ColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{
    
    JLabel label;
    JButton button;
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Pick a Color");
        button.setFocusable(false);
        button.addActionListener(this);

        label = new JLabel("This is Some text :D ");
        label.setBackground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            //JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null, "Pick a Color... I Guess", Color.BLACK);

            label.setForeground(color);
            //label.setBackground(color);
        }
    }
}
