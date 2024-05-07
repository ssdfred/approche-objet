package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVilles {

	public static void main(String[] args) {

		ArrayList<Ville> villes = new ArrayList<>(
				Arrays.asList(new Ville("Nice", 343000), new Ville("Carcassonne", 47800), new Ville("Narbonne", 53400),
						new Ville("Lyon", 484000), new Ville("Foix", 9700), new Ville("Pau", 77200),
						new Ville("Marseille", 850700), new Ville("Tarbes", 40600)));

		System.out.println(villes);
		System.out.println("--------------");
		// Recherche et affichage de la ville la plus peuplée

		Ville villePlusPeuplee = villes.get(0);
		for (Ville ville : villes) {
			if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
				villePlusPeuplee = ville;
			}
		}
		System.out.println("La ville la plus peuplée est : " + villePlusPeuplee);

		// REcherche la ville la moins peuplée
		Ville villeMonsPeuplee = villes.get(0);
		for (Ville ville : villes) {
			if (ville.getNbHabitants() < villeMonsPeuplee.getNbHabitants()) {
				villeMonsPeuplee = ville;
			}

		}
		System.out.println("LA ville la moins peuplée est : " + villeMonsPeuplee);
		// Supression de la ville la moins peuplée

		villes.remove(villeMonsPeuplee);
		System.out.println("La liste restante est : " + villes);

	}

}
