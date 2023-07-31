package Video_Practice.Classthree;

public class Main {
    public static void main(String[] args) {
        Garages demo = new Garages();

        Cars firstcar1 = new Cars("BWM");
        Cars firstcar2 = new Cars("Tesla");
        Cars firstcar3 = new Cars("TATA Harries");

        demo.parks(firstcar1);
        demo.parks(firstcar2);
        demo.parks(firstcar3);
    }
}
