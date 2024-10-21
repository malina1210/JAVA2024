package Blatt6;
import Prog1Tools.IOTools;

public class Aufgabe_24 {
		
		public class MeinTyp {
			public int a, b, c;
			}

		public class NochEinTyp {
			public int h;
			public MeinTyp x;
			}

		public static void main (String[] args) {
			NochEinTyp t = new NochEinTyp ();
			t.h =100;
			t.x = new MeinTyp();
			t.x.a = 7;
			t.x.b = 8;
			t.x.c = 9;
			 
			NochEinTyp tr = t;
			
			NochEinTyp tf = new NochEinTyp ();
			tf.h = t.h;
			tf.x = t.x;
			
			NochEinTyp tt = new NochEinTyp ();
			tt.h = t.h;
			tt.x = new MeinTyp();
			tt.x.a = t.x.a;
			tt.x.b = t.x.b;
			tt.x.c = t.x.c;
			
		}
		
		public class Mitspieler {
			public static int gesamtzahl = 0;
			public int nummer;
			public String name;
			}
		public class VerwaltungToDo {
			public static void main (String [] args)
			{
				Mitspieler.gesamtzahl = IOTools.readInteger ("Wie viele Mitspieler gibt es?");
				Mitspieler [] m = new Mitspieler [Mitspieler.gesamtzahl];
				
				for (int i = 0; i < m.length; i++) {
					System.out.println ( (i+1) + "Mitspieler eingeben");
					
					m[i] = new Mitspieler ();
					m[i].name = IOTools.readLine("Name");
					boolean readAgain;
					do {
				    readAgain =false;
					m[i].nummer = IOTools.readInteger("Nummer: ");
					for  (int k=0; k < i;) {
						if (m[i].nummer == m[k].nummer) {
							readAgain = true;
							
							break;
								}
							}
						}while (readAgain);
					    
					    }
					
				for ( int i = 0; i < m.length; i++) {
					System.out.println("mitspieler " +  (i+1) + "( " + m[i].name + " hat Nummer" + m[i].nummer);
				}
				for (Mitspieler x:m) {
					System.out.println("mitspieler " +  (i+1) + "( " + x.name + " hat Nummer" + m[i].nummer);
					
				}
				
			}
		}
	}

