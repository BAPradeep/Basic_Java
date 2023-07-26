package Video_Practice;

import java.util.Scanner;

public class whileisBlank {
    public static void main(String[] args) {
        
        // while loop = executes a block of code as long as a it's condition remain true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isEmpty()){
            System.out.println("Enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
    }
}
