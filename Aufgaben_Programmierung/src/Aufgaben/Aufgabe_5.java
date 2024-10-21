package Aufgaben;
import Prog1Tools.IOTools;

public class Aufgabe_5 {
	public static void main (String[] args) {
		
		int u = IOTools.readInt("Geben Sie Länge ein: ");
		int h = IOTools.readInt("Geben Sie Breite ein: ");
		double l = Math.sqrt(Math.pow(u, 2)+ Math.pow(h, 2)); 
		double d = u/ Math.PI;
		double Fb = Math.PI* Math.pow(d/2, 2);
		double Fm = u*h;
		double Fg = 2*Fb+Fm;
		double v = Fb*h;
		
		System.out.println(" Die Länge der Diagonalen des Blechstücks: " +l);
		System.out.println(" Der Durchmesser des Dosenbodens: " +d);
		System.out.println(" Fläche des Dosenbodens: " +Fb);
		System.out.println(" Mantelfläche der Dose: " +Fm);
		System.out.println(" Gesamtfläche der Dose: " +Fg);
		System.out.println(" Das Volumen der Dose: " +v);
	}
}
