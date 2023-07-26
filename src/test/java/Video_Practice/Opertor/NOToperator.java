package Video_Practice.Opertor;

import java.util.Scanner;

public class NOToperator {
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);

        System.out.println("You are play a game! Press q or Q  to Quit");
        String Response = Scanner.next();
        
        // Not (!) mean stop with skip to else and "ORopeartor" switch "NOTopertor" of funcation
        if(!Response.equals("q") && !Response.equals("Q")){  
            System.out.println("You are stilling play the game *PEW PEW*");
        }
        else{
            System.out.println("You quit the game!");
            
        }
    }
}
