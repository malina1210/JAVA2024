package Aufgaben;

public class Aufgabe_6 {
	public static void main (String[] args) {
	long x1 = (long) Math.pow(10, 20);
	long x2 = 1223;
	long x3 = (long) Math.pow(10, 18);
	long x4 = (long) Math.pow(10, 15);
	int x5 = 3;
	long x6 =  (long) -Math.pow(10, 12);
	long y1 = (long) Math.pow(10, 20);
	int y2 = 2;
	int y5 = 2111;
	long y3 = (long) -Math.pow(10, 22);
	long y4 = (long) Math.pow(10, 13);
	long y6 = (long) Math.pow(10, 16);
	
	long F =x1*y1 + x2*y2 + x3*y3 + x4*y4 + x5*y5 + x6*y6;
	System.out.println(" Das erste Ergebnis: " + F);
	
	long x = 192119201;
	long y = 35675640;
	long P = (long) (1/107751 *(1682*x*y*y*y*y + 3*x*x*x + 29*x*y*y - 2*x*x*x*x*x + 832));
	System.out.println(" Das zweite Ergebnis: " + P);
	
	long k =  (long) (x*y*y/107751*(1682*y*y+29)+ x*x*x/107751*(3-2*x*x)+832/107751);
	System.out.println(" Das dritte Ergebnis: " + k);		
	}
}
