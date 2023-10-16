package atividade3;
import java.util.Scanner;
public class Alterando1_2 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Digite a primeira nota: ");
			double nota1 = scanner.nextDouble();
			
			System.out.println("Digite a segunda nota: ");
			double nota2 = scanner.nextDouble();
			
			System.out.println("Digite a terceira nota: ");
			double nota3 = scanner.nextDouble();
			
			double media = (nota1 + nota2 + nota3) / 3;
			System.out.println("A media das notas e:" + media);
			  System.out.print("Deseja calcular para outra pessoa? (S/N): ");
	            resposta = scanner.next();
	        } while (resposta.equalsIgnoreCase("S"));

	        scanner.close();
	        System.exit(0);
		}
	}