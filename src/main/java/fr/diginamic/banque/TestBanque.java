package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte[] comptes = {
            new Compte("123456", 1000.00), // Instance de Compte
            new CompteTaux("789012", 2000.00, 0.05) // Instance de CompteTaux
        };
		for (Compte compte : comptes) {
			System.out.println(compte);
		}
	}

}
