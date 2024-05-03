package entities2;

import entities.AdressePostale;

public class Personne {

	//Variables d'instance
	public String nom;
	public String prénom;
	public AdressePostale adresse;
	

	public String getNom() {
		return nom;
	}
	public String getPrénom() {
		return prénom;
	}
	public void setPrénom(String prénom) {
		this.prénom = prénom;
	}
	public AdressePostale getAdresse() {
		return adresse;
	}
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
		System.out.println("je m'appelle " +nom.toLowerCase() + " " + prénom);
	}
	public void setNom(String nom) {
		this.nom = nom;
		
	}
	public void setPrenom(String prénom) {
		prénom = this.prénom;
		
	}
	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
		
	}
	public String aficherNom(String non) {
		return nom;
	}
	public String getPrenom(String prénom) {
		return prénom;
	}
	public  AdressePostale aficherAdresse() {
		return adresse;
		
	}
	
	}
