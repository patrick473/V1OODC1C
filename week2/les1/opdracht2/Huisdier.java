package week2.les1.opdracht2;

/**
 * Created by patrick on 2/7/2017.
 */
public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }
    public String getNaam() { return naam; }
    public String getRas() { return ras; }

    public String toString() {
        return naam + ", de " + ras + ", weegt " + gewicht + " kg.";
    }
}