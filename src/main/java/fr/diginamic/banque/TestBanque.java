package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte[] comptes = new Compte[2];
		
		comptes[0] = new Compte("123456", 1000.00);
		
		comptes[1] = new CompteTaux("789012", 2000.00, 0.05);
		
		for (Compte compte : comptes) {
			System.out.println(compte);
		}
	}

}
