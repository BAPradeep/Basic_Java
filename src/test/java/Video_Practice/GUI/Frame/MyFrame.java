package Video_Practice.GUI.Frame;

import java.awt.Color;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JFrame;

import org.openqa.selenium.support.Color;

public class MyFrame extends JFrame{
    
    MyFrame(){
        this.setTitle("Jthis Title goes here");   //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out of application and try change "No_Nothing_ON_Close"
        this.setResizable(false); //prevent fram from being resized
        this.setSize(450, 420);    //sets the x-dimension, and y-dimension of this
        this.setVisible(true); //make this visible

        javax.swing.ImageIcon image = new javax.swing.ImageIcon("C:/Users/Pradeep B A/Videos/developer.png"); // create an ImageIcon
        this.setIconImage(image.getImage()); //Change icon of this
        this.getContentPane().setBackground(new Color(242, 158, 240)); //change color of background
    }
}
