package week2.les1.opdracht1;

/**
 * Created by patrick on 2/7/2017.
 */
public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public void setBaasje(Eigenaar b){
        baasje = b;

    }
    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public String getNaam() { return naam; }
    public String getRas() { return ras; }
    public String toString() {
        String s = naam + ", de " + ras + ", weegt " + gewicht + " kg."+ "\n En de eigenaar is: "+ baasje;



        return s;
    }
}