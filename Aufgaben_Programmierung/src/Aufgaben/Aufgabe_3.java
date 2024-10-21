package Aufgaben;
import Prog1Tools.IOTools;

public class Aufgabe_3 {
	public static void main (String[] args) {
	
    String i = IOTools.readString("Geben Sie Ihre Vorname ein: ");    
    String p = IOTools.readString("Geben Sie Ihre Nachname ein: ");
    int k = IOTools.readInt("Geben Sie Ihr Geburtsjahr ein: ");
    int l = IOTools.readInt("Geben Sie Ihr Monat ein: ");
    int m = IOTools.readInt("Geben Sie Ihr Geburtstag ein: ");
    int r = (2024 - k)* 365 + l*12 + m;
    System.out.println(" Hallo " + i  + p );
    System.out.print(" Sie sind " +r + " Tage alt"); 
    
	}
}