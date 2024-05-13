package fr.diginamic.tri;

public class Ville  {

	private String nomRegion;
	private String codeDept;
	private String nom;
	private int pop;
	public Ville(String nomRegion, String codeDept, String nom, int pop) {
		super();
		this.nomRegion = nomRegion;
		this.codeDept = codeDept;
		this.nom = nom;
		this.pop = pop;
	}

	@Override
	public String toString() {
		return "Ville [nomRegion=" + nomRegion + ", codeDept=" + codeDept + ", nom=" + nom + ", pop=" + pop + "]";
	}

	public String toCsv() {
		return nomRegion+";"+codeDept+";"+nom+";"+pop;
	}
	
	//Methode implementant comprable<ville>
/*	@Override
    public int compareTo(Ville autre) {
        return this.nomRegion.compareTo(autre.getNomRegion());
    }*/
	
	/*public int compareTo(Ville autre) {
		if (this.pop > autre.getPop()){
			return 1;
		}
		if (this.pop > autre.getPop()){
			return -1;
		}
		return 0;
	}
		*/
	public String getNom() {
		return nom;
	}
	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public String getCodeDept() {
		return codeDept;
	}

	public void setCodeDept(String codeDept) {
		this.codeDept = codeDept;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}

}