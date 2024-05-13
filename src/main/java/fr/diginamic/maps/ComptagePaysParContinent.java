package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// Création des pays
		Pays pays1 = new Pays("France", 65_060_000, "Europe");
		Pays pays2 = new Pays("Allemagne", 80_940_000, "Europe");
		Pays pays3 = new Pays("Belgique", 11_460_000, "Europe");
		Pays pays4 = new Pays("Russie", 143_964_709, "Asie");
		Pays pays5 = new Pays("Chine", 1_386_000_000, "Asie");
		Pays pays6 = new Pays("Indonésie", 237_641_326, "Océanie");
		Pays pays7 = new Pays("Australie", 24_309_330, "Océanie");
		
		//Création de la liste des pays
		ArrayList<Pays> listePays = new ArrayList<>();
		listePays.add(pays1);
		listePays.add(pays2);
		listePays.add(pays3);
		listePays.add(pays4);
		listePays.add(pays5);
		listePays.add(pays6);
		listePays.add(pays7);

		    // Comptage du nombre de pays par continent
		HashMap<String, Integer> map = new HashMap<>();
		for (Pays pays : listePays) {
			String continent = pays.getContinent();
			map.put(continent, map.getOrDefault(continent, 0) +1);
			
	}
		//Affichage des résultats
		System.out.println("Nombre de pays par continent :");
		for (String continent : map.keySet()) {
			int nbPays = map.get(continent);
			System.out.println(continent + " : " +nbPays);
		}
	}

}
