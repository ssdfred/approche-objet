package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		Compte cpt1 = new Compte("123456", 1000.00);
		Compte cpt2 = new CompteTaux("789012", 2000.00, 0.05);
		
		System.out.println(cpt1);
		System.out.println(cpt2);

		Compte[] comptes = new Compte[2];
		
		comptes[0] = cpt1;
		
		comptes[1] = cpt2;
		
		for (Compte compte : comptes) {
			System.out.println(compte);
		}
	}

}
