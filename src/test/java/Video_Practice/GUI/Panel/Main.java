package Video_Practice.GUI.Panel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args){

        //JPanel = a GUI component that function as a container to hold other components

        ImageIcon imageIcon = new ImageIcon("C:/Users/Pradeep B A/Videos/developer.png");

        JLabel label = new JLabel();
        label.setText("HI Welcome to Earth");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 14));
        label.setIcon(imageIcon);
        label.setVerticalAlignment(JLabel.TOP);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setLayout(null);
        greenpanel.setBounds(0, 0, 250, 250);
        greenpanel.setLayout(null);

        JPanel bluPanel = new JPanel();
        bluPanel.setBackground(Color.BLUE);
        //bluPanel.setLayout(null);
        bluPanel.setBounds(250, 0, 250, 250);

        JPanel yellowJPanel = new JPanel();
        yellowJPanel.setBackground(Color.YELLOW);
        yellowJPanel.setBounds(500, 0, 250, 250);
        yellowJPanel.setLayout(null);

        JPanel redJPanel = new JPanel();
        redJPanel.setBackground(Color.red);
        redJPanel.setBounds(750, 0, 250, 250);
        redJPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Layout of Color");
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(1000, 650);
        frame.add(greenpanel);
        frame.add(bluPanel);
        frame.add(yellowJPanel);
        frame.add(redJPanel);
        bluPanel.add(label);

    }
}
