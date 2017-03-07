package practica.practicum8;

import java.util.ArrayList;

/**
 * Created by patrick on 3/6/2017.
 */
public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private Double budget = 0.0;
    private ArrayList<Goed> invetaris = new ArrayList<Goed>();

    public BedrijfsInventaris(String bedrijfsnaam,Double budget){
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
    }
    public void schafAan(Goed goed){
        if(invetaris.contains(goed) || goed.huidigeWaarde() > budget){
            return;
        }
        else{

            budget -= goed.huidigeWaarde();
            invetaris.add(goed);
        }

    }
    public String toString(){
        String s = bedrijfsnaam + " met invetaris: \n";
                for  (Goed goed: invetaris){
                    s = s+ goed + "\n";
                }
                return s;
    }
}
