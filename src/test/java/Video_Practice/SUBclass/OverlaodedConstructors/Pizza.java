package Video_Practice.SUBclass.OverlaodedConstructors;

public class Pizza {
    
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(){
        System.out.println();
        System.out.println("No avaliable Option");
    }

    Pizza(String bread){

        this.bread = bread;
        
    }

    Pizza(String bread, String sauce){

        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread, String sauce, String cheese){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
