
import java.util.Objects;
import java.util.Scanner;

public class DaneWejscia {

	private int liczba;
	private int systemLiczbowy;

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
	

	private int wezDane(boolean czyWprowadzaSystem) {
		Scanner input = new Scanner(System.in);
		String x;
		int output = 0;
		while (output == 0) {
			System.out.println(czyWprowadzaSystem? "Podaj system liczbowy 2 - 16:":"Podaj dodatni¹ liczbê ca³kowit¹:");
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
				output = sprawdzPoprawnosc(output, czyWprowadzaSystem);
			}
		}
		return output;
	}

	public int getLiczba() {
		return liczba;
	}

	public int getSystemLiczbowy() {
		return systemLiczbowy;
	}

	public void pobierzDane() {

		this.liczba = wezDane(false);

		this.systemLiczbowy = wezDane(true);
	}

	public void wynik(int liczba, int systemLiczbowy) {
	
			System.out.println("Liczba: " + liczba + " w systemie liczbowym " + systemLiczbowy + " wynosi:"
					+ oblicz(liczba, systemLiczbowy));
		

	}

	private static String oblicz(int x, int systemLiczbowy) {
		String wynik = "";
		String literka = "";

		if (x != 0) {
			if (x % systemLiczbowy >= 10) {
				literka = zamianaCyfry(x % systemLiczbowy);
			} else {
				literka = "" + x % systemLiczbowy;
			}
			wynik = (oblicz(x / systemLiczbowy, systemLiczbowy) + literka);
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
