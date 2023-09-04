package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int anoNascimento, anoAtual, idade, idade2050;

		System.out.println("Informe o ano do seu nascimento:");
		anoNascimento = input.nextInt();

		System.out.println("Informe o ano atual:");
		anoAtual = input.nextInt();

		idade = (anoAtual - anoNascimento);
		idade2050 = (2050 - anoNascimento);

		System.out.println("Voce tem " + idade + " anos.");
		System.out.println("Em 2050 voce tera " + idade2050 + " anos.");
	}
}
