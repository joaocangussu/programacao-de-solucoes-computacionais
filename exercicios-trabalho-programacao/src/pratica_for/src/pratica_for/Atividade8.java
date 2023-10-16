package pratica_for;

import java.util.Scanner;
public class Atividade8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int num = scanner.nextInt();

	        System.out.print("Digite o segundo número(expoente): ");
	        int expoente = scanner.nextInt();

	        scanner.close();

	        if (expoente < 0) {
	            System.out.println("O expoente deve ser não negativo.");
	        } else {
	            long resultado = calcularPotencia(num, expoente);
	            System.out.println(num + " elevado a " + expoente + " é igual a " + resultado);
	        }
	    }

	    public static long calcularPotencia(int base, int expoente) {
	        if (expoente == 0) {
	            return 1;
	        }

	        long resultado = 1;
	        for (int i = 1; i <= expoente; i++) {
	            resultado *= base;
	        }

	        return resultado;
	    }
	}

