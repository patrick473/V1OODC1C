package practica.practicum5;


import java.util.ArrayList;



/**
 * Created by patrick on 2/15/2017.
 */
public class Klas {
    private String klasCode;
    private Leerling leerling;
    private String lerling;
    private ArrayList<String> leerlingen = new ArrayList<String>();
    private ArrayList<Double> cijfers = new ArrayList<Double>();
    private Integer aantalLerlingen = 0;

    public Klas(String klasCode){
        this.klasCode = klasCode;
    }
    public void voegLeerlingToe(Leerling leerling){

        this.leerling=leerling;
        lerling = leerling.naam;
        leerlingen.add(lerling);
        cijfers.add(0.0);
        aantalLerlingen  += 1;
    }
    public void wijzigCijfer(String naam, Double cijfer){
        if (leerlingen.contains(naam)) {
            Integer s = leerlingen.indexOf(naam);
            cijfers.set(s, cijfer);
        }
    }
    public Integer aantalLeerlingen(){
        return aantalLerlingen;
    }
    public String toString(){

        String s = "In klas "+ klasCode + " zitten de volgende leerlingen: \n";
        for (String leerling : leerlingen) {
            s= s+ leerling + " heeft cijfer: "+ cijfers.get(leerlingen.indexOf(leerling))+ "\n";
        }

        return s;
    }

}