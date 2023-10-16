package pratica_for;
import java.util.Scanner;
public class Atividade10 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        int mulheres = 0;

		        for (int i = 1; i <= 10; i++) {
		            System.out.println("Digite a idade da pessoa " + i + ":");
		            int idade = scanner.nextInt();

		            System.out.println("Digite o sexo da pessoa " + i + " (M ou F):");
		            String sexo = scanner.next();

		            if (sexo.equalsIgnoreCase("F") && idade >= 20 && idade <= 40) {
		            	mulheres++;
		            }
		        }

		        System.out.println("Quantidade de pessoas do sexo feminino entre 20 e 40 anos: " + mulheres);

		        scanner.close();
		    }
		}

