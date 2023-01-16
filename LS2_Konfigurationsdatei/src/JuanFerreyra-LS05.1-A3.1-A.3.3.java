import java.util.Scanner;

public class Begruessung {
	public static void main(String[] args) {
		
	
	int zahl1 = 0; // erste Zahl eingesetzt
	int zahl2 = 0;  // zweite Zahl eingesetzt.
	double ergebnis = 0;  
	Scanner tastatur = new Scanner(System.in); // erstellen enes Objektes, die das Einlesen der Tastatur ermöglicht
	System.out.print("Bitte geben Sie eine ganze Zahl ein: "); // Ausgabe in der Console eines Befehles.
	zahl1 = tastatur.nextInt();  // Einlesen von erste eingegebene Zahl ist.  
	System.out.print("Bitte geben Sie eine zweite ganze Zahl ein: ");
	zahl2 = tastatur.nextInt(); //Einlesen von zeweite eingegebene Zahl ist.  
	ergebnis = zahl1 + zahl2; // Summe von beiden Zahlen die durch die Console gespeichert wurden.
	System.out.println("\nSumme: " + ergebnis); // Ausgabe des Ergebnisses.
	ergebnis = zahl1 - zahl2;
	System.out.println("\nDifferenz: " + ergebnis);
	ergebnis = zahl1 * zahl2;
	System.out.println("\nProdukt: " + ergebnis);
	tastatur.close(); //Schliesst die Eingabe.
	ergebnis = (double) zahl1 / zahl2;
	System.out.println("\nQuotient: " + ergebnis);
	ergebnis = zahl1%zahl2;
	System.out.println("\nRest: " + ergebnis);
	
	
	
	}
	
}