package Video_Practice.SUBclass.Motor;

import org.checkerframework.checker.units.qual.C;

public class SubClass {
    public static void main(String[] args) {
        
        Car MyCar1 = new Car();
        Car MyCar2 = new Car();
        Bike MYBike = new Bike();

        System.out.println(MyCar1.make);
        System.out.println(MyCar1.model);
        System.out.println();
        System.out.println(MyCar2.make);
        System.out.println(MyCar2.model);

        System.out.println();
        System.out.println(MYBike.name);
        System.out.println(MYBike.color);
        System.out.println(MYBike.price);
        System.out.println();

        MyCar1.brake();
        MyCar2.drive();
        MYBike.fast();
    }
}
