package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

import fr.diginamic.recensement.services.AfficherDepartementsPlusPeuples;
import fr.diginamic.recensement.services.AfficherRegionsPlusPeuplees;
import fr.diginamic.recensement.services.AfficherVillesPlusPeupleesDepartement;
import fr.diginamic.recensement.services.AfficherVillesPlusPeupleesFrance;
import fr.diginamic.recensement.services.AfficherVillesPlusPeupleesRegion;
import fr.diginamic.recensement.services.MenuService;
import fr.diginamic.recensement.services.RecherchePopulationDepartement;
import fr.diginamic.recensement.services.RecherchePopulationRegion;
import fr.diginamic.recensement.services.RecherchePopulationVille;

public class ApplicationRecensement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cheminCsv = "E:/CDA Curs/java/recensement.csv";
		
        // Afficher les deux premières lignes pour vérifier les clés et valeurs
        System.out.println("Affichage des deux premières lignes du fichier CSV :");
        CsvReader.afficherPremieresLignes(cheminCsv, 2);
		Recensement recensement = chargerRecensement(cheminCsv);
		
		int choix = 0;
		
		do {
			System.out.println("Menu");
			System.out.println("1. Population d'une ville");
			System.out.println("2. Population d'un departement");
			System.out.println("3. Population d'une régions");
			System.out.println("4. Affiché les 10 régions les plus peuplées");
			System.out.println("5. Afficher les 10 départements les plus peuplés");
			System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            
            MenuService service = null;
            switch (choix) {
            case 1:
            	service = new RecherchePopulationVille();
            	break;
            case 2:
                service = new RecherchePopulationDepartement();
                break;
            case 3:
                service = new RecherchePopulationRegion();
                break;
            case 4:
                service = new AfficherRegionsPlusPeuplees();
                break;
            case 5:
                service = new AfficherDepartementsPlusPeuples();
                break;
            case 6:
                service = new AfficherVillesPlusPeupleesDepartement();
                break;
            case 7:
                service = new AfficherVillesPlusPeupleesRegion();
                break;
            case 8:
                service = new AfficherVillesPlusPeupleesFrance();
                break;
            case 9:
                System.out.println("Au revoir !");
                break;
            default:
            	System.out.println("Choix non valide, veuillez réessayer.");
            }
            
            if (service != null) {
            	service.traiter(recensement, scanner);
            }
            
		} while (choix != 9);
		scanner.close();

	}
	
	private static Recensement chargerRecensement(String cheminCsv) {

		List<Ville> villes = CsvReader.lireFichier(cheminCsv);
		return new Recensement(villes);
	}
}
