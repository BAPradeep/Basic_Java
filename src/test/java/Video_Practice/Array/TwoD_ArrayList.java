package Video_Practice.Array;

import java.util.ArrayList;

public class TwoD_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> GroceryList = new ArrayList();

        ArrayList<String> BakeryList = new ArrayList();
        BakeryList.add("Pasta");
        BakeryList.add("Garlic Bread");
        BakeryList.add("Donuts");

        ArrayList<String> ProduceList = new ArrayList();
        ProduceList.add("Tomatos");
        ProduceList.add("Zucchini");
        ProduceList.add("Peppers");

        ArrayList<String> DrinksList = new ArrayList();
        DrinksList.add("Soda");
        DrinksList.add("Spirirt");
        DrinksList.add("RedBull");
        DrinksList.add("Coca Pepsi");

        GroceryList.add(DrinksList);
        GroceryList.add(ProduceList);
        GroceryList.add(BakeryList);

        for(int i = 0; i<GroceryList.size(); i++){
            System.out.println(GroceryList.get(i));
        }
    }
}
