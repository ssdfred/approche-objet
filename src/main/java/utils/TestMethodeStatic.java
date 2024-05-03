package utils;


public class TestMethodeStatic {

	public static void main(String[] args) {
	
		String chaine = "12";
		
		int resultat = Integer.parseInt(chaine);
		System.out.println(resultat);
		
		int a =12;
		int b =5;
		
		int max = Integer.max(a, b);
		System.out.println("Le nombre maximum entre " + a + " et " + b + " est : " + max);
	
	}
}
