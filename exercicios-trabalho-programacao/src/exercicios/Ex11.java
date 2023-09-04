package exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;

		System.out.println("Informe um numero:");
		num = input.nextInt();

		for (int numTabuada = 1; numTabuada <= 10; numTabuada++) {
			System.out.println(num + "x" + numTabuada + " = " + num * numTabuada);
		}
	}
}
