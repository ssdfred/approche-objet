package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		
			/*• Creez une classe exécutable appelée CreationMap :
o Créez une map nommée mapSalaires et qui permet de stocker les informations
de salaire (valeur) en fonction du prénom de la personne (clé).
o Une fois la map créée, affichez sa taille */

		HashMap<String , Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		System.out.println("Taille de la map : " + mapSalaires.size());

	}

}
