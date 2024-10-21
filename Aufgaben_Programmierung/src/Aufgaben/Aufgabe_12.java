package Aufgaben;

import Prog1Tools.IOTools;

public class Aufgabe_12 {
	
	public static void main (String[] args) {
		
		double g = IOTools.readInt("Anzulegender Geldbetrag in Euro:  ");
		double j = IOTools.readDouble("Jahreszins (z. B. 0.1 fuer 10 Prozent):  ");
		int l = IOTools.readInt("Laufzeit (in Jahren):  ");
		int i;
	    for ( i=1; i<=l; i ++) {
	    	 g = g+(g*j);
	    	System.out.println( g);
	  	 
	    }
	}
}
