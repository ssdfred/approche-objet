package fr.diginamic.banque.entites;
import java.util.Date;

public abstract class Operation {
	protected Date dateOperation;
	protected double montant;
	
	public Operation(Date dateOperation, double montant) {
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	

	public Date getDateOperation() {
		return dateOperation;
	}


	public double getMontant() {
		return montant;
	}
	

	public abstract String getType();
	


}
