package fr.diginamic.banque;

import java.util.Date;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
        
        // Création d'un tableau d'opérations
        Operation[] operations = new Operation[4];
        
        // Ajout de 4 opérations dans le tableau
        operations[0] = new Credit(new Date(), 300.00);
        operations[1] = new Debit(new Date(), -200.00);
        operations[2] = new Credit(new Date(), 500.00);
        operations[3] = new Debit(new Date(), -400.00);
        
		double montantTotal = 0.0; // Initialisation du montant total à 0.0

		// Boucle pour afficher les informations de chaque opération et calculer le montant total
		for (Operation operation : operations) {
			System.out.println("Date de l'opération: " + operation.getDateOperation());
			
			// Affichage du montant avec le signe approprié
			if (operation.getType().equals("DEBIT")) {
				System.out.println("Montant de l'opération: -" + operation.getMontant());
				montantTotal -= operation.getMontant(); // Soustraction pour les débits
			} else {
				System.out.println("Montant de l'opération: +" + operation.getMontant());
				montantTotal += operation.getMontant(); // Addition pour les crédits
			}
			
			System.out.println("-------------------------");
		}
		
		// Affichage du montant total avec le signe approprié
		if (montantTotal < 0) {
			System.out.println("Montant total des opérations: -" + Math.abs(montantTotal));
		} else {
			System.out.println("Montant total des opérations: +" + montantTotal);
		}
	}

}

