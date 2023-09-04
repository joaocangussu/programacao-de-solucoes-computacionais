package exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salarioMinimo, salarioUser, ans;

		System.out.println("Informe o salario minimo:");
		salarioMinimo = input.nextDouble();

		System.out.println("Informe seu salario:");
		salarioUser = input.nextDouble();

		ans = (salarioUser / salarioMinimo);

		System.out.printf("Voce recebe %.1f salarios minimos.", ans);
	}
}
