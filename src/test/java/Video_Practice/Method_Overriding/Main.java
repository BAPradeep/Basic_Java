package Video_Practice.SUBclass.Method_Overriding;

public class Main {
    public static void main(String[] args) {
        
        // Method overriding = Declaring a method in sub class,
        //                     which is already present in parent class.
        //                     done so that a child class can give its own implementation

        Animal animal = new Animal();

        Dog dog = new Dog();

        animal.speak();
    }
}
