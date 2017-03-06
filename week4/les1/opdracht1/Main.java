package week4.les1.opdracht1;

/**
 * Created by patrick on 2/28/2017.
 */
public class Main {
    public static void main(String[] args){
        Gebouw g;
        Huis h = new Huis(10, 7, 2);
        g = h;
        System.out.println(g.oppervlakte());
    }
}
