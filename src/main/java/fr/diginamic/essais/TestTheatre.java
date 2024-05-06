package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		//Création d'une instance de theatre avec une capacité maximale dse 100 
		Theatre theatre = new Theatre("Theatre de Paris", 100);
		
		// tentative d'incription de 50 client à 20E par place
		theatre.inscrit(50, 20);
		
		//Tentative d'inscription de 30 clients à 25E la place
		theatre.inscrit(30, 25);
		
		//Tentative d'inscription de 30 clients à 25E la place
		theatre.inscrit(30, 30);
		
		// Affichage du total de clients inscrits
		System.out.println("Total de clients inscrit: " + theatre.getTotalClients());
		
		//Affichage de la recette totale du theatre
		System.out.println("Recette du theatre : " + theatre.getRecetteTotal() + "€");

	}

}
