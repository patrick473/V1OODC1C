package practica.practicum13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;
/**
 * Created by patrick on 3/14/2017.
 */


public class Main {
    public static void main(String[] arg) throws IOException{

        Scanner scanner = new Scanner(System.in);
        System.out.print("wat is het bronbestand: ");
        String bron = scanner.nextLine();
        System.out.println(bron);
        System.out.println("wat is de bestemming: ");
        String bestemming = scanner.nextLine();
        System.out.println(bestemming);
        System.out.println("wat is de waarde van 1 dollar in eurocenten: ");
        Double waarde = Double.parseDouble(scanner.nextLine());
        System.out.println(waarde);
        scanner.close();

        BufferedReader br = new BufferedReader(new FileReader(bron));
        String[] values ;
        ArrayList<String> valueList = new ArrayList<>();

        String regel = br.readLine();

        while(regel != null){
            values = regel.split(" : ");
            valueList.add(values[0]+" : ");
            Double price = Double.parseDouble(values[1]);
            valueList.add(price/waarde+"\n");
            regel = br.readLine();
        }
        br.close();


        PrintWriter pw = new PrintWriter(new FileWriter(bestemming));

        for(int i = 0; i<valueList.size(); i++){
            pw.print(valueList.get(i));
        }
        pw.close();
    }
}