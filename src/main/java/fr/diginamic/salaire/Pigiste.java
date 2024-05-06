package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	private int joursTravaille;
	private double montantJournalier;
	
	public Pigiste(String nom, String prenom, int joursTraville, double montantJournalier) {
		super(nom, prenom);
		this.joursTravaille = joursTraville;
		this.montantJournalier = montantJournalier;
	}



	@Override
	public double getSalaire() {

		return joursTravaille * montantJournalier;
	}
    @Override
    public String getStatut() {
        return "Pigiste";
    }
}