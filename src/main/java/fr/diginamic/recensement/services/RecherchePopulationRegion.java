package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RecherchePopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le code de la région : ");
		String codeRegion = scanner.nextLine();

		int populationTotale = 0;
		List<Ville> villes = recensement.getVilles();
		for (Ville ville : villes) {
			if (ville.getCodeRegion().equalsIgnoreCase(codeRegion)) {
				populationTotale += ville.getPopulationTotale();
			}
		}
		System.out.println("Population de la région de  " + codeRegion + " : " + populationTotale);

	}

}
