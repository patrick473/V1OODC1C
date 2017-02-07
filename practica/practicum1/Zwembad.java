package practicum1;

/**
 * Created by patrick on 2/7/2017.
 */
public class Zwembad {
    private Double breedte = 0.0;
    private Double lengte = 0.0;
    private Double diepte = 0.0;
    private Double inhoud = 0.0;
    public Zwembad(Double bt,Double lt,Double dt){
        breedte=bt;
        lengte=lt;
        diepte=dt;
    }
    public Zwembad(){

    }
    public Double getBreedte(){
    return breedte;
    }
    public Double getLengte(){
        return lengte;
    }
    public Double getDiepte(){
        return diepte;
    }
    public Double inhoud(){
        inhoud = breedte * lengte * diepte;
        return inhoud;
    }
    public void setBreedte(Double bt){
        breedte=bt;
    }

    public void setLengte(Double ln){
        lengte=ln;
    }
    public void setDiepte(Double dt){
    diepte=dt;
    }
    public String toString(){
        String s = "breedte is "+ breedte + " lengte is "+ lengte + "diepte is " + diepte ;

        return s;
    }
}