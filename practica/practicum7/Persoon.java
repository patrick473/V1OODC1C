package practica.practicum7;

import java.util.ArrayList;

/**
 * Created by patrick on 2/20/2017.
 */
public class Persoon {
    private String naam;
    private Double budget = 0.0;
    private Game game ;
    private Persoon persoon;
    public ArrayList<Game> games = new ArrayList<Game>();
    public Integer s = 0;

    public Persoon(String naam,Double budget){
        this.naam=naam;
        this.budget=budget;

    }
    public boolean koop(Game game){

        if ((budget -game.getHuidigeprijs()) < 0.0 || games.contains(game)) {
            return false;
        }
         else{
            budget -= game.getHuidigeprijs() ;
            games.add(game);

            return true;
        }

    }
    public Boolean verkoop(Game game,Persoon persoon){
        if (!games.contains(game) || persoon.games.contains(game) || (persoon.budget - game.getHuidigeprijs()) <0.0) {
            return false;
        }
        else{
            games.remove(game);

            budget += game.getHuidigeprijs();
            persoon.games.add(game);
            persoon.budget -= game.getHuidigeprijs();
            return true;
        }
    }
    public String zoekGameOpNaam(String naam){

        for( Game i : games) {
            if (i.getNaam() == naam) {

                 s = 1;
                break;

            }
        }
            if(s== 1){
                System.out.println( this.naam + " heeft "+ naam + " wel!");
            }
            else{
                System.out.println(this.naam + " heeft "+ naam + " Niet!");
            }

        return "";
    }
    public String toString(){
        String s = naam + " heeft een budget van €"+ budget + " en bezit de volgende games:\n";
        for (Game game: games ){
            s = s+ game+"\n";
        }
        return s;
    }
}
