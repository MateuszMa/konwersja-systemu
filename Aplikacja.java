
public class Aplikacja {

	
		
	public static void main(String[] args) {
	int x = 1;
		while(x==1){
		DaneWejscia var1=new DaneWejscia();
		System.out.println("Zmiana systemów liczbowych");
		var1.pobierzDane();
		if (var1.getSystem()<=1 || var1.getSystem()>16){System.out.println("B³êdna wartoœæ");break;}
		else if(var1.getSystem()<=10){System.out.println("Liczba: "+ var1.getLiczba()+" w systemie liczbowym "+ var1.getSystem() + " wynosi:" + oblicz(var1.getLiczba(),var1.getSystem(),false));}
		else {System.out.println("Liczba: "+ var1.getLiczba()+" w systemie liczbowym "+ var1.getSystem() + " wynosi:" + oblicz(var1.getLiczba(),var1.getSystem(),true));}
		}
		
	}
	
	
	public static String oblicz(int x ,int system,boolean litery ) {
		String wynik="";
		String literka="";
		
		if (x!=0) {
			if (litery=true&&x%system>=10) {literka = zamianaCyfry(x%system);}
			else {literka=""+x%system;}	
		wynik =( oblicz (x/system,system,litery)+literka);				
		}
		return wynik;
		
	}
	public static String zamianaCyfry(int x) {
		String wynik="";
		String[] znaki= {"A","B","C","D","E","F"};
		wynik=znaki[(x-10)];
		return wynik;
	}
	
}