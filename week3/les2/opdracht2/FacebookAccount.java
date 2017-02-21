package week3.les2.opdracht2;

import java.util.ArrayList;


/**
 * Created by patrick on 2/14/2017.
 */
public class FacebookAccount {

    private String naam;
    private ArrayList vrienden = new ArrayList();
    private Vriend vriendVan;

    public FacebookAccount(String naam){
        this.naam = naam;
    }

    public String getNaam(){
        return naam;
    }
    public void voegVriendToe(Vriend vriend) {
        if (!vrienden.contains(vriend)) {
            vrienden.add(vriend);
        }
    }
    public boolean verwijderVriend(Vriend verwijderdeVriend){
            if(vrienden.contains(verwijderdeVriend)){
            vrienden.remove(verwijderdeVriend);
            return true;
            }
            else{
                return false;
            }
    }
    public boolean isVriendMet(Vriend vriend){
        return(vrienden.contains(vriend));
        }
    public Integer aantalVrienden(){
        return(vrienden.size());
    }
    public String toString(){
        String s = naam + " heeft "+ aantalVrienden() + " vrienden \n";

        for (int i = 0; i < vrienden.size(); i++) {
            s=s+ vrienden.get(i)+ "\n";
        }

        return s;
    }





    }

