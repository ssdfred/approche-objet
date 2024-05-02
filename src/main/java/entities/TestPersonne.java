package entities;

import entities2.Personne;


public class TestPersonne {


	public static void main(String[] args) {
				
		AdressePostale a1 = new AdressePostale(35, "rue marchand", 34500, "Montpellier");
		Personne p1 = new Personne("blunk", "fred",a1);
	//TODO afficher :
		p1.aficherNom();
		p1.aficherPrenom();
		
		
		
	}
	
	
}
