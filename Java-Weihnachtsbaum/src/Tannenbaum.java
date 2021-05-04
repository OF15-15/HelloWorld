
public class Tannenbaum {

	public static void main(String[] args) {
		int breite = 90;
		int leerzeichen = (breite - 1) / 2;
		int blaetter = 1;
		while (blaetter <= breite) {
			for (int i = 0; i < leerzeichen; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < blaetter; i++) {
				System.out.print("1");
			}
			System.out.println();
			leerzeichen--;
			blaetter = blaetter + 2;
		}
		for (int i = 0; i < breite / 2; i++) {
			System.out.print(" ");
		}
		System.out.println("O");
	}
}
