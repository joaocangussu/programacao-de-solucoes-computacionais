package pratica_for;
import java.util.Scanner;
public class Atividade9 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        scanner.close();

	        if (numero < 1) {
	            System.out.println("Digite um número inteiro positivo maior ou igual a 1:");
	        } else {
	            System.out.println("Os números ímpares de 1 até " + numero + " são:");
	            for (int i = 1; i <= numero; i++) {
	                if (i % 2 != 0) {
	                    System.out.print(i + " ");
	                }
	            }
	            System.out.println(); 
	        }
	    
	}


}
