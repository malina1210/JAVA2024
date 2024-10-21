package Aufgaben;
import Prog1Tools.IOTools;

public class Aufgabe_14 {
	

public static void main (String[] args) {
		
		int z = IOTools.readInt("Positive ganze Zahl:  ");
		
		while (z!=0)
		{
			int zw = z%10;
		z  = z/10;
		String ziffer = "Tag";
		switch (zw) {
		case 1:
			ziffer = " ein";
			break;
		case 2:
			ziffer = " zwei";
			break;
		case 3:
			ziffer = " drei";
			break;
		case 4:
			ziffer = " vier";
			break;
		case 5:
			ziffer = " fünf";
			break;
		case 6:
			ziffer = " sechs";
			break;
		case 7:
			ziffer = " sieben";
			break;
		case 8:
			ziffer = " acht";
			break;
		case 9:
			ziffer = " neun";
			break;
			}
		System.out.print(ziffer);
		}	
	}
}
