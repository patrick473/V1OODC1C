package practica.practicum14;

/**
 * Created by patrick on 3/18/2017.
 */
import java.util.ArrayList;

public class Klas implements java.io.Serializable{
    private String klasCode;


    private ArrayList<Leerling> leerlingen = new ArrayList<Leerling>();

    private Integer aantalLerlingen = 0;

    public Klas(String klasCode){
        this.klasCode = klasCode;
    }
    public void voegLeerlingToe(Leerling leerling){


        leerlingen.add(leerling);

        aantalLerlingen  += 1;
    }
    public void wijzigCijfer(String naam, Double cijfer) {
        for (Leerling i : leerlingen) {
            if (i.getNaam() == naam) {
                i.setCijfer(cijfer);
            }

        }
    }
    public ArrayList getLeerlingen(){
            return leerlingen;
    }

    public Integer aantalLeerlingen(){
        return aantalLerlingen;
    }
    public String toString(){
        String s = "In klas "+ klasCode + " zitten de volgende leerlingen: \n";
        for (Leerling leerling : leerlingen) {
            s= s+ leerling + "\n";
        }

        return s;
    }

}