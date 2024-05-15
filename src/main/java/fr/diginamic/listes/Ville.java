package fr.diginamic.listes;

import java.util.Objects;



/**
 * Cette classe représente une ville
 */
public class Ville {
	
	private String nom;
	private int nbHabitants;
	
	/**
	 * @param nom
	 * @param nbHabitants
	 */
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants =nbHabitants;
	}
	
	
	
    @Override
    public String toString() {
        return "Ville " +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants;
    }
    // nouvelle version
    @Override
    public boolean equals(Object object) {
    	if (object instanceof Ville autre) {
        	
        	return Objects.equals(nom, autre.getNom()) && Objects.equals( this.nbHabitants, autre.getNbHabitants());
    	}
    	
    	return false;
    }
    /*    @Override
    public boolean equals(Object object) {
    	if (object instanceof Ville ) {
        	Object autre = (Ville)autre
        	return Objects.equals(nom, autre.getNom()) && Objects.equals( this.nbHabitants, autre.getNbHabitants());
    	}
    	
    	return false;
    }*/



	/** Getter pour nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/** Setter pour nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/** Getter pour nbHabitants
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}



	/** Setter pour nbHabitants
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}




}
