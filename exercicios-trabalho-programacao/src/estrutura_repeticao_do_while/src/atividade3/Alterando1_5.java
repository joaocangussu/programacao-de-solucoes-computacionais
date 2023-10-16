package atividade3;

import java.util.Scanner;
public class Alterando1_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String resposta;

        do {
		System.out.println("Insira aqui a temperatura em graus Celsius:");
		double temperatura = input.nextDouble();

		double taxa = 1.8;

		double fahrenheit = temperatura * taxa + 32;

		System.out.println("A temperatura em Fahrenheit e " + fahrenheit + "F.");
		 System.out.print("Deseja calcular para outra pessoa? (S/N): ");
         resposta = input.next();
     } while (resposta.equalsIgnoreCase("S"));

     input.close();
     System.exit(0);
	}

}