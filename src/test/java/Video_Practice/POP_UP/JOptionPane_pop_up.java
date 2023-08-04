package Video_Practice.POP_UP;

import javax.swing.JOptionPane;

public class JOptionPane_pop_up {
    public static void main(String[] args) {
        
        //JOptionpane = Pop up a standard dialog box that prompts users for a value
        //              or informs them of something.

        // JOptionPane.showMessageDialog(null, "This is some useless info", "POP UP", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Here is more useless info :D", "POP UP", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Really ?", "POP UP", JOptionPane.QUESTION_MESSAGE);
       
    //    while(true){
    //     JOptionPane.showMessageDialog(null, "You're computer has A VIRUS!!!", "POP UP", JOptionPane.WARNING_MESSAGE);
    //    }
        // JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!", "POP UP", JOptionPane.ERROR_MESSAGE);

        // on click Comfrim
        // JOptionPane.showConfirmDialog(null,"Bro, do you even code? ","This is My Title", JOptionPane.YES_NO_CANCEL_OPTION);
        // JOptionPane.showInputDialog("What is your name?:");

        String[] responses = {"No, you're awesome","Thank You","*Blush*"};
        JOptionPane.showOptionDialog(null,
                                    "You ae Awesome",
                                    "Secret Message",
                                    JOptionPane.YES_NO_CANCEL_OPTION,
                                    JOptionPane.INFORMATION_MESSAGE,
                                    null,
                                    responses,
                                    0);
    }
    
}
