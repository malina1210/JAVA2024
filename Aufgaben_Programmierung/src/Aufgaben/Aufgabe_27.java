package Blatt_7;
import Prog1Tools.IOTools;

public class Aufgabe_27 {
	
		public static void main(String[] args) {
			int pernr = IOTools.readInteger ("Wie Viel Personen wollen Sie sortieren?");
			Person [] persons = new Person [pernr];
			
			for (int i=0; i < pernr ; i++) {
				System.out.println ((i+1) + "Person:");
				persons [i] = new Person();
				persons[i].name =IOTools.readString ("Name: ");
				persons[i].surname =IOTools.readString ("Surname: ");
				persons[i].age =IOTools.readInteger ("Age: ");
				persons[i].personalnummer = (i+1);	
			}
			
			for (  int k = 0; k<pernr; k++ ) {
				for ( int j = 0; j<pernr-1; j++ ) {
					if (persons[j].age > persons[j+1].age) {
						Person temp = persons[j];
						persons[j] = persons[j+1];
						persons[j+1]= temp;
					}
				}
			}
			System.out.println ( );
			for ( int l=0; l<pernr; l++) {
				System.out.println (" Person " + (l+1) + " : " +   persons[l].name + ",  "   + persons[l].surname +",  "   + persons[l].age + ",  "   + persons[l].personalnummer+"."   );
			}
		}
}

