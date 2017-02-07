package week1.les2.opdracht1;

/**
 * Created by patrick on 2/7/2017.
 */
public class Piloot {
    public String naam;
    private Double salaris;
    private Integer vliegUren = 0;
    public  Piloot(String nm){
        naam =nm;


    }
    public  Piloot(String nm,Double Ss,Integer Vu){
        naam =nm;
        salaris=Ss;
        vliegUren=Vu;

    }
    public void setSalaris(Double ss){
        salaris = ss;
    }
    public void verhoogVliegurenMet(Integer vu){
        vliegUren = vliegUren + vu;
    }

    public Integer getVlieguren(){
        return vliegUren;
    }
    public Double getSalaris(){
        return salaris;
    }}
