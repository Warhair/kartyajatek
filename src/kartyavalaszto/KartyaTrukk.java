
package kartyajatekoop;

import java.util.Scanner;


public class KartyaTrukk {
    private static Scanner scr = new Scanner(System.in);
    Pakli pakli = new Pakli(0);
    public KartyaTrukk(){
        indit();
    }

    private  void indit() {
        pakli.feltolt();
        for (int i = 0; i < 3; i++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }

private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = scr.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
}
}

