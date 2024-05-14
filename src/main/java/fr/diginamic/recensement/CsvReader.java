package fr.diginamic.recensement;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;

public class CsvReader {

    public static void afficherPremieresLignes(String chemin, int nombreLignes) {
        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            String ligne;
            int count = 0;
            while ((ligne = br.readLine()) != null && count < nombreLignes) {
                System.out.println(ligne);
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Ville> lireFichier(String chemin) {
        List<Ville> villes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(chemin))) {
            String ligne;
            br.readLine(); // Ignorer l'en-tête
            while ((ligne = br.readLine()) != null) {
                String[] valeurs = ligne.split(";");
                if (valeurs.length >= 10) { // Vérifie qu'il y a suffisamment de colonnes
                    String codeRegion = valeurs[0];
                    String nomRegion = valeurs[1];
                    String codeDepartement = valeurs[2];
                    String codeCommune = valeurs[5];
                    String nomCommune = valeurs[6];
                    int populationTotale = Integer.parseInt(valeurs[9].replaceAll("\\s+", ""));
                    Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, populationTotale);
                    villes.add(ville);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villes;
    }
}
