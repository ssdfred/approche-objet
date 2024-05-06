package fr.diginamic.entites;

public class Theatre {
	protected String nom;
	protected int capaciteMax;
	protected int totalClients;
	protected double recetteTotal;
	
	public Theatre(String nom, int capaciteMax) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClients = 0;
		this.recetteTotal = 0.0;
	}
	
	public void inscrit(int nombreClients, double prixPlace) {
		if (totalClients + nombreClients <= capaciteMax) {
			totalClients += nombreClients;
			recetteTotal += nombreClients * prixPlace;
			System.out.println("Inscription reussi.");
		} else {
			System.out.println("Erreur; la capacité maximale du théatre est atteinte.");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalClients() {
		return totalClients;
	}

	public double getRecetteTotal() {
		return recetteTotal;
	}
}
