package Video_Practice.Encapsulation;

public class Main {
    public static void main(String[] args) {
        
        // Encapsulation = Attributes of a class will be hidden or private,
        //                 can be accessed only through methods (getters & setters)
        //                 you should make attributes private if you don't have a reason to make them public/protected

        Car1 car1 = new Car1("Tata motor", "Nexo EV", 15);
        
        car1.setage(20); // before age 15 to after 20
        car1.setmake("Volkage"); // before tata motor to after volkage
        
        System.out.println();
        System.out.println(car1.getmake());
        System.out.println(car1.getmodel());
        System.out.println(car1.getage());
        System.out.println();
    }
}
