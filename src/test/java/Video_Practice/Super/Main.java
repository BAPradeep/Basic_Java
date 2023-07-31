package Video_Practice.SUBclass.Super;

public class Main {
    public static void main(String[] args) {
        
        // Super = keyword refers to the superclass (parent) of an object
        //         very similar to the "this" keyword

        Hero hero = new Hero("Hulk", 45, "Scientist");
        Hero hero2 = new Hero("Vision", 3,"Vision futur");
        Hero hero3 = new Hero("Ironman", 45, "Money with nano Technology");

        System.out.println(hero.toString());
        System.out.println();
        System.out.println(hero2.toString());
        System.out.println();
        System.out.println(hero3.toString());
    }
}
