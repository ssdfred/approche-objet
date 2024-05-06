package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class AffichageForme {

	public static void main(String[] args) {
		
		Cercle cercle = new Cercle(5);
		Rectangle rectangle= new Rectangle(4,6);
		Carre carre = new Carre(4);
		
        System.out.println("Surface du cercle: " + cercle.calculSurface());
        System.out.println("Périmètre du cercle: " + cercle.caculPerimetre());
        System.out.println("Surface du rectangle: " + rectangle.calculSurface());
        System.out.println("Périmètre du rectangle: " + rectangle.caculPerimetre());
        System.out.println("Surface du carre : " + carre.calculSurface() + "cm²");
        System.out.println("Perimetre du carre : " + carre.caculPerimetre());

	}

}
