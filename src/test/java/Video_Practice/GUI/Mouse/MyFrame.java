package Video_Practice.GUI.Mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{
    
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(10, 10, 100, 100);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Invoked when the mouse button has been click (pressed and released) on a component
        System.out.println("You click the mouse");
        label.setBackground(Color.BLUE);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Invoked when a mouse button has been pressed on a component
        System.out.println("You Pressed the mouse");
        label.setBackground(Color.GREEN);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Invoked when a mouse button has been released on a component
        System.out.println("You release the mouse");
        label.setBackground(Color.ORANGE);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // Invoked when the mouse exit a component
       System.out.println("You enter the component");
       label.setBackground(Color.pink);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
        System.out.println("You exited the component");
        label.setBackground(Color.MAGENTA);
        System.exit(1);
    }
}
