package pratica_for;
import java.util.Scanner;
public class Atividade7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número " + i + ": ");
	            int numero = scanner.nextInt();

	            if (numero > max) {
	                max = numero;
	            }

	            if (numero < min) {
	                min = numero;
	            }
	        }

	        scanner.close();

	        System.out.println("O maior número é: " + max);
	        System.out.println("O menor número é: " + min);
	    }
	}

