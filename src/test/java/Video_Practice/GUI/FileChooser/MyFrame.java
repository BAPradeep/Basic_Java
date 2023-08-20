package Video_Practice.GUI.FileChooser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;

import javax.swing.*;

public class MyFrame extends JFrame implements java.awt.event.ActionListener{
    
    JButton button;
    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("C:/Users/Pradeep B A/Downloads")); // open to place direct

            int choose = fileChooser.showOpenDialog(null); //select file to Save
            // int choose = fileChooser.showOpenDialog(null); // select file to open

            if(choose==JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
