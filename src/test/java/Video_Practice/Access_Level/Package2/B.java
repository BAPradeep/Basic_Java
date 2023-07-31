package Video_Practice.SUBclass.Access_Level.Package2;

import Video_Practice.SUBclass.Access_Level.Package1.*;

public class B extends A{
    public static void main(String[] args) {
        
        B b = new B();
        System.out.println(b.protectedMessage);
    }
    
}
