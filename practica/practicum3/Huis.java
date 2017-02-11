package practica.practicum3;

/**
 * Created by patrick on 2/9/2017.
 */
public class Huis {
    private String naam;
    private Integer leeftijd;
    private Persoon huisbaas;

    public Huis(String nm,Integer lt){
        naam = nm;
        leeftijd = lt;

    }
    public void setHuisbaas(Persoon hb){
        huisbaas = hb;
    }

    public Persoon getHuisbaas(){
        return huisbaas;
    }
    public String toString(){
        return "huis "+naam+" is gebouwd in "+leeftijd+"\nen heeft huisbaas "+ huisbaas;
    }
}
