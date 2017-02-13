package practica.practicum4;

/**
 * Created by patrick on 2/11/2017.
 */
public class Auto {
    private String naam;
    private Integer prijsPerDag =0;
    public Auto(String nm,Integer pr){
        naam=nm;
        prijsPerDag = pr;
    }
    public Integer getPrijsPerDag(){
        return prijsPerDag;
    }
    public String toString(){

        return "autotype: "+ naam + " met prijs per dag: "+prijsPerDag;

    }
}
