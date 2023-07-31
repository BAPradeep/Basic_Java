package Video_Practice.Lasslink;

public class main {
    public static void main(String[] args) {
        
        // Food[] refrigerator = new Food[3];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburge");
        Food food3 = new Food("HotDog");

        Food[] refrigerator = {food1,food2,food3};

        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[2].name);
    }
    
}
