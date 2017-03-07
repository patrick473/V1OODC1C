package practica.practicum8;

import java.time.LocalDate;

/**
 * Created by patrick on 3/6/2017.
 */
public class Fiets extends Voertuig {
    private Integer framenummer = 0;


    public Fiets(String type,Double nieuwprijs,Integer bouwjaar,Integer framenummer){
        super(type, nieuwprijs,bouwjaar);
        this.framenummer = framenummer;

    }
    public Double huidigeWaarde(){
       return nieuwprijs - nieuwprijs *((LocalDate.now().getYear() - bouwjaar) * 0.1);
    }
}
