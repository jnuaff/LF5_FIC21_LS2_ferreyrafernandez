import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

   

        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        int ganzzahl = tastatur.nextInt();
        System.out.print("Sie haben " + ganzzahl + " eingegeben!\n\n");

        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein (Dezimaltrennzeichen ist das Komma): ");
        double kommazahl = tastatur.nextDouble();
        System.out.print("Sie haben " + kommazahl + " eingegeben!\n\n");

        System.out.print("Bitte geben Sie eine Wort ein : ");
        String wort = tastatur.nextLine();
        System.out.print("Sie haben '" + wort + "' eingegeben!\n\n");

        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");
        boolean wahrheitswert = tastatur.nextBoolean();
        System.out.print("Sie haben '" + wahrheitswert + "' eingegeben!\n\n");

        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");
        char buchstabe =  tastatur.next().charAt(0);
        System.out.print("Sie haben '" + buchstabe + "' eingegeben!\n");
       
        tastatur.close();
    }
}