package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
public class TestCercle {


	public static void main(String[] args) {
		//Création du premier cercle avec un rayon de 5.0
		Cercle cercle1 = new Cercle(5.0);
		//affichage du perimetre et de la surface du cercle
		
		System.out.println("périmetre du cercle 1 :" + cercle1.perimetre());
		System.out.println("surface du cercle 1 :" + cercle1.surface());
		
		//Création du cercle2 avec un rayon de 10.0
		Cercle cercle2 =new Cercle(10.0);
		//Affichage du deuxieme cercle avec un rayon de 10.0
		System.out.println("Périmetre du cercle 2 : " + cercle2.perimetre());
		System.out.println("surface du cercle 2 : " + cercle2.surface());
	}

}
