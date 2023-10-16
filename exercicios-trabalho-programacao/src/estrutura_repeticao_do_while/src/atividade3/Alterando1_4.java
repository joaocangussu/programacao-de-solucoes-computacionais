package atividade3;
import java.util.Scanner;
public class Alterando1_4 {
	
		
		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        String resposta;

		        do {
		        System.out.print("Digite a cotacao do dolar em reais: ");
		        double cotacao = input.nextDouble();

		        System.out.print("Digite o valor em dolares: ");
		        double valorDolar = input.nextDouble();

		        // Converte o valor em dólares para reais
		        double valorEmReais = valorDolar * cotacao;

		        // Exibe o valor em reais
		        System.out.println("O valor em reais é: R$" + valorEmReais);
		        System.out.print("Deseja calcular para outra pessoa? (S/N): ");
	            resposta = input.next();
	        } while (resposta.equalsIgnoreCase("S"));

	        input.close();
	        System.exit(0);
		    }
		
}
