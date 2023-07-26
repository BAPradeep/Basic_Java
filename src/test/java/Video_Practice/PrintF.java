package Video_Practice;

public class PrintF {
    public static void main(String[] args) {
        
        // printf = an optional method to control, format, and display text to the console winodw
        //          two arguments = format string + (object/variable/value)
        //          % [flags] [precision] [width] [conversion-character]

        boolean MyBoolean = true;
        char MyChar = '@';
        String MyString = "Bro Code";
        int MyInt = 56;
        double MyDouble = 10000000;

        // [Conversion - character]

        // System.out.printf("%b",MyBoolean);
        // System.out.printf("%c",MyChar);
        // System.out.printf("%s",MyString);
        // System.out.printf("%d",MyInt);
        // System.out.printf("%f",MyDouble);

        //[Width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s",MyString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.3f",MyDouble);

        //[flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus( + ) or minus ( - ) sign for a numberic  value
        // 0 : numberic values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %,.3f",MyDouble);
    }
}
