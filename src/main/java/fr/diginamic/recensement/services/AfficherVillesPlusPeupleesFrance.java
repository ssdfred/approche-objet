package fr.diginamic.recensement.services;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

public class AfficherVillesPlusPeupleesFrance extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        // Trier les villes par population décroissante et prendre les 10 premières
        List<Ville> villesTriees = recensement.getVilles().stream()
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées de France sont :");
        for (Ville ville : villesTriees) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale());
        }
    }
}
