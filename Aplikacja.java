
public class Aplikacja {
			
	private static final String USER_PROMPT_TEXT = "Zmiana systemów liczbowych ( wpisz \"exit\") aby wyjść";
	
	public static void main(String[] args) {
		
		while(true) {
			DaneWejscia wprowadzaneDane = new DaneWejscia();
			System.out.println(USER_PROMPT_TEXT);
		
			wprowadzaneDane.pobierzDane();
			wprowadzaneDane.wynik(wprowadzaneDane.getLiczba(), wprowadzaneDane.getSystemLiczbowy());
		}		
	}	
}
