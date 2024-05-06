package fr.diginamic.entites;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
// Méthode pour calculer le perimetre du cercle
	
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}
// Méthode pour calculer la surface du cercle
	public double surface() {
		return Math.PI * Math.pow(rayon, 2);
	}
}
