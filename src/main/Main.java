package main;

import conversion.Conversion;
import pile.ListeChaineePile;
import pile.Pile;
import pile.TabDynamiquePile;
import pile.TabStatiquePile;
import settings.Display;

public class Main {
	
	public static void main(String[] args) {

		Pile<Integer> p1 = new TabStatiquePile<Integer>(10);
		Pile<Integer> p2 = new TabDynamiquePile<Integer>(10);
		Pile<Integer> p3 = new ListeChaineePile<Integer>();
		
		Display.embellishDisplay("tableau statique");
		Conversion.decimalToBinaire(4, p1);
		
		Display.embellishDisplay("tableau dynamique");
		Conversion.decimalToBinaire(4, p1);
		
		Display.embellishDisplay("tableau liste chainée");
		Conversion.decimalToBinaire(4, p1);
	}
		
		
		
	

}
