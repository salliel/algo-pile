package settings;

public class Display {

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
