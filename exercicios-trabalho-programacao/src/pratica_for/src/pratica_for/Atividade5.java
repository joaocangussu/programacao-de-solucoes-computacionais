package pratica_for;

import java.util.Scanner;
public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número (ou digite 0 para parar): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break; 
            }

            if (numero > max) {
            	max = numero;
            }

            if (numero < min) {
                min = numero;
            }
        }

        scanner.close();

        if (max != Integer.MIN_VALUE && min != Integer.MAX_VALUE) {
            System.out.println("O maior número é: " + max);
            System.out.println("O menor número é: " + min);
        } else {
            System.out.println("Nenhum número foi informado!!");
        }
    }
}
