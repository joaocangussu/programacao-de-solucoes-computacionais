package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salarioAtual, salarioNovo;

		System.out.println("Informe seu salario:");
		salarioAtual = input.nextDouble();

		salarioNovo = (salarioAtual * 1.25);

		System.out.printf("O seu salario com o aumento ficou R$ %.2f reais.", salarioNovo);
	}
}
