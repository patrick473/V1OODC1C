package practica.practicum3;

/**
 * Created by patrick on 2/9/2017.
 */
public class Persoon {
    private String naam;
    private Integer leeftijd;
    public Persoon(String nm,Integer lt){
        naam = nm;
        leeftijd = lt;


    }
    public String toString(){
        return naam+"; leeftijd "+leeftijd+" jaar";
    }
}
