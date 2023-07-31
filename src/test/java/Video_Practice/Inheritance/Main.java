package Video_Practice.SUBclass.Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Bicyle bicyle = new Bicyle();
        bicyle.stop();

        System.out.println();
        System.out.println(car.Door);
        System.out.println(bicyle.pedal);
        System.out.println();
    }
}
