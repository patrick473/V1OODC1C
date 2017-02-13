package practica.practicum4;

/**
 * Created by patrick on 2/11/2017.
 */
public class Klant {
    private String naam;
    private Double korting = 0.0;
    public Klant(String nm){
        naam = nm;
    }
    public void setKorting(Double kt){
        korting = kt;
    }
    public Double getKorting(){
        return korting;
    }
    public String toString() {

            return "op naam van: " + naam + "(korting: " + korting + "%)";
        }

}
