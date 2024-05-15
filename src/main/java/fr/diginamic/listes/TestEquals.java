package fr.diginamic.listes;

public class TestEquals {


	public static void main(String[] args) {
		
		Ville nante= new Ville("Nante", 4000);
		Ville nante1= new Ville("Nante", 4000);
		
		Ville Lille= new Ville("Lille", 4000);
		Ville Reins= new Ville("Reins", 4000);
		
		if (nante.equals(nante1)) {
			System.out.println("Les villes sont identiques");
		} else {
			System.out.println("Les villes sont differentes");
		}
		if (Lille.equals(Reins)) {
			System.out.println("Les villes sont identiques");
		} else {
			System.out.println("Les villes sont differentes");
		}
		
	}

}
