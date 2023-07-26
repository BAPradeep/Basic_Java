package Video_Practice;

public class WrapperClass {
    public static void main(String[] args) {
        
        // Wrapper class = provides a way to use primitive data type as reference data types
        //                 reference data types contain useful methods
        //                 can be used with collections (ex.ArrayList)

        //Primitive     //wrapper
        //---------     //-------
        //boolean       Boolean
        //char          Character
        //int           Integer
        //double        Double

        //Autoboxing = the automatic conversion that the Java compiler make between the primitive type and their corresponding object wrapper class
        //unboxing   = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '*';
        Integer c = 123;
        Double d = 3.25;
        String e = "Pradeep";

        if(a == true){
            System.out.println("This is true");
        }
    }
}
