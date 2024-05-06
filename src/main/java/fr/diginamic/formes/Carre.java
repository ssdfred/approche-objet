package fr.diginamic.formes;

	
public class Carre extends Formes {

	protected double longueur;
	
	public Carre(double longueur) {
		this.longueur = longueur;
	}
	@Override
	public double calculSurface() {

		return longueur * longueur ;
	}

	@Override
	public double caculPerimetre() {

		return 4 * longueur;
	}

}
