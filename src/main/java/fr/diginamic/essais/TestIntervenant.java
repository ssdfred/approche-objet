package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;


public class TestIntervenant {

	public static void main(String[] args) {
		// Création d'une instance de salaire
		Salarie salarie = new Salarie("Dupont", "Jean", 2000.0);
		System.out.println("Salaire de Jean Dupont : " + salarie.getSalaire());
		
	     // Création d'une instance de Pigiste
        Pigiste pigiste = new Pigiste("Martin", "Marie", 10, 100.0);
        System.out.println("Salaire de Marie Martin: " + pigiste.getSalaire());
        
        Salarie salarie2 = new Salarie("Dupont", "Jean", 2000.0);
        salarie2.afficherDonnees();
        Pigiste pigiste2 = new Pigiste("Martin", "Marie", 10, 100.0);
        pigiste2.afficherDonnees();
	}

}
