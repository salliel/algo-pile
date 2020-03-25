package conversion;

import pile.ListeChaineePile;
import pile.Pile;

public class Conversion {
	
	
	public static void decimalToBinaire(int number, Pile<Integer> p) {
		
		System.out.print("la conversion en binaire de " + number + " vaut : ");
		try {
			
			do {
				p.push(number % 2);
				number/=2;
			}
			while(number > 0);
			
			Pile<Integer> pileIntermediaire = new ListeChaineePile<Integer>();
			
			while(p.hasNext()) {
				pileIntermediaire.push(p.next());
			}
			
			displayStack(pileIntermediaire);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	private static void displayStack(Pile<Integer> p) {
		
		while(p.hasNext()) {
			System.out.print(p.next());
		}
		
		newLigne();
	}
	
	private static void newLigne() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
