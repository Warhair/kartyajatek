
package kartyavalaszto;


public class Kartyavalaszto {
   
    
    public static void main(String[] args) {
        jatek();
    }

    private static void jatek() {
        String kartyak[] = new String [21];
        String szinek[] = {"P", "T", "Z", "M"};
        String ertekek[] = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        
        kartyakiir(szinek, ertekek, kartyak);
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
    }

    private static void kirak() {
        
    }

    private static void melyik() {
        
    }

    private static void kever() {
   
    }

    private static void ezVolt() {
}


    public static String[] kartyakiir(String[] szinek, String[] ertekek, String[] kartyak) {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    kartyak[i] = szinek[j]+"_"+ertekek[k];
                }
                
            }
        }
        for (int i = 12; i < 21; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    kartyak[i] = szinek[j]+"_"+ertekek[k+3];
                }
            }
            
        }
        return kartyak;
    }
}