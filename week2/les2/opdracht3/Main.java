package week2.les2.opdracht3;
import java.util.Scanner;
/**
 * Created by patrick on 2/7/2017.
 */
public class Main {
    public String naam;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw naam in: ");
        String naam = scanner.nextLine();
        System.out.println(naam);
        if (naam == "0"){
        scanner.close();}
        System.out.println(naam);
    }
}
