package practica.practicum4;

/**
 * Created by patrick on 2/11/2017.
 */
public class AutoHuur {
     private Klant huurder;
     private Auto auto;
     private Integer dagen;

     private Double prijs;


    public AutoHuur(){
    }
    public void setHuurder(Klant kl){
        huurder = kl;
    }
    public void setGehuurdeAuto(Auto au){
        auto = au;
    }
    public void setAantalDagen(Integer dg){
        dagen=dg;
        totaalPrijs();
    }
    public Auto getGehuurdeAuto(){
    return auto;
    }
    public Double totaalPrijs(){
        prijs= (auto.getPrijsPerDag()-(auto.getPrijsPerDag() * (huurder.getKorting()/100)))* dagen;
        return prijs;
    }
    public String toString() {

        if (huurder == null && auto == null&& dagen==null) {
            return "er is geen auto bekend " + "\n" + "er is geen huurder bekend" + "\n" + "aantal dagen: " +  "0"+ " en dat kost " + "0.0";

        } else {
            return auto + "\n" + huurder + "\n" + "aantal dagen: " + dagen + " en dat kost " + prijs;
        }
    }
}
