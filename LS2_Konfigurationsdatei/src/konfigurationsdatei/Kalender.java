package konfigurationsdatei;

import java.util.Scanner;
public class Kalender {
	public static void main(String[] args) {
		int tage = 0;
		int monat;
		String name;
		Scanner tastatur = new Scanner(System.in);

		System.out.print("Wie lautet der Monat (1-12): ");
		monat = tastatur.nextInt();

		 int i= monat;
	        
	        switch(i){
	        case 1,3,5,7,8,10:
	            tage = 31;
	        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
	            break;
	        case 2:
	            tage = 28;
	            System.out.printf("Der 2-te Monat im Jahr hat 28 Tage.", monat, tage);
	            break;
	        case 4,6,9,11:
	            tage = 31;
	        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
	            break;
	        default:
	            System.out.println("i liegt nicht zwischen 0 und 12");
	            break;
	        }
                
		tastatur.close();
	}
}