package fr.diginamic.maison;

public abstract class Piece {
	protected double superficie;
	protected int etage;
	protected double longueur;
	protected double largeur;

	public Piece(double longueur, double largeur, int etage) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.etage = etage;
		// La superficie est calculée par la méthode abstraite dans chaque sous-classe
		this.superficie = longueur * largeur;
	}

	public double getSuperficie() {
		return superficie;
	}

	public int getEtage() {
		return etage;
	}

}
