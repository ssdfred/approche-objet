package entities2;

import entities.AdressePostale;

public class Personne {

	//Variables d'instance
	public String nom;
	public String prénom;
	public AdressePostale adresse;
	

	public Personne (String nom, String prénom) {
	this.nom = nom;
	this.prénom = prénom;
	
	}
	public Personne (String nom, String prénom, AdressePostale adresse) {
		this.nom = nom;
		this.prénom = prénom;
		this.adresse = adresse;
	}
	public void afficher() {
		System.out.println("BLUNK Fred");
	}
	public void modifier(String nom) {
		nom = this.nom;
	}
	public void modifierPrenom(String prenom) {
		prenom = this.prénom;
	}
	public void modifierAdresse(AdressePostale adresse) {
		adresse = this.adresse;
	}
	public String aficherNom() {
		return nom;
	}
	public String aficherPrenom() {
		return prénom;
	}
	public AdressePostale aficherAdresse() {
		return adresse;
	}
	
	}
