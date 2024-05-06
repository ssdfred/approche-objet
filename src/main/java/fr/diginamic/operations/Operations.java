package fr.diginamic.operations;

public class Operations {

	    // Méthode de classe calcul qui prend en paramètre 2 doubles a et b, et un opérateur de type char
	    public static double calcul(double a, double b, char operateur) {
	        double resultat = 0;
	        if (operateur == '+') {
	            resultat = a + b;
	        } else if (operateur == '-') {
	            resultat = a - b;
	        } else if (operateur == '*') {
	            resultat = a * b;
	        } else if (operateur == '/') {
	            if (b != 0) {
	                resultat = a / b;
	            } else {
	                System.out.println("Erreur: Division par zéro.");
	            }
	        } else {
	            System.out.println("Opérateur non reconnu.");
	        }
	        return resultat;
	    }
}
