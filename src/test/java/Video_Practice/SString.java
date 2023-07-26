package Video_Practice;

public class SString {
    public static void main(String[] args) {
        
        // String = a reference data type that can store one or more charaters
        //          reference data type have access to use methods

        String name = "Hello Welcome to Earth";

        // boolean Result = name.equalsIgnoreCase("Hello1");
        // int Result = name.length();
        // char Result = name.charAt(11);
        // int Result = name.indexOf("W");
        // boolean Result = name.isEmpty();
        // String Result = name.toLowerCase();
        // String Result = name.toUpperCase();
        // String Result = name.trim();
        String Result = name.replace('o', 'M');

        System.out.println(Result);
    }
}
