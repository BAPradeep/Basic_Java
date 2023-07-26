package Video_Practice.Loop;

import java.util.Scanner;

public class NestLoop {
    public static void main(String[] args) {
        
        // nested loops = a loop inside of a loop

        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol;

        System.out.print("Enter # of Rows : ");
        rows = scanner.nextInt();

        System.out.print("Enter # of Columns : ");
        columns = scanner.nextInt();

        System.out.print("Enter Symbol to use : ");
        symbol = scanner.next();

        for (int i = 1; i <= rows; i ++){
            System.out.println();
            for(int j = 1; j <= columns; j ++){
                System.out.print(symbol);
            }
        }
    }
}
