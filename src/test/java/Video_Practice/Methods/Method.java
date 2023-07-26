package Video_Practice.Methods;

public class Method {
    public static void main(String[] args) {
        
        // method = a block of code that is excuted whenever it is called upon
        int x = 3;
        int y = 4;
        int z = add(x, y);

        System.out.println(z);
    }

    static int add(int x, int y){
        int z = x + y;
        return z;
        //System.out.println(z);
    }
}
