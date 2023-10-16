package atividade3;

import java.util.Scanner;

public class Alterando1_9 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			String resposta;

	        do {
			System.out.println("Insira aqui o valor de seu salario: ");
			double salario = input.nextDouble();
			
			double taxa = 0.25;
			
			double aumento = salario * taxa;
			
			double salarionovo = salario + aumento;
			
			System.out.println("O salario novo e R$" + salarionovo);
			
			  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
	            resposta = input.next();
	        } while (resposta.equalsIgnoreCase("S"));

	        input.close();
	        System.exit(0);
			
			
		}

	
}
