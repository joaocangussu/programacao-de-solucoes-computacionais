package atividade3;

import java.util.Scanner;

public class Alterando1_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resposta;

        do {
		System.out.print("Digite o ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		System.out.print("Digite o ano atual:");
		int anoAtual = input.nextInt();
		
		int idadeAtual = anoAtual - anoNascimento;
		
		int ano2050 = 2050;
		int idade2050 = ano2050 - anoNascimento;
		
		System.out.println("Idade atual: " + idadeAtual + "anos.");
		System.out.println("Idade em 2050: " + idade2050 + "anos.");
		           
            System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

        input.close();
        System.exit(0);
    }
}
