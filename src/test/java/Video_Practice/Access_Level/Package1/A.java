package Video_Practice.SUBclass.Access_Level.Package1;

import Video_Practice.SUBclass.Access_Level.Package2.*;

public class A {
    // public static void main(String[] args) {
        
    //     C c = new C();

    //     System.out.println(c.defaultMessage); // its no output why miss put "public in place"
    // }                                         // checking package2 in file name C.java                  

    protected String protectedMessage = "This is Protected";

    private String privateMessage = "This is the Private";
}
