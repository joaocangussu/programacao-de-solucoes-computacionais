package atividade3;
import java.util.Scanner;
public class Alterando1_3 {
	
		public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String resposta;

	        do {
	        System.out.println("Digite o raio da esfera:");
	        double raio = input.nextDouble();
	        
	     
	        int comprimentoEsfera = (int) Math.round(2 * Math.PI * raio);
	        
	   
	        int areaEsfera = (int) Math.round(Math.PI * Math.pow(raio, 2));
	        
	      
	        int volumeEsfera = (int) Math.round((3.0 / 4.0) * Math.PI * Math.pow(raio, 3));
	        
	        System.out.println("Comprimento da esfera: " + comprimentoEsfera);
	        System.out.println("Area da esfera: " + areaEsfera);
	        System.out.println("Volume da esfera: " + volumeEsfera);
	        System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("S"));

        input.close();
        System.exit(0);
	    }
	}