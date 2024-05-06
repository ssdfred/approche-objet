package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.WC;

public class TestMaison {
    public static void main(String[] args) {
        // Création d'une instance de Maison
        Maison maison = new Maison();

        // Ajout de différentes pièces à la maison
        maison.ajouterPiece(new Chambre(3.2, 2.7, 0)); // Chambre de 3.2m par 2.7m au RDC
        maison.ajouterPiece(new Cuisine(1.5, 1.75, 0)); // Cuisine de 1.5m par 1.75m au RDC
        maison.ajouterPiece(new Salon(6, 3, 1)); // Salon de 6m par 3m au 1er étage
        maison.ajouterPiece(new SalleDeBain(3.5, 2.5, 1)); // Salle de bain de 3.5m par 2.5m au 1er étage
        maison.ajouterPiece(new WC(2, 1.3, 1)); // WC de 2m par 1.3m au 1er étage

        // Affichage de la superficie totale de la maison
        System.out.println("Superficie totale de la maison: " + maison.superficieTotale());

        // Affichage de la superficie de l'étage 0
        System.out.println("Superficie de l'étage 0: " + maison.superficieEtage(0));

        // Affichage de la superficie de l'étage 1
        System.out.println("Superficie de l'étage 1: " + maison.superficieEtage(1));

        // Test de la méthode ajouterPiece avec une pièce null (doit lancer une exception)
        try {
            maison.ajouterPiece(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur attendue: " + e.getMessage());
        }

        // Test de la méthode ajouterPiece avec une pièce ayant une superficie ou un étage négatif (doit lancer une exception)
        try {
            maison.ajouterPiece(new Chambre(-10, 10, 0)); // Superficie négative
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur attendue: " + e.getMessage());
        }

        try {
            maison.ajouterPiece(new Chambre(10, 10, -1)); // Étage négatif
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur attendue: " + e.getMessage());
        }
        // Calcul de la superficie totale des chambres
        double superficieChambres = maison.superficieTotalePieceType("Chambre");
        System.out.println("Superficie totale des chambres: " + superficieChambres);

        // Calcul du nombre de chambres
        int nombreChambres = maison.nombrePiecesType("Chambre");
        System.out.println("Nombre de chambres: " + nombreChambres);
    }
}