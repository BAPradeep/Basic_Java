package Video_Practice.SUBclass.Polymorphism;

public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racer = {car,bicycle,boat};

        System.out.println();
        car.go();
        bicycle.go();
        boat.go();
        System.out.println();

        // (OR)

        for(Vehicle x :racer){
            x.go();
        } System.out.println();
    }
}
