package fr.diginamic.listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//stocker tous les nombres de 1 à 100
		for(int i = 1; i <= 100; i++) {
			list.add(i);
		}
		System.out.println("la taille de la liste est : " + list.size());
	}

}
