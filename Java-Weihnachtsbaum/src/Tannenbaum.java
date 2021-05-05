import java.util.Random;

public class Tannenbaum {

	static int breite = 9;
	static int leerzeichen = (breite - 1) / 2;
	static int blaetter = 1;
	static Random wuerfel = new Random();
	static int zufallszahl;

	public static void zeichneBaum() {
		while (blaetter <= breite) {
			zeichneLeerzeichen();
			zeichneBlaetter();

			System.out.println();
			leerzeichen--;
			blaetter = blaetter + 2;
		}
		zeichneStamm();
	}

	public static void zeichneLeerzeichen() {
		for (int i = 0; i < leerzeichen; i++) {
			System.out.print(" ");
		}
	}

	public static void zeichneBlaetter() {
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
	}

	public static void zeichneStamm() {
		for (int i = 0; i < breite / 2; i++) {
			System.out.print(" ");
		}
		System.out.println("H");

	}

	public static void main(String[] args) {
		zeichneBaum();

	}
}