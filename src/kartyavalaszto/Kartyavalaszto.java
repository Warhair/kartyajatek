
package kartyavalaszto;
import java.util.Scanner;

public class Kartyavalaszto {
   
    static Scanner scr = new Scanner(System.in);
    
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        String kartyak[] = new String [21];
        String szinek[] = {"P", "T", "Z", "M"};
        String ertekek[] = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        
        kartyakiir(szinek, ertekek, kartyak);
        for (int i = 0; i < 3; i++) {
           kirak(kartyak);
            melyik();
            kever();
        }
        ezVolt();
    }

    private static void kirak(String[] kartyak) {
        int szam = 0;
        for (int i = 0; i < 21; i++) {
            System.out.printf("%-8s", kartyak[i]);
            szam++;
            if(szam % 3 == 0){
                System.out.println();
            }
        }
    }

    private static void melyik() {
       
        boolean jo;
        do {
           System.out.println("Adja meg melyik oszlopot választod:(1-3)"); 
           int oszlop = scr.nextInt();
           jo = oszlop >= 1 && oszlop <= 3;
        }while(!jo);
            
        }
    

    private static void kever() {
   
    }

    private static void ezVolt() {
}


    public static String[] kartyakiir(String[] szinek, String[] ertekek, String[] kartyak) {
        int i = 0;
        for (String szin: szinek) {
            for (int j = 0; i < 21 && j < ertekek.length; j++) {
                kartyak[i++] = szin + "_" + ertekek[j];
            }
            
        }
        return kartyak;
    }
}