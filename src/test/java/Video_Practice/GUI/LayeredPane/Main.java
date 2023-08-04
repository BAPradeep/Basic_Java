package Video_Practice.GUI.LayeredPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import org.openqa.selenium.support.Color;


public class Main {
    public static void main(String[] args) {
        
        // JLayeredPane = Swing container that provides a third dimension for
        //                positioning components Ex. depth, z-index

        JLabel label = new JLabel();
        label.setOpaque(true);
        label.setBackground(java.awt.Color.BLUE);
        label.setBounds(50, 50, 200, 200);

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(java.awt.Color.RED);
        label1.setBounds(100, 100, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(java.awt.Color.GREEN);
        label2.setBounds(150, 150, 200, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 500, 500);
        layeredPane.add(label,Integer.valueOf(1));              // or JLayerdPane.Default
        layeredPane.add(label1,Integer.valueOf(0));             // or JLayoutPane.Drag
        layeredPane.add(label2,JLayeredPane.DRAG_LAYER);          // or Integer.Value(number)

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(layeredPane);
    }
}
