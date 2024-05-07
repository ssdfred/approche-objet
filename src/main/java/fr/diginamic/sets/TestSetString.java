package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		// Ajout des éléments à la collection
		
		set.add("USA");
		set.add("France");
		set.add("Allemagne");
		set.add("UK");
		set.add("Italie");
		set.add("Japon");
		set.add("Chine");
		set.add("Inde");
		
		// Affichage de tous les éléments de la collection
		
		System.out.println("le contenu est : " + set);

// Initialisation d'une variable pour stocker le nom du pays avec le plus grand nombre de lettres
String paysMax = "";

// Initialisation d'une variable pour stocker la longueur maximale trouvée jusqu'à présent
int max = 0;

// Parcours de tous les pays dans le set
for (String pays : set) {
    // Vérification si la longueur du nom du pays actuel est supérieure à la longueur maximale trouvée jusqu'à présent
    if (pays.length() > max) {
        // Si c'est le cas, mise à jour de la longueur maximale
        max = pays.length();
        
        // Mise à jour du nom du pays avec le plus grand nombre de lettres
        paysMax = pays;
    }
}

// À la fin de la boucle, 'paysMax' contient le nom du pays avec le plus grand nombre de lettres
// et 'max' contient la longueur de ce nom.
		System.out.println("Le pays avec le plus grand nombre de lettres est : " + paysMax);
		set.remove(paysMax);
		System.out.println("La liste des pays modifiée" + set);

	}

}
