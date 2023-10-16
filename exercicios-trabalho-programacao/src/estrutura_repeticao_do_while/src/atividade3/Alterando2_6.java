package atividade3;

import java.util.Scanner;

public class Alterando2_6 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Primeiro lado do triângulo: ");
			double L1 = input.nextDouble();
			
			System.out.println("Segundo lado do triângulo: ");
			double L2 = input.nextDouble();
			
			System.out.println("terceiro lado do triângulo: ");
			double L3 = input.nextDouble();

			
			if (L1+L2>L3 && L3+L2>L1 && L1+L3>L2) {
				System.out.println("É um triângulo válido!");
			
			}else{
				System.out.println("Não é um triângulo!");
		}

		    System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

	}

}
