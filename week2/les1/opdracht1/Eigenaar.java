package week2.les1.opdracht1;

/**
 * Created by patrick on 2/7/2017.
 */
public class Eigenaar {
    private String naam;
    private int giroNr;
    public Eigenaar(String nm) {
        naam = nm;
    }
    public void setGiroNr(int nr) { giroNr = nr; }
    public int getGiroNr() { return giroNr; }
    public String getNaam() { return naam; }
    public String toString() {
        return naam + " heeft giro " + giroNr;
    }
}