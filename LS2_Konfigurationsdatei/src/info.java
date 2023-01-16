package konfigurationsdatei;

public class info {
    public static void main(String[] args) {
        // Wie viele Einwohner hat Berlin?
        int bewohnerBerlin = 3645000;
        // Wann wurde der erste Computer gebaut?
        short ersterComputer = 1941;
        // Wieviele Planeten hat unser Sonnesystem?
        byte anzahlPlaneten = 8;
        // Wieviele Sonnen sind in der Milchstraße?
        long sonnenMilchstrasse = 200000000000L;
        // Wie viel wiegt das schwerste Tier der Welt(kg)?
        byte schwerstesTier = 40;
        // Wie groß ist das kleinste Land der Erde?
        float flaecheKleinsteLand =0.44F;
        // Wieviel km2 der Erde sind mit Wasser bedeckt?
        int wasser = 1400000000;
        // An wieviel Tagen im Jahr regenet es durchschnittlich in Waialeale auf Hawaii?
        short regen = 335 ;
        // Wieviele Menschen leben auf der Erde?
        long einwohnerErde = 7500000000L;
        // Wie alt bist du? Wie viele Tage sind das?
        int alterTage = 9115;
        
        System.out.println("Bewohner von Berlin: " + bewohnerBerlin);
        System.out.println("Erste Computer gebaut: " + ersterComputer);
        System.out.println("Anzahl an Planeten: " + anzahlPlaneten);
        System.out.println("Sonnen in der Milchstraße: " + sonnenMilchstrasse);
        System.out.println("Schwerstes Tier: " + schwerstesTier);
        System.out.println("Fläche kleinste Land (km2): " + flaecheKleinsteLand);
        System.out.println("Wasser der Erde (km2): " + wasser);
        System.out.println("Regen in Waialeale (Tagen): " + regen);
        System.out.println("Einwoher auf der Erde: " + einwohnerErde);
        System.out.println("Alter in  Tagen: " + alterTage);
    }
}