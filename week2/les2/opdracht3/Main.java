package week2.les2.opdracht3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Created by patrick on 2/7/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner koppelen aan toetsenbord
        String d;
        ArrayList<Double> l = new ArrayList<Double>();
        do {
            System.out.print("Voer double in: ");
            d = scanner.nextLine(); // scanner wacht op invoer + enter
            double d2 = Double.parseDouble(d);
            l.add(d2);
        } while (!d.equals("0"));
        scanner.close();
        double tot = 0.0;
        for (double item : l) {
            tot += item;
            System.out.println(item);
        }
        double gem = tot / l.size();
        System.out.println(gem);
    }
}