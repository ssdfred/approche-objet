package fr.diginamic.recensement.services;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class AfficherVillesPlusPeupleesDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		  System.out.print("Entrez le nom du departement : ");
	        String codeDepartement  = scanner.nextLine();

	        // Filtrer les villes du départements spécifiée
	        List<Ville> villesDuDepartement = recensement.getVilles().stream()
	                .filter(ville -> ville.getCodeDepartement().equalsIgnoreCase(codeDepartement ))
	                .collect(Collectors.toList());

	        if (villesDuDepartement.isEmpty()) {
	            System.out.println("Département non trouvée ou sans villes.");
	            return;
	        }

	        // Trier les villes par population décroissante et prendre les 10 premières
	        List<Ville> villesTriees = villesDuDepartement.stream()
	                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
	                .limit(10)
	                .collect(Collectors.toList());

	        System.out.println("Les 10 villes les plus peuplées du département de : " + codeDepartement  + " sont :");
	        for (Ville ville : villesTriees) {
	            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale());
	        }

	}

}
