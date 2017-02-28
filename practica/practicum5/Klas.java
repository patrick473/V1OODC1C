package practica.practicum5;


import java.util.ArrayList;



/**
 * Created by patrick on 2/15/2017.
 */
public class Klas {
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
    public void wijzigCijfer(String naam, Double cijfer){
            for (Leerling i : leerlingen){
                if (i.getNaam() ==  naam){
                    i.setCijfer(cijfer);
                }

            }


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