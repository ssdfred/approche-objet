package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		
		String chaine = formateur.format(date);
		System.out.println(chaine);
		
		SimpleDateFormat formateur1 = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = new Date();
		String chaine1 = formateur1.format(date1);
		System.out.println(chaine);
		
		SimpleDateFormat formateur2 =new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
		Date date2 = new Date(116, 04, 19, 23, 59, 30);
		String chaine2 = formateur2.format(date2);
		System.out.println(chaine2);
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
		Date date3 = new Date();
		String chaine3 = formateur3.format(date3);
		System.out.println(chaine3);
	}

}
