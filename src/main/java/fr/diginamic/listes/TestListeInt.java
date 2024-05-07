package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestListeInt {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		
		System.out.println("Affiche la liste : " + list);
		System.out.println("la taille de la liste est : " + list.size());
		System.out.println("Le plus grand nombre de la liste est : " + Collections.max(list));
		Iterator<Integer> iter = list.iterator();
		Integer minElement = null;
		while (iter.hasNext()) {
			Integer currentElement = iter.next();
			if (minElement == null || currentElement < minElement) {
				minElement = currentElement;
			}
		}
		iter = list.iterator();
		while (iter.hasNext()) {
			if (iter.next().equals(minElement)) {
				iter.remove();
			}
			
		}
		System.out.println("--------------");

		System.out.println("supression du plus petit element" + list);

		
        // Utilisation d'un ListIterator pour rechercher et modifier les éléments négatifs
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer currentElement = listIterator.next();
            if (currentElement < 0) {
                // Modification de l'élément négatif pour qu'il devienne positif
                listIterator.set(Math.abs(currentElement));
            }
        }
		// Affichage des éléments de la liste après modification
        System.out.println("Contenu de la liste après modification des éléments négatifs : " + list);
	}

}
