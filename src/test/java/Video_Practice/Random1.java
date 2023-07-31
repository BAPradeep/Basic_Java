package Video_Practice;
import java.util.Random;

public class Random1 {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt();
        double y = random.nextDouble();
        boolean z = random.nextBoolean();


        System.out.println("Integer is : "+ x);
        System.out.println("Double is : "+ y);
        System.out.println("Boolean is : "+ z);
    }
    
}
