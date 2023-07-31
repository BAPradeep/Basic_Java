package Video_Practice.File_Write;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("Pradeep.txt");
            fileWriter.write("Roses are red \nviolet are blue");
            fileWriter.append("\n(A poem by pradeep)");
            fileWriter.append("\nHi welcome to earth");
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
