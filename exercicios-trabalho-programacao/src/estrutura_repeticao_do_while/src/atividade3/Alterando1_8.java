package atividade3;

import java.util.Scanner;

public class Alterando1_8 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String resposta;

	        do {
	        System.out.print("Digite o peso atual da pessoa em quilogramas: ");
	        double pesoAtual = scanner.nextDouble();

	        double novoPesoEngordar = calcularNovoPesoEngordar(pesoAtual);
	        double novoPesoEmagrecer = calcularNovoPesoEmagrecer(pesoAtual);

	        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + novoPesoEngordar + " kg");
	        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + novoPesoEmagrecer + " kg");

	           
            System.out.print("Deseja calcular para outra pessoa? (S/N): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();
        System.exit(0);
	    }

	    public static double calcularNovoPesoEngordar(double pesoAtual) {
	        return pesoAtual * 1.15;
	    }

	    public static double calcularNovoPesoEmagrecer(double pesoAtual) {
	        return pesoAtual * 0.8;
	    }
	}
