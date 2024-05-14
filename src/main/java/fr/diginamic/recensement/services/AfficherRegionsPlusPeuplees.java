package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AfficherRegionsPlusPeuplees extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        Map<String, Integer> populationsParRegion = new HashMap<>();

        List<Ville> villes = recensement.getVilles();
        for (Ville ville : villes) {
            populationsParRegion.merge(ville.getNomRegion(), ville.getPopulationTotale(), Integer::sum);
        }

        List<Map.Entry<String, Integer>> regionsTriees = populationsParRegion.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 régions les plus peuplées sont :");
        for (Map.Entry<String, Integer> entry : regionsTriees) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
