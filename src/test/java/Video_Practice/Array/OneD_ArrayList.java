package Video_Practice.Array;

import java.util.ArrayList;

public class OneD_ArrayList {
    public static void main(String[] args) {
        
        // ArrayList = a resizable array.
        //             Elements can be added and removed after compilation phase
        //             store reference data type

        ArrayList<String> food = new ArrayList<String>();
        food.add("Dosa");
        food.add("Onion Dosa");
        food.add("idly vadu");
        food.add("Rice Sambar");

        food.set(2,"Gobi with fried rice"); // replace

        food.remove(3); // Remove

        // food.clear();

        for (int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }
}
