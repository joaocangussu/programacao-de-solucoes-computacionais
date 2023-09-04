package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota1, nota2, nota3, ans;

		System.out.println("Informe a primeira nota:");
		nota1 = input.nextDouble();

		System.out.println("Informe a segunda nota:");
		nota2 = input.nextDouble();

		System.out.println("Informe a terceira nota:");
		nota3 = input.nextDouble();

		ans = (nota1 + nota2 + nota3) / 3;

		System.out.printf("A media aritmetica das notas = %.2f %n", ans);
	}
}
