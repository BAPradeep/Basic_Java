package Video_Practice.Loop;

public class Three {
    public static void main(String[] args) {
        
        int three [][][] = new int[5][6][7];
        int x,y,z;

        for(x=0; x<3; x++)
        for(y =0; y<4; y++)
        for (z=0; z<5; z++)
        three[x][y][z] =x *y*z;

        for(x=0; x<3; x++){
            for(y=0; y<4; y++){
                for(z=0; z<5; z++)
                System.out.print(three[x][y][z]+ " ");
                System.out.println();
            }
            System.out.println();
        }
    }
}