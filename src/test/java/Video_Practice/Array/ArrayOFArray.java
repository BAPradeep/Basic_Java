package Video_Practice.Array;

public class ArrayOFArray {
    public static void main(String[] args) {
        
        // 2D array = an array of array

        String[][] number = new String[3][3];

        number[0][0] = "One";
        number[0][1] = "Two";
        number[0][2] = "Three";
        number[1][0] = "First";
        number[1][1] = "Second";
        number[1][2] = "Third";
        number[2][0] = "Once";
        number[2][1] = "Twin";
        number[2][2] = "Third";

        for(int i = 0; i < number.length; i ++){
            System.out.println();
            for(int j = 0; j < number[i].length; j ++){
                System.out.print(number[i][j]+" ");
            }
        }

    }
}
