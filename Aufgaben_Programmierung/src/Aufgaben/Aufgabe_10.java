package Aufgaben;
import Prog1Tools.IOTools;

public class Aufgabe_10 {

	public static void main (String[] args) {
		int t = IOTools.readInt("Geben Sie der heutige Tag ein: ");
		int m = IOTools.readInt("Geben Sie Monat ein: ");
		int j = IOTools.readInt("Geben Sie Jahr ein: ");
		
		System.out.println("Der " + t + "." + m + "." + j);
		if (m<= 2){
				 m = m + 10;
				 j--;
		}
			else {
				m = m - 2;
			}
			int c = j/100;
			int y = j%100;
			int h = (((((26 * m) - 2)/10) + t + y + y/4 + c/4 - 2 * c) % 7);
			if (h<0) {
				h = h+7;
			}
			String wochentag = "Tag";
			switch (h) {
			case 1:
				wochentag = " Montag";
				break;
			case 2:
				wochentag = " Dienstag";
				break;
			case 3:
				wochentag = " Mittwoch";
				break;
			case 4:
				wochentag = " Donnerstag";
				break;
			case 5:
				wochentag = " Freitag";
				break;
			case 6:
				wochentag = " Samstag";
				break;
			case 0:
				wochentag = " Sonntag";
				break;
			}
			
		System.out.println("ist ein" + wochentag);
		}
	}

