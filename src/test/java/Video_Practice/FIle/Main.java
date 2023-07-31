package Video_Practice.FIle;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        
        // File = An abstract representation of file and directory pathnames

        File file = new File("C:/Users/Pradeep B A/Downloads/Documents/Concession Certificate.pdf");

        if(file.exists()){
            System.out.println("That file Exists :0!");
            System.out.println(file.getPath());         // the path is location
            System.out.println(file.getAbsolutePath()); // the path is location
            System.out.println(file.isFile());          // True mean  place perfect
            System.out.println(file.getName());         // file name
            System.out.println(file.toURI());           // http is location by deskop
        }
        else{
            System.out.println("That file doesn't Exists :-(");
        }
    }
}
