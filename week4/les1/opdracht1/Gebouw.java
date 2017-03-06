package week4.les1.opdracht1;

/**
 * Created by patrick on 2/28/2017.
 */
public class Gebouw {

    private Integer lengte = 0;
    private Integer breedte = 0;
    private Integer aantalVerdiepingen = 0;
    public Integer laatsteRenovatie = 0;

    public Gebouw(){

    }
    public Gebouw(Integer lengte,Integer breedte,Integer aantalVerdiepingen){
        this.lengte = lengte;
        this.breedte = breedte;
        this.aantalVerdiepingen= aantalVerdiepingen;
    }
    public void setLengte(Integer lengte){
        this.lengte = lengte;
    }
    public void setBreedte(Integer breedte){
        this.breedte = breedte;
    }
    public void setAantalVerdiepingen(Integer aantalVerdiepingen){
        this.aantalVerdiepingen=aantalVerdiepingen;
    }
    public Integer oppervlakte(){
        return lengte * breedte;
    }
    public void renoveer(Integer buiten){
        laatsteRenovatie = buiten;

    }
    public Integer berekenHuur(){
        return oppervlakte() * 75;
    }
    public String toString(){
        return "d";
    }
}
