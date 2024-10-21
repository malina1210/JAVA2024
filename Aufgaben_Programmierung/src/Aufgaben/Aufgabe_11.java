package Aufgaben;

import Prog1Tools.IOTools;

public class Aufgabe_11 {

	public static void main (String[] args) {
		int x = IOTools.readInt("Geben Sie ein Zahl ein: ");
		int i;
		System.out.print( "Die Vielfachen: ");
	    for ( i=1; i<=10; i ++) {
	    	int m = i * x;
	    	System.out.println(m);
	    }
	    
	}
	 
}
