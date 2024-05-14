package fr.diginamic.recensement.services;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class RecherchePopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		System.out.println("Entrez le nom de la ville : ");
		String nomVille = scanner.nextLine();
		
		List<Ville> villes = recensement.getVilles();
		for (Ville ville : villes) {
			if (ville.getNomCommune().equalsIgnoreCase(nomVille)) {
				System.out.println("Population de " + nomVille + " : " + ville.getPopulationTotale());
				return;
			}
		}
		System.out.println("Ville non trouvé.");

	}

}
