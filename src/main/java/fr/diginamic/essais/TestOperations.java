package fr.diginamic.essais;

import fr.diginamic.operations.Operations;


public class TestOperations {

	public static void main(String[] args) {
        System.out.println("Testing addition...");
        double resultAddition = Operations.calcul(5.0, 3.0, '+');
        if (resultAddition == 8.0) {
            System.out.println("Addition test passed.Resultat : " + resultAddition);
        } else {
            System.out.println("Addition test failed.Resultat :" + resultAddition);
        }

        System.out.println("Testing subtraction...");
        double resultSubtraction = Operations.calcul(5.0, 3.0, '-');
        if (resultSubtraction == 2.0) {
            System.out.println("Subtraction test passed.Resultat " + resultSubtraction);
        } else {
            System.out.println("Subtraction test failed.");
        }

        System.out.println("Testing multiplication...");
        double resultMultiplication = Operations.calcul(5.0, 3.0, '*');
        if (resultMultiplication == 15.0) {
            System.out.println("Multiplication test passed.Resultat : " +resultMultiplication);
        } else {
            System.out.println("Multiplication test failed.");
        }

        System.out.println("Testing division...");
        double resultDivision = Operations.calcul(10.0, 2.0, '/');
        if (resultDivision == 5.0) {
            System.out.println("Division test passed.Resultat : " + resultDivision);
        } else {
            System.out.println("Division test failed.");
        }
    }
}
