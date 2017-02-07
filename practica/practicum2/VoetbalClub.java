package practicum2;

/**
 * Created by patrick on 2/7/2017.
 */
public class VoetbalClub {
    public String naam;
    private Integer aantalGewonnen = 0;
    private Integer aantalGelijk = 0;
    private Integer aantalVerloren = 0;
    private Integer aantalGespeeld =0;
    public VoetbalClub(String nm){
        naam = nm;
    }
    public VoetbalClub(String nm,Integer aw, Integer ag, Integer av){
        naam = nm;
        aantalGewonnen = aw;
        aantalGelijk = ag;
        aantalVerloren = av;
    }
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
            aantalGespeeld += 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
            aantalGespeeld += 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
            aantalGespeeld += 1;
    }
    public Integer getAantalGespeeld (){
        return aantalGespeeld ;
    }
    public Integer getAantalGewonnen (){
        return aantalGewonnen;
    }
    public Integer getAantalGelijk (){
        return aantalGelijk;
    }
    public Integer getAantalVerloren (){
        return aantalVerloren;
    }
}
