
import java.util.Objects;
import java.util.Scanner;

public class DaneWejscia {

	private int liczba;
	private int system;

	private int sprawdzPoprawnosc(int x, boolean system) {

		if (system) {
			if (x < 2 || x > 16) {
				x = 0;
				System.out.println("B³êdna wartoœæ");
			}
		} else {
			if (x < 0) {
				x = 0;
				System.out.println("B³êdna wartoœæ");
			}
		}
		return x;
	}

	private void napis(boolean system) {
		if (system == true) {
			System.out.println("Podaj system liczbowy 2 - 16:");
		} else {
			System.out.println("Podaj dodatni¹ liczbê ca³kowit¹:");
		}
	}

	private int wezDane(boolean system) {
		Scanner input = new Scanner(System.in);
		String x;
		int output = 0;
		while (output == 0) {
			napis(system);
			x = input.nextLine();
			if (Objects.equals(x, new String("exit"))) {
				System.out.println("Zakoñczono");
				System.exit(0);
			} else {
				try {
					output = Integer.valueOf(x);
				} catch (Exception e) {
					System.out.println("B³êdna wartoœæ");
				}
				output = sprawdzPoprawnosc(output, system);
			}
		}
		return output;
	}

	public int getLiczba() {
		return liczba;
	}

	public int getSystem() {
		return system;
	}

	public void pobierzDane() {

		this.liczba = wezDane(false);

		this.system = wezDane(true);
	}

	public static String wynik(int liczba, int system) {
		
		
		return oblicz(liczba, system);
		
	}

	private static String oblicz(int x, int system) {
		String wynik = "";
		String literka = "";

		if (x != 0) {
			if (x % system >= 10) {
				literka = zamianaCyfry(x % system);
			} else {
				literka = "" + x % system;
			}
			wynik = (oblicz(x / system, system) + literka);
		}
		return wynik;

	}

	private static String zamianaCyfry(int x) {
		String wynik = "";
		String[] znaki = { "A", "B", "C", "D", "E", "F" };
		wynik = znaki[(x - 10)];
		return wynik;
	}

}
