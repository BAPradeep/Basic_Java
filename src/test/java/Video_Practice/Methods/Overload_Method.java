package Video_Practice.Methods;

public class Overload_Method {
    public static void main(String[] args) {
        
        // Overloaded methods = methods that share the same name but have different parameters
        //                      method name + parameters = method signature

       // int x = add(2,4,6,8,10);
        Double x = add(2.0,4.0,6.0,8.0,10.);

        System.out.println(x);
    }

    static int add(int a, int b){
        System.out.println("The is overloaded method @1");
        return a+b;
    }

    static int add(int a, int b, int c){
        System.out.println("The is overloaded method @2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("The is overload method @3");
        return a+b+c+d;
    }

    static int add(int a, int b, int c, int d, int e){
        System.out.println("The is overloaded method @4");
        return a+b+c+d+e;
    }

    static Double add(Double a, Double b){
        System.out.println("The is overloaded method @5");
        return a+b;
    }

    static Double add(Double a, Double b, Double c){
        System.out.println("The is overloaded method @6");
        return a+b+c;
    }

    static Double add(Double a, Double b, Double c, Double d){
        System.out.println("The is overload method @7");
        return a+b+c+d;
    }

    static Double add(Double a, Double b, Double c, Double d, Double e){
        System.out.println("The is overloaded method @8");
        return a+b+c+d+e;
    }

}
