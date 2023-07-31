package Video_Practice.GUI.Frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        
        //  JFrame = a GUI window to add components to

        // JFrame frame = new JFrame();        //create a fram
        // frame.setTitle("JFrame Title goes here");   //sets title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application and try change "No_Nothing_ON_Close"
        // frame.setResizable(false); //prevent fram from being resized
        // frame.setSize(450, 420);    //sets the x-dimension, and y-dimension of frame
        // frame.setVisible(true); //make frame visible

        // ImageIcon image = new ImageIcon("C:/Users/Pradeep B A/Videos/developer.png"); // create an ImageIcon
        // frame.setIconImage(image.getImage()); //Change icon of frame
        // frame.getContentPane().setBackground(new Color(125,25,195)); //change color of background
        MyFrame myFrame = new MyFrame();
    }
}
