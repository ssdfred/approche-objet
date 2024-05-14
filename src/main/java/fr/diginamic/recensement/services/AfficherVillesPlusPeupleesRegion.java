package fr.diginamic.recensement.services;

import fr.diginamic.recensement.Recensement;
import fr.diginamic.recensement.Ville;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AfficherVillesPlusPeupleesRegion extends MenuService {
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.print("Entrez le nom de la région : ");
        String nomRegion = scanner.nextLine();

        // Filtrer les villes de la région spécifiée
        List<Ville> villesDeLaRegion = recensement.getVilles().stream()
                .filter(ville -> ville.getNomRegion().equalsIgnoreCase(nomRegion))
                .collect(Collectors.toList());

        if (villesDeLaRegion.isEmpty()) {
            System.out.println("Région non trouvée ou sans villes.");
            return;
        }

        // Trier les villes par population décroissante et prendre les 10 premières
        List<Ville> villesTriees = villesDeLaRegion.stream()
                .sorted(Comparator.comparingInt(Ville::getPopulationTotale).reversed())
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("Les 10 villes les plus peuplées de la région " + nomRegion + " sont :");
        for (Ville ville : villesTriees) {
            System.out.println(ville.getNomCommune() + " : " + ville.getPopulationTotale());
        }
    }
}
