package pratica_for;
import java.util.Scanner;
public class Atividade6 {
		public static void main(String[] args) {
		
			        Scanner scanner = new Scanner(System.in);
			        
			        int total_idades = 0;
			        
			        for (int i = 1; i <= 10; i++) {
			            System.out.print("Digite a idade da pessoa " + i + ": ");
			            int idade = scanner.nextInt();
			            
			            total_idades += idade;
			        }
			        
			        scanner.close();
			        
			        double media_idades = (double) total_idades / 10;
			        System.out.println("A média das idades é: " + media_idades);
			    }
			

		}
