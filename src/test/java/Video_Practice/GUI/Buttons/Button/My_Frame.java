package Video_Practice.GUI.Buttons.Button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class My_Frame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;

    My_Frame(){

        ImageIcon imageIcon = new ImageIcon("C:/Users/Pradeep B A/Videos/developer.png");

        label = new JLabel();
        label.setIcon(imageIcon);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(150,100,250,110);
        button.setText("Click on Button");
        button.setFocusable(false);
        button.setIcon(imageIcon);
        button.setIconTextGap(-110);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setFont(new Font("Comic sans", Font.BOLD,25));
        button.setBackground(Color.GREEN);
        button.setForeground(Color.red);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 750);
        this.setVisible(true);
        this.setLayout(null);
        this.setTitle("Make a Button");
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Come on");
           // button.setEnabled(false); // false is one click then block of button and true is more click then no block of button
           label.setVisible(true);
        }
    }
}
