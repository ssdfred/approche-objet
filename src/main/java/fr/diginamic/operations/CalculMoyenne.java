package fr.diginamic.operations;

public class CalculMoyenne {

	protected double[] valeurs;
	protected int taille;

	public CalculMoyenne() {
		this.valeurs = new double[10];
		this.taille = 0;
	}

	public void ajout(double valeur) {
		// vérification si le tableau à besoin d'etre agrandi
		if (taille == valeurs.length) {
			// agrandissement du tableau
			double[] nouveauTableau = new double[valeurs.length * 2];
			System.arraycopy(valeurs, 0, nouveauTableau, 0, taille);
			valeurs = nouveauTableau;
		}
		// ajout de la valeur au tableau
		valeurs[taille] = valeur;
		taille++;
	}

	public double calcul() {
		if (taille == 0) {
			throw new IllegalStateException("Aucune valeur ajoutée au tableau.");
		}

		double somme = 0;
		for (int i = 0; i < taille; i++) {
			somme += valeurs[i];
		}

		return somme / taille;
	}

	public double[] getValeurs() {
		return valeurs;
	}

	public void setValeurs(double[] valeurs) {
		this.valeurs = valeurs;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
}
