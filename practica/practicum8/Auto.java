package practica.practicum8;

import java.time.LocalDate;

/**
 * Created by patrick on 3/6/2017.
 */
public class Auto extends Voertuig {
    private String kenteken;



    public Auto(String type,Double nieuwprijs,Integer bouwjaar,String kenteken){
        super(type,nieuwprijs,bouwjaar);
        this.kenteken = kenteken;
    }
    public Double huidigeWaarde(){
        Double huidigeprijs = nieuwprijs - nieuwprijs *((LocalDate.now().getYear() - bouwjaar) * 0.3);
        return huidigeprijs;
    }
}
