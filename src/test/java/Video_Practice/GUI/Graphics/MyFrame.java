package Video_Practice.GUI.Graphics;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

    MyPanel panel;
    MyFrame(){

        panel = new MyPanel();
        this.setTitle("Graphices");
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 1000);

        this.add(panel);
        //this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }
}
