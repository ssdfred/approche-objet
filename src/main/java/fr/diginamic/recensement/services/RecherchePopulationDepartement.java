package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RecherchePopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le code du département : ");
		String codeDepartement = scanner.nextLine();

		int populationTotale = 0;
		List<Ville> villes = recensement.getVilles();
		for (Ville ville : villes) {
			if (ville.getCodeDepartement().equalsIgnoreCase(codeDepartement)) {
				populationTotale += ville.getPopulationTotale();
			}
		}
		System.out.println("Population du département " + codeDepartement + " : " + populationTotale);
	}

}
