package practicum2;

/**
 * Created by patrick on 2/7/2017.
 */
public class Main {

        public static void main(String[] args) {
            VoetbalClub ajx = new VoetbalClub("Ajax ");
            System.out.println(ajx.naam+ "         "+ ajx.getAantalGespeeld()+"    "+ajx.getAantalGewonnen()+"    "+ajx.getAantalGelijk()+"    "+ajx.getAantalVerloren());
            VoetbalClub feij = new VoetbalClub("Feijenoord");
            feij.verwerkResultaat('w');
            feij.verwerkResultaat('w');
            feij.verwerkResultaat('w');
            feij.verwerkResultaat('g');
            System.out.println(feij.naam + "    "+ feij.getAantalGespeeld() +"    "+feij.getAantalGewonnen()+"    "+feij.getAantalGelijk()+"    "+feij.getAantalVerloren());
        }
    }

