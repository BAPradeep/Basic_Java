package Video_Practice.Array;

public class ArrayWithLoop {
    public static void main(String[] args) {
        
        // array = used to store multiple value in a single variable

        String[] Fruit = new String[5];

        Fruit[0] = "Apple";
        Fruit[1] = "Banana";
        Fruit[2] = "Guvur";
        Fruit[3] = "Blueberry";
        Fruit[4] = "Strewberry";

        for(int i = 0; i < Fruit.length; i ++){
            System.out.println(Fruit[i]);
        }
    }
}
