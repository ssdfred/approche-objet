package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		//Test calcul de la moyenne de valeur simples
		CalculMoyenne calculMoyenne1 = new CalculMoyenne();
		calculMoyenne1.ajout(5.0);
		calculMoyenne1.ajout(10.0);
		calculMoyenne1.ajout(15.0);
		double moyenne1 = calculMoyenne1.calcul();
		System.out.println("Moyenne de's valeurs simple: " + moyenne1);
		
		//test 2 Cacul de la moyenne de valeurs plus complexes
		
		CalculMoyenne calculMoyenne2 = new CalculMoyenne();
		calculMoyenne2.ajout(1.0);
		calculMoyenne2.ajout(1.5);
		calculMoyenne2.ajout(2.0);
		calculMoyenne2.ajout(3.0);
		calculMoyenne2.ajout(8.0);
		double moyenne2 = calculMoyenne2.calcul();
		System.out.println("Moyenne plus complexe : " + moyenne2);
				
	}

}
