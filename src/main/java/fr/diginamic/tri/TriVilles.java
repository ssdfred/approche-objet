package fr.diginamic.tri;
import java.util.ArrayList;
import java.util.Collections;


public class TriVilles {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Bretagne", "56", "Rennes", 350000));
        villes.add(new Ville("Auvergne-Rhône-Alpes", "38", "Grenoble", 160000));
        villes.add(new Ville("Provence-Alpes-Côte d'Azur", "06", "Nice", 650000));


        Collections.sort(villes, new ComparatorHabitant());
			


        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}