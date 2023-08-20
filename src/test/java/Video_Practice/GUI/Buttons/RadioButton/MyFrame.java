package Video_Practice.GUI.Buttons.RadioButton;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
    
    JRadioButton pizzabButton;
    JRadioButton hamburgButton;
    JRadioButton hotdogButton;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Radio_Button");
        this.setLayout(new FlowLayout());

        pizzabButton = new JRadioButton("Pizza");
        hamburgButton = new JRadioButton("Hamburg");
        hotdogButton = new JRadioButton("HotDog");

        pizzabButton.setFocusable(false);
        hamburgButton.setFocusable(false);
        hotdogButton.setFocusable(false);

        pizzabButton.addActionListener(this);
        hamburgButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        ButtonGroup group = new ButtonGroup(); // radiobutton in one group 
        group.add(pizzabButton);
        group.add(hamburgButton);
        group.add(hotdogButton);

        this.add(pizzabButton);
        this.add(hamburgButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==pizzabButton){
        System.out.println("You ordered a Pizza");
       }
       else if(e.getSource()==hamburgButton){
        System.out.println("You ordered a Hamburg");
       }
       else if(e.getSource()==hotdogButton){
        System.out.println("You ordered a Hot_Dog");
       }
    }
}
