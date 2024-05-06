package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
	public static void main(String[] args) {
	String chaine = "Durand;Marcel;2 523.5";
	
    // 1) Afficher le premier caractère de la chaine de caractères
    char premierCaractere = chaine.charAt(0);
    System.out.println("Premier caractère: " + premierCaractere);
    
    // 2) Afficher la longueur de la chaine de caracteres
    int longueur = chaine.length();
    System.out.println("Longueur de la chaine: " + longueur);
    
    //3) Afficher l'index du premier ";" contenue dans la chaine de caracteres
    int indexPointVirgule = chaine.indexOf(';');
    System.out.println("Index du premier ';' : " + indexPointVirgule );
    
    //4) Extraire le nom de famille de la personne 
    String nomDeFamille = chaine.substring(0, indexPointVirgule);
    System.out.println("Nom de famille : " + nomDeFamille);
    
    //5) Afficher le nom en majuscule
    
    String nomMajuscule = nomDeFamille.toUpperCase();
    System.out.println("Nom de famille en majuscule : " + nomMajuscule);
    
    //6) Afficher le nom de famille en minuscule
    String nomMinuscule = nomDeFamille.toLowerCase();
    System.out.println("Nom de famille en minuscules : " + nomMinuscule);
    
    //7) Découper la chaine en morceaux
    String[] morceaux = chaine.split(";");
    
    //Affichage du tableau 
    System.out.println("Morceaux de la chaine : ");
    for (String morceau : morceaux) {
    	System.out.println(morceau);
    }
 // Suppression de l'espace dans le nombre
    String salaire = morceaux[2].replace(" ", "");

    // Conversion de la chaîne en double
    double salaireDouble = Double.parseDouble(salaire);

    // Création d'une instance de Salarie
    Salarie salarie = new Salarie(morceaux[0], morceaux[1], salaireDouble);

    // Affichage des informations du salarié
    System.out.println("Salarié:");
    System.out.println("Nom: " + salarie.getNom());
    System.out.println("Prénom: " + salarie.getPrenom());
    System.out.println("Salaire: " + salarie.getSalaire());
    
	}
}
