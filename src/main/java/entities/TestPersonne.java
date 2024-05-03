package entities;

import entities2.Personne;


public class TestPersonne {


	public static void main(String[] args) {
				
		AdressePostale adresse = new AdressePostale(35, "rue marchand", 34500, "Montpellier");
		AdressePostale adresse1 = new AdressePostale(35, "rue marchand", 34500, "Montpellier");
		Personne p1 = new Personne("blunk", "fred",adresse);
	
		p1.afficher();
		p1.setNom("blanc");
		p1.setAdresse(adresse1);
		
	}
	

}