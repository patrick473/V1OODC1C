package week2.les1.opdracht2;

/**
 * Created by patrick on 2/7/2017.
 */
public class Eigenaar {
    private String naam;
    private int giroNr;
    private Huisdier beestje;

    public void setBeestje(Huisdier h){
        beestje = h;

    }
    public Eigenaar(String nm) {
        naam = nm;
    }
    public void setGiroNr(int nr) { giroNr = nr; }
    public int getGiroNr() { return giroNr; }
    public String getNaam() { return naam; }
    public Huisdier getBeestje() {
        return beestje;
    }
    public String toString() {
        return naam + " heeft giro " + giroNr +" en is het baasje van" +beestje;
    }
}
