package Aufgaben;
import Prog1Tools.IOTools;

public class Aufgabe_4 {
	public static void main (String[] args) {
		long k = IOTools.readLong("Geben Sie Sekundenanzahl ein: ");
		int l = (int) (k/31536000);
		double m = k%31536000;
		int q = (int) (m/86400);
		double w = m%86400;
		int p = (int) (w/3600);
		double u = w%3600;
		int i = (int) (u/60);
		double f = u%60;
		int z =(int) (f);
		
		System.out.println(l +" Jahren,");
		System.out.println(q + " Tagen,");
		System.out.println(p + " Stunden,");
		System.out.println(i + " Minuten und,");
		System.out.println(z + " Sekunden.");
		
	}
}
