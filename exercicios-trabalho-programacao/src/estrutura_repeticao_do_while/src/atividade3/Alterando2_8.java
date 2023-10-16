package atividade3;

import java.util.Scanner;

public class Alterando2_8 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Digite o valor do codigo do produto(de 1 ao 5):");
			int cod = input.nextInt();
			
			switch(cod) {
			case 1: 
				System.out.println("Produto 1:Sapato\nPreço: R$ 99,99");
				;break;
			case 2:
				System.out.println("Produto 2:Bolsa\nPreço: R$ 103,89");
				;break;
			case 3:
				System.out.println("Produto 3:Camisa\nPreço: R$ 49,98");
				;break;
			case 4:
				System.out.println("Produto 4:Calça\nPreço: R$ 89,72");
				;break;
			case 5:
				System.out.println("Produto 5:Blusa\nPreço: R$ 97,35");
				;break;
			
			}
			

			  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
	            resposta = input.next();
	        } while (resposta.equalsIgnoreCase("S"));

	}

}
