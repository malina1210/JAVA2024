package Aufgaben;

import Prog1Tools.IOTools;

public class Aufgabe_13 {
	
public static void main (String[] args) {
		
		int zeilen = IOTools.readInt("Anzahl der Zeilen: ");
		for (int i=1; i<=zeilen;  i ++) {
			for (int j =1; j<=i; j++) {
			System.out.print(  "*" );
			}
			System.out.print( "\n");
		}
	}
}
