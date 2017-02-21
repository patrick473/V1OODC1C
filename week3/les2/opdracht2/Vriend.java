package week3.les2.opdracht2;

/**
 * Created by patrick on 2/14/2017.
 */
public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String voornaam,String achternaam, String email){
        this.voornaam = voornaam;
        this.achternaam = achternaam;;
        this.email = email;


    }
    public boolean equals(Object anderObject){
        boolean gelijkeObjecten = false;

        if(anderObject instanceof Vriend){
            Vriend andereVriend = (Vriend) anderObject;

            if (this.voornaam.equals(andereVriend.voornaam)&&
                    this.achternaam.equals(andereVriend.achternaam)&&
                    this.email.equals(andereVriend.email)){
                gelijkeObjecten = true;
            }
        }
        return gelijkeObjecten;
    }
    public String toString(){
        return voornaam + " "+ achternaam+", email: "+ email;
    }
}


