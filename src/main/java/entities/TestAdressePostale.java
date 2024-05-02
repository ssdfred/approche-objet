package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
	
		AdressePostale a1 = new AdressePostale(35, "rue marchand", 34500, "Montpellier");
		
		AdressePostale a2 = new AdressePostale(10, "rue du bonheur", 34200, "lille");
		
		System.out.println(a1);
		System.out.println(a2);
	}
	

}
