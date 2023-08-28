package inicio;
import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a1, a2, a3, notaFinal;
		int faltas;
		
		System.out.println("Informe a nota da A1:");
		a1 = input.nextInt();
		
		System.out.println("Informe a nota da A2:");
		a2 = input.nextInt();
		
		System.out.println("Informe a nota da A3:");
		a3 = input.nextInt();
		
		System.out.println("Informe a porcentagem de faltas:");
		faltas = input.nextInt();
	
		notaFinal = (a1 + a2 + a3);
		
		System.out.printf("(>) Nota Final: %.2f %n" +notaFinal);
		System.out.println("(<) Faltas: " +faltas);
		
		//Para que o aluno seja APROVADO, deve ter nota maior ou igual a 70
		//e menos que 20% de faltas
		
		//Para que o aluno tenha direito a RECUPERAÇÃO, deve ter a nota maior
		//ou igual a 40 e menos que 20% de faltas
		
		//Para que o aluno seja REPROVADO, ele deve ter uma nota menor que 40 ou
		//mais que 20% de faltas
		
		if(notaFinal >= 70 && faltas < 20) {
			System.out.println("Parabens, foi aprovado!!");
			}else if(notaFinal >= 40 && faltas < 20) {
				System.out.println("Reprovado, porem com direito a recuperacao.");
		}else{
			System.out.println("Infelizmente, reprovado sem direito a recuperacao.");
		}
	}
}
