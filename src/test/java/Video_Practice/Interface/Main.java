package Video_Practice.SUBclass.Interface;

public class Main {
    public static void main(String[] args) {
        
        // Interface = a template that can be applied to a class 
        //             similar to inheritance, but specifies what a class has/must do.
        //             classed can apply more than one interface, inhertance is limited to 1 super

        Rabbit rabbit = new Rabbit();
        System.out.println();
        rabbit.flee();
        System.out.println();

        Hawk hawk = new Hawk();
        System.out.println();
        hawk.hunt();
        System.out.println();

        Fish fish = new Fish();
        System.out.println();
        fish.flee();
        fish.hunt();
        System.out.println();

    }
}
