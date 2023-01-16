package konfigurationsdatei;

public class konfiguration {
    public static void main(String[] args) {
         
        int euro;
        int cent;
        int summe;
        String typ = "Automat AVR";
        String bezeichnung = "Q2021_FAB_A";
        char sprachModul = 'd';
        final byte PRUEFNR = 4;
        double prozent;
        double patrone = 46.24;
        String name;
        double maximum = 100.00;
        int muenzenCent = 1280;        
        int muenzenEuro = 130;
        boolean status;
       
        prozent = maximum - patrone;
        name = typ + " " + bezeichnung;    
        summe = muenzenCent + muenzenEuro * 100;    
         cent = summe % 100;
        euro = summe / 100;
        status = (euro <= 150)    && (prozent >= 50.00)&& (euro >= 50)&& (cent != 0)&& (sprachModul == 'd')&&  (!(PRUEFNR == 5 || PRUEFNR == 6));
            
            System.out.println("Name: " + name);
            System.out.println("Sprache: " + sprachModul);
            System.out.println("Prüfnummer : " + PRUEFNR);
            System.out.println("Füllstand Patrone: " + prozent + " %");
            System.out.println("Summe Euro: " + euro +  " Euro");
            System.out.println("Summe Rest: " + cent +  " Cent");       
            System.out.println("Status: " + status);
    }
}