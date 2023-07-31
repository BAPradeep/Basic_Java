package Video_Practice.Dynamic_Polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Polymorphism = many shapes / forms
        // dynamic = after compilation (during runtime)

        // ex:- A corvette is a: corvette, and a car, and a vehicle, and an object

        Scanner input = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want ?");
        System.out.println("(1=Dog) or (2=Cat) : ");

        int choice = input.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
            System.out.println();
        }
        else if (choice==2) {
           animal = new Cat();
           animal.speak(); 
           System.out.println();
        } else {
            animal = new Animal();
            System.out.println("That choice was invalid");
            animal.speak();
            System.out.println();
        }
    }
}
