package week5;

/**
 * Created by patrick on 3/13/2017.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] arg)
     throws IOException{
        Integer regels = 0;
        Double totaal = 0.0;
        FileReader fr = new FileReader("src\\week5\\invoer.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.lines());
        String regel = br.readLine();
        while(regel != null){
            regels ++;
            totaal +=  Double.parseDouble(regel);
           System.out.println(regel);
           regel = br.readLine();
        }
        System.out.println("");
        System.out.println(regels);
        System.out.println(totaal / regels);
    }


}
