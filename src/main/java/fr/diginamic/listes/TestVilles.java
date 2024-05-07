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

		// Affichage de la ville la plus peuplée avec un boucle indexée
		Ville villePlusPeupleeIndexee = villes.get(0);// j'iniatialise ma variable avec la première ville
		for (int i = 1; i < villes.size(); i++) { // j'itère sur les villes
			if (villes.get(i).getNbHabitants() > villePlusPeupleeIndexee.getNbHabitants()) {
				// si la ville actuelle est plus peuplee que la precedente on l'initialise
				villePlusPeupleeIndexee = villes.get(i);
			}
			// sinon on ne fait rien 
		}
		System.out.println("La ville la plus peuplée est : " + villePlusPeupleeIndexee);
		
		System.out.println("--------------");
		// Recherche et affichage de la ville la plus peuplée

		Ville villePlusPeuplee = villes.get(0);
		for (Ville ville : villes) {
			if (ville.getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
				villePlusPeuplee = ville;
			}
			if (ville.getNbHabitants()>=100000) {
				String nom = villePlusPeuplee.getNom();
				villePlusPeuplee.setNom(nom.toUpperCase());
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
