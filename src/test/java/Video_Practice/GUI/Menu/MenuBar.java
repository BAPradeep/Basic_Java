package Video_Practice.GUI.Menu;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class MenuBar extends JFrame implements ActionListener {

    JMenuBar menubBar;
    JMenu FileMenu;
    JMenu EditMenu;
    JMenu HelpMenu;
    JMenu SelectionMenu;
    JMenu ViewMenu;
    JMenu GOMenu;
    JMenu RunMenu;
    JMenuItem LoadItem;
    JMenuItem SaveItem;
    JMenuItem ExitItem;
    MenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 300);

        menubBar = new JMenuBar();

        FileMenu = new JMenu("File");
        EditMenu = new JMenu("Edit");
        HelpMenu = new JMenu("Help");
        SelectionMenu = new JMenu("Selection");
        ViewMenu = new JMenu("View");
        GOMenu = new JMenu("Go");
        RunMenu = new JMenu("Run");

        LoadItem = new JMenuItem("Load");
        SaveItem = new JMenuItem("Save");
        ExitItem = new JMenuItem("Exit");

        LoadItem.addActionListener(this);
        SaveItem.addActionListener(this);
        ExitItem.addActionListener(this);

        FileMenu.setMnemonic(KeyEvent.VK_F); // F for file
        EditMenu.setMnemonic(KeyEvent.VK_E); // E for Edit
        HelpMenu.setMnemonic(KeyEvent.VK_H); // H for Help
        SelectionMenu.setMnemonic(KeyEvent.VK_S); // S for Selection
        ViewMenu.setMnemonic(KeyEvent.VK_V); // V for View
        GOMenu.setMnemonic(KeyEvent.VK_G); // G for Go
        RunMenu.setMnemonic(KeyEvent.VK_R); // R for Run
        LoadItem.setMnemonic(KeyEvent.VK_L); // L for Load
        SaveItem.setMnemonic(KeyEvent.VK_S); // S for Save
        ExitItem.setMnemonic(KeyEvent.VK_E); // E for Exit

        menubBar.add(FileMenu);
        menubBar.add(EditMenu);
        menubBar.add(HelpMenu);
        menubBar.add(SelectionMenu);
        menubBar.add(ViewMenu);
        menubBar.add(GOMenu);
        menubBar.add(RunMenu);

        FileMenu.add(LoadItem);
        FileMenu.add(SaveItem);
        FileMenu.add(ExitItem);

        this.setJMenuBar(menubBar);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==LoadItem){
            System.out.println("*Beep Boop* You Loaded a File");
        }
        if(e.getSource()==SaveItem){
            System.out.println("*Beep Boop* You Saved a File");
        }
        if(e.getSource()==ExitItem){
            System.exit(0);
        }
    }
    
}
