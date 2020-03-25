package conversion;

import java.util.Iterator;

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
			
			displayStack(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	


	private static void displayStack(Pile<Integer> p) {
		
		Iterator<Integer> it = p.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
		newLigne();
	}
	
	private static void newLigne() {
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
