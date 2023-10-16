package atividade3;

import java.util.Scanner;

public class Alterando2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String resposta;

        do {
		System.out.println("Digite quantas diárias foram passadas no hotel: ");
		int diaria = input.nextInt();

		int sem_taxa = diaria * 500;

		if (diaria < 15) {
			int taxa = diaria * 15;
			int total = sem_taxa + taxa;
			System.out.println("Valor total da taxa de serviço(R$15): " + taxa);
			System.out.println("Total a ser pago: " + total);

		} else if (diaria == 15) {
			int taxa = diaria * 10;
			int total = sem_taxa + taxa;
			System.out.println("Valor total da taxa de serviço(R$10): " + taxa);
			System.out.println("Total a ser pago: " + total);

		} else if (diaria > 15) {
			int taxa = diaria * 5;
			int total = sem_taxa + taxa;
			System.out.println("Valor total da taxa de serviço(R$5): " + taxa);
			System.out.println("Total a ser pago: " + total);
		}
		  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
          resposta = input.next();
      } while (resposta.equalsIgnoreCase("S"));

	}

}

