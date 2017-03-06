package week4.les1.opdracht1;


/**
 * Created by patrick on 2/28/2017.
 */
public class Huis extends Gebouw {
    public Boolean isGeisoleerd;
    public Integer laatsteRenovatie = 0;

    public Huis(){

    }
    public Huis(Boolean isGeisoleerd){
        this.isGeisoleerd =  isGeisoleerd;
    }
    public Huis(Integer lengte,Integer breedte,Integer aantalVerdiepingen){
        super.setLengte(lengte);
        super.setBreedte(breedte);
        super.setAantalVerdiepingen(aantalVerdiepingen);

    }
    public Huis(Integer lengte,Integer breedte,Integer aantalVerdiepingen,Boolean isGeisoleerd){
        super.setLengte(lengte);
        super.setBreedte(breedte);
        super.setAantalVerdiepingen(aantalVerdiepingen);
        this.isGeisoleerd =  isGeisoleerd;
    }
    public void isoleer(){
        isGeisoleerd =true;
    }
    public void renoveer(int binnen){
        laatsteRenovatie = binnen;
    }
    public void renoveer(int binnen,int buiten){
        laatsteRenovatie = binnen;
        super.laatsteRenovatie = buiten;
    }
    public Integer berekenHuur(){
       return super.oppervlakte() * 100;

    }
    public String toString(){
        return "s";
    }
}
