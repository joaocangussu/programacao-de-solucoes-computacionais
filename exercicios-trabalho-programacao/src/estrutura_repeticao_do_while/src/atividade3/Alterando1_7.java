package atividade3;

import java.util.Scanner;

public class Alterando1_7 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			String resposta;

	        do {
			System.out.println("Insira aqui a diagonal maior de seu losangulo:");
			double maior = input.nextDouble();
			
			System.out.println("Insira aqui a diagonal menor de seu losangulo:");
			double menor = input.nextDouble();
			
			double area = maior * menor / 2;
			
			System.out.println("O valor da area e:" + area);
		
			  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
	            resposta = input.next();
	        } while (resposta.equalsIgnoreCase("S"));

	        input.close();
	        System.exit(0);

	}
}
