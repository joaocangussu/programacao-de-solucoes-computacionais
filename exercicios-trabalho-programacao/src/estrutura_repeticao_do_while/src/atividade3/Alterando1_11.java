package atividade3;
import java.util.Scanner;
public class Alterando1_11 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Informe um numero para a tabuada: ");
			int numero = input.nextInt();
			for (int i = 0; i <= 10; i++) {
				int resultado = numero * i;
				System.out.println(numero + " X " + i + " = " + resultado);
			}
				  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
		            resposta = input.next();
		        } while (resposta.equalsIgnoreCase("S"));
	        }
		
	}