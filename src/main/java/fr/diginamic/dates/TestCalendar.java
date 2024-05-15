package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		


		Date date = cal.getTime();
		System.out.println(formateur.format(date));

		SimpleDateFormat formateur2 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);

		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);

		SimpleDateFormat formateurGER = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMM yyyy, HH:mm:ss", new Locale("ru", "RU"));
		
		System.out.println(formateur3.format(new Date()));	
		System.out.println(formateur2.format(new Date()));
		System.out.println(formateur4.format(new Date()));
		System.out.println(formateurGER.format(new Date()));

	}

}
