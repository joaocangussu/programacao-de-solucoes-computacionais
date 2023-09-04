package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double userPeso, pesoEngordar, pesoEmagrecer;

		System.out.println("Informe o seu peso:");
		userPeso = input.nextDouble();
		


		pesoEngordar = (userPeso * 1.15);
		pesoEmagrecer = (userPeso * 0.8);
		
		System.out.printf("Se voce engordar 15 porcento, estara com %.1f kilos. \n", pesoEngordar);

		System.out.printf("Se voce emagrecer 20 porcento, estara com %.1f kilos.", pesoEmagrecer);
	}
}
