package fr.diginamic.recensement.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class AfficherDepartementsPlusPeuples extends MenuService {

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> populationsParDepartement = new HashMap<>();

        List<Ville> villes = recensement.getVilles();
        for (Ville ville : villes) {
            populationsParDepartement.merge(ville.getCodeDepartement(), ville.getPopulationTotale(), Integer::sum);
        }

        List<Map.Entry<String, Integer>> departementTriees = populationsParDepartement.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 départements les plus peuplées sont :");
        for (Map.Entry<String, Integer> entry : departementTriees) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

	}

}
