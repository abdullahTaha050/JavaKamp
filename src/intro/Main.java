package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButon = "�nternet �ubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.10;
		int vade = 36;
		boolean dolarDustuMu = false; //veya true 1-0 de�il
		
		if (dolarBugun < dolarDun) {
			System.out.println("Dolar d��t�");
		}
		
//		System.out.println(internetSubeButon);
		
		String kredi1 = "H�zl� kredi";
		String kredi2 = "Konut kredisi";
		String kredi3 = "Meb kredisi";
		
		String[] krediler = {"H�zl� kredi", "Konut kredisi", "Meb kredisi"};
		
		
		//krediler as kredi gibi yani (foreach)
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
//		ctrl shift c yorum sat�r� k�sayolu
		
		for(int i=0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
