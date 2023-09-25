
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
        int szam = 0;
            for (int i = 0; i < 21; i++) {
          System.out.printf("%-8s", kartyak[i]);
          szam++;
            if(szam % 3 == 0){
                System.out.println();
            }
        }
        for (int i = 0; i < 3; i++) {
           kirak(kartyak);
        }
        ezVolt(kartyak);
    }

    private static void kirak(String[] kartyak) {
        int szam = 0;
        int pozicio[] = new int [21];
        pozicio = kever();
        for (int j = 0; j < 21; j++) {
            System.out.printf("%-8s", kartyak[pozicio[j]]);
            szam++;
            if(szam % 3 == 0){
                System.out.println();
            }
        }
    }
    

    private static int melyik() {
        boolean jo;
        int oszlop = 0;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = scr.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
            
        } while (!jo);
        return oszlop;
}
    

    private static int [] kever() {
        int kartyakHelye[] = new int [21];
        int szam = melyik();
        switch(szam){
            case 1:
                for (int i = 1; i <= 7; i++) {
                    kartyakHelye[i-1] = 19 - (i - 1) * 3;
                    kartyakHelye[i-1+7] = 18 - (i - 1) * 3;
                    kartyakHelye[i-1+14] = 20 - (i - 1) * 3;
                }
                break;
               
            case 2:
                for (int i = 1; i <= 7; i++) {
                    kartyakHelye[i-1] = 18 - (i - 1) * 3;
                    kartyakHelye[i-1+7] = 19 - (i - 1) * 3;
                    kartyakHelye[i-1+14] = 20 - (i - 1) * 3;
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++) {
                    kartyakHelye[i-1] = 20 - (i - 1) * 3;
                    kartyakHelye[i-1+7] = 18 - (i - 1) * 3;
                    kartyakHelye[i-1+14] = 19 - (i - 1) * 3;
                 
                 }
                 break;
            }
        
        return kartyakHelye;
        }
            
    
    private static void ezVolt(String [] kartyak) {
        System.out.println("Ez a kártya volt:"+kartyak[11]);
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
