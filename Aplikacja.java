
public class Aplikacja {
			
	public static void main(String[] args) {
	int x = 1;
		while(x==1){
		DaneWejscia wprowadzaneDane=new DaneWejscia();
		System.out.println("Zmiana system�w liczbowych ( wpisz \"exit\") aby wyj��");
		wprowadzaneDane.pobierzDane();
		wprowadzaneDane.wynik(wprowadzaneDane.getLiczba(),wprowadzaneDane.getSystemLiczbowy());
		
		}
		
	}
	
	
	
}