package fr.diginamic.maps;

import java.util.HashMap;


public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Integer> villes = new HashMap<>();
		villes.put("Nice", 343000);
		villes.put("Carcassonne", 47800);
		villes.put("Narbonne", 53400);
		villes.put("Lyon", 484000);
		villes.put("Foix", 9700);
		villes.put("Pau", 77200);
		villes.put("Marseille", 850700);
		villes.put("Tarbes", 40600);
		
		//Recherchez et supprimez la ville qui a le moins d’habitants.
		for (String key : villes.keySet()) {
			if (villes.get(key) < 10000) {
				System.out.println("La ville qui a le moins d'habitants est " + key + " avec " + villes.get(key) + " habitants.");
				villes.remove(key);

			}
		}
		System.out.println(villes);
	}

}
