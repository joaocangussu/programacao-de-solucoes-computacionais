package atividade3;

import java.util.Scanner;

public class Alterando2_9 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Digite um nome de um planeta(Começo letra maiuscula e sem acentos):");
			String planeta = input.next();

			System.out.println("Digite uma velocidade(v0):");
			double velocidade = input.nextDouble();

			System.out.println("Digite um instante(t):");
			double instante = input.nextDouble();

			switch (planeta) {
			case "Mercurio":
				System.out.println("Mercurio");
				double vt = velocidade - 3.7;
				double ht = velocidade * instante - (Math.pow(3.7, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt +" e da altura:"+ ht);
				;
				break;
			case "Venus":
				System.out.println("Venus");
				double vt1 = velocidade - 8.8;
				double ht1 = velocidade * instante - (Math.pow(8.8, 2) / 2);
				System.out.println("valor da velocidade:" + vt1 +" e da altura:"+ ht1);
				;
				break;
				
			case "Terra":
				System.out.println("Terra");
				double vt2 = velocidade - 9.8;
				double ht2 = velocidade * instante - (Math.pow(9.8, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt2 +" e da altura:"+ ht2);
				;
				break;
			case "Marte":
				System.out.println("Marte");
				double vt3 = velocidade - 3.8;
				double ht3 = velocidade * instante - (Math.pow(3.8, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt3 +" e da altura:"+ ht3);
				;
				break;
			case "Jupter":
				System.out.println("Jupter");
				double vt4 = velocidade - 26.4;
				double ht4 = velocidade * instante - (Math.pow(26.4, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt4 +" e da altura:"+ ht4);
				;
				break;
			case "Saturno":
				System.out.println("Saturno");
				double vt5 = velocidade - 11.5;
				double ht5 = velocidade * instante - (Math.pow(11.5, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt5 +" e da altura:"+ ht5);
				;
				break;
			case "Urano":
				System.out.println("Urano");
				double vt6 = velocidade - 9.3;
				double ht6 = velocidade * instante - (Math.pow(9.3, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt6 +" e da altura:"+ ht6);
				;
				break;
			case "Netuno":
				System.out.println("Netuno");
				double vt7 = velocidade - 12.2;
				double ht7 = velocidade * instante - (Math.pow(12.2, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt7 +" e da altura:"+ ht7);
				;
				break;
			case "Plutao":
				System.out.println("Plutao");
				double vt8 = velocidade - 0.6;
				double ht8 = velocidade * instante - (Math.pow(0.6, 2) / 2);
				System.out.println("Valor da velocidade:"+ vt8 +" e da altura:"+ ht8);
				;
				break;

			default:
				System.out.println("Planeta Inválido!");
				;
				break;
			}
		System.out.print("Deseja calcular para outra pessoa? (S/N): ");
        resposta = input.next();
    } while (resposta.equalsIgnoreCase("S"));


		}



}
