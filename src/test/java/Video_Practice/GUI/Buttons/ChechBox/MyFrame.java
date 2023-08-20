package Video_Practice.GUI.Buttons.ChechBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class MyFrame extends JFrame implements ActionListener{
    
    ImageIcon wrong;
    ImageIcon correct;
    JCheckBox checkbox;
    JButton button;

    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        wrong = new ImageIcon("C:/Users/Pradeep B A/Downloads/ICON/Wrong");
        correct = new ImageIcon("C:/Users/Pradeep B A/Downloads/ICON/Correct");

        button = new JButton();
        button.setText("Submit");
        button.addActionListener(this);
        button.setFocusable(false);

        checkbox = new JCheckBox("I'm not a Robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas", Font.PLAIN,35));
        

        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkbox.isSelected());
        }
    }
}
