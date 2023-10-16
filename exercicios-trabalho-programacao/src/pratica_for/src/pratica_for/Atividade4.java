package pratica_for;

import java.util.Scanner;

public class Atividade4{

	public static void main(String[] args) {
				 Scanner scanner = new Scanner(System.in);
			        
			        int somaIdades = 0;
			        int contadorIdades = 0;
			       
			        while (true) {
			            System.out.print("Digite uma idade (ou -1 para parar): ");
			            int idade = scanner.nextInt();
			            
			            if (idade == -1) {
			                break; 
			            }
			            
			            somaIdades += idade;
			            contadorIdades++;
			        }
			        
			        scanner.close();
			        
			        if (contadorIdades > 0) {
			            double mediaIdades = (double) somaIdades / contadorIdades;
			            System.out.println("A média das idades informadas é: " + mediaIdades);
			        } else {
			            System.out.println("Nenhuma idade foi informada para calcular a média.");
			        }
			    

	}
}