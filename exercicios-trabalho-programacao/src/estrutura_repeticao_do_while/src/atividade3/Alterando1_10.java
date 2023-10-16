package atividade3;
import java.util.Scanner;
public class Alterando1_10 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Insira aqui o valor de seu salario: ");
			double salario = input.nextDouble();
			
			System.out.println("Insira aqui o valor do salario minimo: ");
			double minimo = input.nextDouble();
			
			double numerosalarios = salario / minimo;
			
			System.out.printf("O funcionario recebe %.2f salarios minimos. %n", numerosalarios);
			
	         
            System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

        input.close();
        System.exit(0);


		}

	}
