package exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double cateto1, cateto2, hip;

		System.out.println("Informe o valor do primeiro cateto:");
		cateto1 = input.nextDouble();

		System.out.println("Informe o valor do segundo cateto:");
		cateto2 = input.nextDouble();

		hip = (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		System.out.printf("A hipotenusa vale %.1f.", Math.sqrt(hip));
	}
}
