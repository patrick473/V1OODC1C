package practica.practicum8;

/**
 * Created by patrick on 3/6/2017.
 */
public abstract class Voertuig implements Goed{
    private String type;
    protected Double nieuwprijs;
    protected Integer bouwjaar;

    public Voertuig(){}

    public Voertuig(String type,Double nieuwprijs, Integer bouwjaar){
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    public boolean equals(Object e) {
        if(e instanceof Voertuig != true) {
            return false;
        }
        if(((Voertuig) e).type != this.type) {
            return false;
        }
        return true;
    };
    public String toString() {
        return "Voertuig: " + this.type + " met bouwjaar " + this.bouwjaar
                + " heeft een waarde van: €" + this.huidigeWaarde();
    }
}
