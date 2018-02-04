
public class Aplikacja {
			
	public static void main(String[] args) {
	int x = 1;
		while(x==1){
		DaneWejscia var1=new DaneWejscia();
		System.out.println("Zmiana systemów liczbowych ( wpisz \"exit\") aby wyjœæ");
		var1.pobierzDane();
		var1.wynik(var1.getLiczba(),var1.getSystem());
		
		}
		
	}
	
	
	
}