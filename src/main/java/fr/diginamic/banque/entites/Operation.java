package fr.diginamic.banque.entites;
import java.util.Date;

public abstract class Operation {
	protected Date dateOperation;
	protected double montant;
	
	public Operation(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	
	public abstract String getType();
	@Override
	public String toString() {
		return "dateOperation=" + dateOperation + ", montant=" + montant + "type="+getType();
	}


	public Date getDateOperation() {
		return dateOperation;
	}


	public double getMontant() {
		return montant;
	}
	

	
}
