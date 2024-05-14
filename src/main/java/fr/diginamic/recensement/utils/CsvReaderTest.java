package fr.diginamic.recensement.utils;

import java.util.List;

import fr.diginamic.recensement.CsvReader;
import fr.diginamic.recensement.Ville;

public class CsvReaderTest {

    public static void main(String[] args) {
        testLireFichier();
    }

    public static void testLireFichier() {
        // Chemin vers le fichier CSV réel
        String chemin = "E:/CDA Curs/java/recensement.csv";
        
        // Appeler la méthode à tester
        List<Ville> villes = CsvReader.lireFichier(chemin);
        
        // Vérifier que la liste des villes n'est pas nulle
        if (villes != null) {
            System.out.println("Test Passed: La liste des villes n'est pas nulle.");
        } else {
            System.out.println("Test Failed: La liste des villes est nulle.");
            return;
        }
        
        // Vérifier qu'elle contient des éléments
        if (villes.size() > 0) {
            System.out.println("Test Passed: La liste des villes contient des éléments.");
        } else {
            System.out.println("Test Failed: La liste des villes est vide.");
            return;
        }

        // Vérifier les valeurs de la première ville
        Ville ville1 = villes.get(0);
        System.out.println("Code Région: " + ville1.getCodeRegion());
        System.out.println("Nom Région: " + ville1.getNomRegion());
        System.out.println("Code Département: " + ville1.getCodeDepartement());
        System.out.println("Code Commune: " + ville1.getCodeCommune());
        System.out.println("Nom Commune: " + ville1.getNomCommune());
        System.out.println("Population Totale: " + ville1.getPopulationTotale());

        // Ajouter des vérifications simples pour les valeurs spécifiques
        if ("84".equals(ville1.getCodeRegion())) {
            System.out.println("Test Passed: Code Région correct.");
        } else {
            System.out.println("Test Failed: Code Région incorrect.");
        }

        if ("Auvergne-Rhône-Alpes".equals(ville1.getNomRegion())) {
            System.out.println("Test Passed: Nom Région correct.");
        } else {
            System.out.println("Test Failed: Nom Région incorrect.");
        }

        if ("01".equals(ville1.getCodeDepartement())) {
            System.out.println("Test Passed: Code Département correct.");
        } else {
            System.out.println("Test Failed: Code Département incorrect.");
        }

        if ("001".equals(ville1.getCodeCommune())) {
            System.out.println("Test Passed: Code Commune correct.");
        } else {
            System.out.println("Test Failed: Code Commune incorrect.");
        }

        if ("L' Abergement-Clémenciat".equals(ville1.getNomCommune())) {
            System.out.println("Test Passed: Nom Commune correct.");
        } else {
            System.out.println("Test Failed: Nom Commune incorrect.");
        }

        if (785 == ville1.getPopulationTotale()) {
            System.out.println("Test Passed: Population Totale correcte.");
        } else {
            System.out.println("Test Failed: Population Totale incorrecte.");
        }

    }
}
