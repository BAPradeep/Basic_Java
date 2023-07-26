package Video_Practice;

import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        double x,y,z;
        
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter side X: ");
        x = Scanner.nextDouble();

        System.out.println("Enter side Y: ");
        y = Scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The Hypotenuse is: "+z);

        Scanner.close();
    }
    
}
