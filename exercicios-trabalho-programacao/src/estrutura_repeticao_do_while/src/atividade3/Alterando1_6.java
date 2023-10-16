package atividade3;

import java.util.Scanner;
public class Alterando1_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String resposta;

        do {
		System.out.println("Digite o valor do cateto A: ");
		double catetoA = input.nextDouble();
		
		System.out.println("Digite o valor do cateto B: ");
		double catetoB = input.nextDouble();
		
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
		System.out.println("Valor da hipotenusa: " + hipotenusa);
		  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
          resposta = input.next();
      } while (resposta.equalsIgnoreCase("S"));

      input.close();
      System.exit(0);
	}

}
