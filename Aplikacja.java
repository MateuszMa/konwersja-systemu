
public class Aplikacja {
			
	public static void main(String[] args) {
	int x = 1;
		while(x==1){
		DaneWejscia wprowadzaneDane=new DaneWejscia();
		System.out.println("Zmiana systemów liczbowych ( wpisz \"exit\") aby wyjœæ");
		wprowadzaneDane.pobierzDane();
		wprowadzaneDane.wynik(wprowadzaneDane.getLiczba(),wprowadzaneDane.getSystemLiczbowy());
		
		}
		
	}
	
	
	
}