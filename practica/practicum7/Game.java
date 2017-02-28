package practica.practicum7;

/**
 * Created by patrick on 2/20/2017.
 */

import java.time.LocalDate;
import java.util.DoubleSummaryStatistics;

public class Game {

    private String naam;
    private Integer releaseJaar = 0;
    private Double nieuwprijs = 0.0;
    private Double huidigeprijs = 0.0;

    public Game(String naam, Integer releaseJaar, Double nieuwprijs){
        this.naam=naam;
        this.releaseJaar=releaseJaar;
        this.nieuwprijs=nieuwprijs;
        huidigeWaarde();
    }
    public String getNaam(){
        return naam;
    }
    public Double huidigeWaarde(){
        Integer s = LocalDate.now().getYear() - releaseJaar;
        huidigeprijs = nieuwprijs *  java.lang.Math.pow(0.7,s );
        return huidigeprijs;
    }
    public String toString(){
        return "    "+ naam+ ", uitgegeven in "+ releaseJaar+ " nieuwprijs: "+ nieuwprijs+" nu voor: "+ huidigeprijs;
    }
    public Double getNieuwprijs(){
        return nieuwprijs;
    }
    public Double getHuidigeprijs(){
        return huidigeprijs;
    }

}
