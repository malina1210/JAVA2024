package Aufgaben;
import Prog1Tools.IOTools;
public class Auggabe_15 {
	
public static void main (String[] args) {
	int geheimZahl = (int) (99 * Math.random() + 1);
	System.out.println( "Willkommen beim Zahlenraten! Ich denke mir eine Zahl zwischen 0 und 100. Rate diese Zahl!");
	int zahl = 0;
	int x = 1;
	do {
		
	    zahl = IOTools.readInt( "Versuch " + x + ":  ");
	if (zahl == geheimZahl) {
		System.out.println("Du hast die Zahl beim " + x + " Versuch erraten!");
		
	}
	else if (zahl>geheimZahl){
		System.out.println("Meine Zahl ist kleiner!");
	}
	else if (zahl<geheimZahl){
		System.out.println("Meine Zahl ist groesser!");
	}
	x++;
	
	
	}
	while(zahl != geheimZahl);
}
}
