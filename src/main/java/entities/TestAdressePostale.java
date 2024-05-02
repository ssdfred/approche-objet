package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
	
		// Toutes les variables déclaré dans une methode sont dites LOCALES
		AdressePostale a1 = new AdressePostale(35, "rue marchand", 34500, "Montpellier");
		
		AdressePostale a2 = new AdressePostale(10, "rue du bonheur", 34200, "lille");
		//une variable licale doit etre initialisée
		int cpt = 0;
		if (a1!=null) {
			cpt++;
		}
		System.out.println(cpt);
	}
	

}
