package fr.diginamic.sets;

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

    public static void main(String[] args) {

        // Création d'un HashSet de Double
        Set<Double> set = new HashSet<>();

        // Ajout des éléments à la collection
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);

        // Affichage de tous les éléments de la collection
        System.out.println("Contenu initial de la collection : " + set);

        // Recherche du plus grand élément de la collection
        // Utilisation de stream() pour créer un flux à partir de la collection
        // Utilisation de max() pour trouver le plus grand élément
        // Utilisation de orElse(null) pour gérer le cas où la collection pourrait être vide
        Double maxElement = set.stream().max(Double::compare).orElse(null);
        System.out.println("Le plus grand élément est : " + maxElement);

        // Suppression du plus petit élément de la collection
        // Utilisation de stream() pour créer un flux à partir de la collection
        // Utilisation de min() pour trouver le plus petit élément
        // Utilisation de orElse(null) pour gérer le cas où la collection pourrait être vide
        // Utilisation de remove() pour supprimer l'élément trouvé de la collection
        Double minElement = set.stream().min(Double::compare).orElse(null);
        System.out.println("Le plus petit nombre est : " + minElement);
        set.remove(minElement);

        // Affichage du contenu de la collection modifiée
        System.out.println("Contenu de la collection après suppression du plus petit élément : " + set);
    }
}