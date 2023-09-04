package exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double raio, comprimento, area, volume;

		System.out.println("Informe o valor do raio:");
		raio = input.nextDouble();

		comprimento = (2 * Math.PI * raio);

		area = (Math.PI * Math.pow(raio, 2));

		volume = (0.75 * Math.PI * Math.pow(raio, 3));

		System.out.printf("(-) Comprimento da esfera: %.1f. \n", comprimento);
		System.out.printf("(-) Area da esfera: %.1f. \n", area);
		System.out.printf("(-) Volume da esfera: %.1f.", volume);
	}
}
