
import java.util.Scanner;
public class DaneWejscia {
	
	private int liczba;
	private int system; 

	private int wezDane() {
		Scanner input = new Scanner (System.in);
		int x;
		x=input.nextInt();
		return x;}
	/*
	public void setLiczba() {
		this.liczba = wezDane();
				}
	*/
	public int getLiczba() {
		return liczba;
	}
	/*
	public void setSystem() {
		this.system = wezDane();
				}
	*/
	public int getSystem() {
		return system;
	}
	public void pobierzDane() {
		System.out.println("Podaj liczbê:");
		this.liczba = wezDane();
		System.out.println("Podaj system liczbowy:");
		this.system = wezDane();
	}
	
}
