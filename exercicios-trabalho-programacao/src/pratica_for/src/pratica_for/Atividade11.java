package pratica_for;
import java.util.Scanner;
public class Atividade11 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int contagemMasculinoPeso6080 = 0;
	        int contagemFemininoPeso5070 = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Pessoa " + i + ":");
	            
	            System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
	            char sexo = scanner.next().charAt(0);

	            System.out.print("Digite o peso da pessoa (em kg): ");
	            double peso = scanner.nextDouble();

	            if (sexo == 'M' || sexo == 'm') {
	                if (peso >= 60 && peso <= 80) {
	                    contagemMasculinoPeso6080++;
	                }
	            } else if (sexo == 'F' || sexo == 'f') {
	                if (peso >= 50 && peso <= 70) {
	                    contagemFemininoPeso5070++;
	                }
	            }
	        }

	        scanner.close();

	        System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + contagemMasculinoPeso6080);
	        System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + contagemFemininoPeso5070);
	    }
	}


