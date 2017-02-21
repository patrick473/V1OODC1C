package practica.practicum5;

/**
 * Created by patrick on 2/15/2017.
 */
public class Leerling {
    public String naam;
    private Double cijfer;

    public Leerling(String naam){
        this.naam = naam;
    }
    public String getNaam(){
        return naam;
    }
    public Double getCijfer(){
        return cijfer;
    }
    public void setCijfer(Double cijfer){
        this.cijfer = cijfer;
    }
    public String toString(){
        return naam + " heeft cijfer: " +cijfer;
    }
}
