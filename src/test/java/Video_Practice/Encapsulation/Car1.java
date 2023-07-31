package Video_Practice.Encapsulation;

public class Car1 {
    
    private String make;  // it's name "Private that no show and that class only"
    private String model;
    private int age;

    Car1(String make,String model,int age){
        this.setmake(make);
        this.setmodel(model);
        this.setage(age);
    }
// Below(15 to 24 line) not edit mean fixed of variable
    public String getmake(){
        return make;
    }

    public String getmodel(){
        return model;
    }

    public int getage(){
        return age;
    }
// below(27 to 37 line) possible edit name in variable
    public void setmake(String make){
        this.make = make;
    }

    public void setmodel(String model){
        this.model = model;
    }

    public void setage(int age){
        this.age = age;
    }
}
