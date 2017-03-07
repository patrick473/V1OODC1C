package practica.practicum8;

import java.time.LocalDate;

/**
 * Created by patrick on 3/6/2017.
 */
public class Computer implements Goed {
    private String type;
    private String macadres;
    private Double aanschafprijs = 0.0;
    private Integer productiejaar = 0;

    public Computer(String type,String macadres,Double aanschafprijs, Integer productiejaar){
        this.aanschafprijs =aanschafprijs;
        this.type = type;
        this.macadres=macadres;
        this.productiejaar =productiejaar;
    }
    public Double huidigeWaarde(){
        Double huidigeprijs = aanschafprijs - aanschafprijs *((LocalDate.now().getYear() - productiejaar) * 0.4);
        return huidigeprijs;
    }
    public boolean equals(Object e) {
        if(e instanceof Computer != true) {
            return false;
        }
        if(((Computer) e).macadres != this.macadres) {
            return false;
        }
        return true;
    };

    public String toString() {
        return "Computer: " + this.type + " met bouwjaar " + this.productiejaar + " heeft een waarde van: €" + this.huidigeWaarde();
    }
}
