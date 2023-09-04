package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int diagMaior, diagMenor, ans;

		System.out.println("Informe a diagonal maior:");
		diagMaior = input.nextInt();

		System.out.println("Informe a diagonal menor:");
		diagMenor = input.nextInt();

		ans = (diagMaior * diagMenor) / 2;

		System.out.println("A area do losango = " + ans + "cm².");
	}
}
