package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButon = "Ýnternet Þubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dolarDustuMu = false; //veya true 1-0 deðil
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü");
		}
		
//		System.out.println(internetSubeButon);
		
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Konut kredisi";
		String kredi3 = "Meb kredisi";
		
		String[] krediler = {"Hýzlý kredi", "Konut kredisi", "Meb kredisi"};
		
		
		//krediler as kredi gibi yani (foreach)
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
//		ctrl shift c yorum satýrý kýsayolu
		
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
