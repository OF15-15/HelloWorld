import java.util.Random;

public class Tannenbaum {

	public static void main(String[] args) {
		int breite = 9;
		int leerzeichen = (breite - 1) / 2;
		int blaetter = 1;
		Random wuerfel = new Random();
		int zufallszahl;

		while (blaetter <= breite) {
			for (int i = 0; i < leerzeichen; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < blaetter; i++) {
				zufallszahl = wuerfel.nextInt(10);
				if (zufallszahl == 0)
					System.out.print("x");
				else {
					if (zufallszahl == 1)
						System.out.print("O");
					else
						System.out.print("1");
				}
			}
			System.out.println();
			leerzeichen--;
			blaetter = blaetter + 2;
		}
		for (int i = 0; i < breite / 2; i++) {
			System.out.print(" ");
		}
		System.out.println("H");
	}
}
