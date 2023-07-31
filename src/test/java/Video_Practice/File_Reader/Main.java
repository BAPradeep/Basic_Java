package Video_Practice.File_Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // FileReader = read the contents of a file as a stream of characters. One by one 
        //              read() return an int value which contains the byte value
        //              when read() return -1, there is no more data to be read

        try {
            FileReader fileReader = new FileReader("Pradeep.txt");
            int data = fileReader.read();
            while(data !=-1){
                System.out.print((char)data);
                data=fileReader.read();
            }
            fileReader.close();
        } 
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
