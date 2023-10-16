package pratica_for;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o primeiro número positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        int num2 = scanner.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        System.out.println("Os números inteiros entre " + min + " e " + max + " é:");

        for (int i = min + 1; i < max; i++) {
            System.out.print(i + ", ");
        }

        System.out.println(); 

        scanner.close();
    }
}
