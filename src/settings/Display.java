package settings;


/**
 *  Classe permettant d'ameliorer l'affichage
 *  
 * @author steeven & yossef
 *
 */
public class Display {

	/**
	 * Methode permettant d'avoir un affichage plus esthetique
	 * 
	 * @param s
	 */
	public static void embellishDisplay(String s){
		int size = ((100 - s.length())/2) - 1;
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}

		System.out.print("\n*");
		
		for (int i = 0; i < size; i++) {
			System.out.print(" ");
		}
		System.out.print(s);
		
		for (int i = 0; i < size; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		for (int i = 0; i < 100; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
