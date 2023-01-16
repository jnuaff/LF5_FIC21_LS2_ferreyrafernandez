package konfigurationsdatei;

import java.util.Scanner;

public class Fallunterscheidungen {
public static void main(String[] args) {
	Scanner tastatur = new Scanner(System.in);
	
	int zahl;
	System.out.print("ein Zahl eingeben: ");
	zahl = tastatur.nextInt();
    if(zahl == 1) {
    	System.out.println(zahl + " = Sehr gut");
    } else if (zahl == 2) {
    	System.out.println(zahl + " = Gut");
    }
    else if (zahl == 3) {
    	System.out.println(zahl + " = Befriedigend");
    }
    else if (zahl == 4) {
    	System.out.println(zahl + " = Ausreichend");
    }
    else if (zahl == 5) {
    	System.out.println(zahl + " = Mangelhaft");
    }
    else if (zahl == 6) {
    	System.out.println(zahl + " = Ungenügend");
    } else {
    	System.out.print("Ein gültige nummer eingeben");
    }
}
}
		

