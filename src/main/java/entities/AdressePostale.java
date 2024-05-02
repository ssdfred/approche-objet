package entities;

public class AdressePostale {
	public int numero;
	public String libellé;
	public int codePostale;
	public String ville;
	
	// TODO Constructeur ici :
	
	public AdressePostale(int numero, String libellé, int codePostale, String ville) {
		this.numero = numero;
		this.libellé = libellé;
		this.codePostale = codePostale;
		this.ville = ville;
		
		}
	}
