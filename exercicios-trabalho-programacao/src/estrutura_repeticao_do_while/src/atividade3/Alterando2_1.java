package atividade3;

import java.util.Scanner;

public class Alterando2_1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Digite a primeira nota:");
			double nota = input.nextDouble();
			
			System.out.println("Digite a segunda nota:");
			double nota1 = input.nextDouble();
			
			double total = (nota + nota1) / 2;
			if (total >= 7) {
				System.out.println("O aluno está aprovado!");
			} else {
				System.out.println("O aluno está reprovado!");
			}
		    System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

        input.close();
        System.exit(0);
		}

	}


