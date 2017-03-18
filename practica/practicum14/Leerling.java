package practica.practicum14;

/**
 * Created by patrick on 3/18/2017.
 */
public class Leerling implements java.io.Serializable {
    private String naam;
    private Double cijfer;

    public Leerling(String naam){
        this.naam = naam;
        cijfer = 0.0;
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