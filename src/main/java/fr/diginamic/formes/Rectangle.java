package fr.diginamic.formes;

public class Rectangle extends Formes {
	
	private double largeur;
	private double hauteur;
	
	public Rectangle(double largeur, double hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	@Override
	public double calculSurface() {
		return largeur * hauteur;
	}

	@Override
	public double caculPerimetre() {
		return 2 * (largeur + hauteur);
	}

}
