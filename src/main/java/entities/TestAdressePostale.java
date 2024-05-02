package entities;

public class TestAdressePostale {

	public static void main(String[] args) {
	
		
		AdressePostale a1 = new AdressePostale(); 
		a1.numero = 35;
		a1.libellé = "rue marchant";
		a1.codePostale = 34500;
		a1.ville = "Montpellier";
		AdressePostale a2 = new AdressePostale();
		a2.numero = 10;
		a2.libellé = "rue du bonheur";
		a2.codePostale = 34200;
		a2.ville = "Lille";

	}
	

}
