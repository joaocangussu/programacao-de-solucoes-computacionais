package pratica_for;
	import java.util.Scanner;
	public class Atividade12 {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite um número para calcular a tabuada: ");
		        int num = scanner.nextInt();

		        scanner.close();

		        System.out.println("A tabuada de multiplicação do " + num + "é :");

		        for (int i = 1; i <= 10; i++) {
		            int total = num * i;
		            System.out.println(num + " x " + i + " = " + total);
		        }
		    }
		}


