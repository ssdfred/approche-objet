package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		long debut = System.currentTimeMillis();

		StringBuilder nb1 = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			nb1.append(i);

		}
		nb1.toString();
		long fin = System.currentTimeMillis();
		System.out.println("Temp ecoulé : " + (fin - debut) + "ms");

		long debuts = System.currentTimeMillis();

		String nb2 = "";
		for (int i = 0; i < 100000; i++) {
			nb2 += (i);

		}
		long fins = System.currentTimeMillis();
		System.out.println("Temp ecoulé : " + (fins - debuts) + "ms");
	}

}
