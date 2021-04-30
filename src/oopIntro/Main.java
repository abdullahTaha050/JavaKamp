package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V15", 15000, "16 GB Ram", 10); //referans olu�turma.
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo Legion Y520");
		product2.setUnitPrice(16000);
		product2.setDetail("8 GB Ram");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("��ecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());

	}

}
