package week2.les1.opdracht2;

/**
 * Created by patrick on 2/7/2017.
 */
public class Main {

        public static void main(String[] arg) {
            Eigenaar e1 = new Eigenaar("Willem de Moller");
            System.out.println(e1);
            e1.setBeestje( new Huisdier("Nero", "Dobermann") );
            System.out.println(e1);
            System.out.println();
            Eigenaar e2 = new Eigenaar("Pluk");
            System.out.println(e2);
            e2.setBeestje( new Huisdier("Zaza", "kakkerlak") );
            System.out.println(e2);
            System.out.println();
            System.out.println(e1.getBeestje());
            System.out.println(e2.getBeestje());
        }
    }
