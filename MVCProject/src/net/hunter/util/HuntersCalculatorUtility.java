package net.hunter.util;

public class HuntersCalculatorUtility {

	public static int sumIntegers(String epic) {
		String[] epicArray = epic.split(",");
		int product = 0;
		for (int i = 0; i < epicArray.length; i++) {
			int num = Integer.parseInt(epicArray[i]);
			product = num + product;
		}
		return product;
	}

	public static int multiplyIntegers(String epic) {
		String[] epicArray = epic.split(",");
		int product = 1;
		for (int i = 0; i < epicArray.length; i++) {
			int num = Integer.parseInt(epicArray[i]);
			product = num * product;
		}
		return product;
	}

	public static double[] solveQuadratic(double valueA, double valueB, double valueC) {

		double zero1 = (-1 * valueB + Math.sqrt(Math.pow(valueB, 2) - (4 * valueA * valueC)))
				/ (2 * valueA);
		double zero2 = (-1 * valueB - Math.sqrt(Math.pow(valueB, 2) - (4 * valueA * valueC))) 
				/ (2 * valueA);
		double[] answers = { zero1, zero2 };

		return answers;
	}
}
