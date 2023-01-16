package konfigurationsdatei;

import java.util.Scanner;

public class RoemischeZahlen {
public static void main(String[] arg) {
	Scanner tastatur = new Scanner(System.in);
	
	int I = 1;
	int V = 5;
	int X = 10;
	int L = 50;
	int C = 100;
	int D = 500;
	int M = 1000;
	System.out.println("bitte römische nummer 1 und 2 eingeben: ");
	char num1, num2;
	
	
    num1 = tastatur.next().charAt(0);
    num2 = tastatur.next().charAt(0);
    
    if(num1 == 1) {
    	System.out.print("hi");
    }
	
    System.out.printf("erste nummer: %s\nzweite nummer: %s",num1, num2);
	

	
}
}
