package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));
		
		System.out.println(list);
		System.out.println("-----------");
		
		String villePlusLongue = "";
		for (String ville : list) {
			if (ville.length() > villePlusLongue.length()) {
				villePlusLongue = ville;
			}
		}
		System.out.println("La ville avec le plus grand nombre de lettres est : " + villePlusLongue);
		
		// Modification du contenu de la liste pour mettre tous les noms de villes en majuscules
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }

        // Suppression des villes dont le nom commence par la lettre "N"
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String ville = iterator.next();
            if (ville.startsWith("N")) {
                iterator.remove();
            }
        }

        // Affichage de la liste résultante
        System.out.println("La liste résultante est : " + list);
	}

}
