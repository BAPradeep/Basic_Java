package Video_Practice.GUI.Buttons.ComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrames extends JFrame implements ActionListener {
    
    JComboBox comboBox;
    MyFrames(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String [] Department = {"Computer Science & Engineer","Business","Machine Electron","Infomration Technology","Biology Engineer","Commerial"};
        comboBox = new JComboBox(Department);
        comboBox.addActionListener(this);

        //comboBox.setEnabled(false);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("Network Engineer");
        //comboBox.addItem("CyberSecurity Engineer");
        //comboBox.insertItemAt("Data Science", 1);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("Business");
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
