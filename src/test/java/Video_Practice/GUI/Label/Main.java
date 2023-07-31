package Video_Practice.GUI.Label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
    public static void main(String[] args) {
        
        //JLabel = a GUI display area for a string of text, and an image, or both

        ImageIcon image = new ImageIcon("C:/Users/Pradeep B A/Videos/developer.png");
        Border border = BorderFactory.createLineBorder(Color.BLUE,6);

        JLabel label = new JLabel(); //create a label
        label.setText("HI welcome to java code"); //set text of label
        label.setIcon(image); 
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTER,RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(125, 250, 150)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 34)); // set font of text
        label.setIconTextGap(30); //set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); //display background color
        label.setBorder(border); // set border of label ( not image + text)
        label.setHorizontalAlignment(JLabel.CENTER); // set vertical  position of icon+text within label
        label.setVerticalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450); //sets the x-dimension, and y-dimension of frame
        frame.setVisible(true); // make frame visible
        frame.add(label); // above method to other method varible access
        //frame.pack();
    }
}
