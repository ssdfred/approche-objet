package fr.diginamic.banque.entites;

public class Compte {

	protected String numero; 
	protected double solde;
	
	public Compte(String numero, double solde) { 
		this.numero = numero;
	    this.solde = solde;
	    }
	  @Override
	  
	  public String toString() {
		return "Compte{" +
				"numero=" + numero +
				", solde=" + solde +
				'}';
	  }
	  


	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	}


