package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FusionListe {
	
	public static void main(String args[]) {
		
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		// Creation d'un liste 3 qui contient la liste 1 et 2
		
		List<String> liste3 = new ArrayList<String>();
		
		//utilisation d'une boucle pour ajouter les éléments de la liste 1 et 2 
		
		for (String element : liste1) {
			liste3.add(element);
		}
		for (String element : liste2) {
			liste3.add(element);
		}
		System.out.println("Contenue de la liste 3 : " +liste3);
	}
}
