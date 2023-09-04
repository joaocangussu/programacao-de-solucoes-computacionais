package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double cotacaoDolar, userDolar, ans;

		System.out.println("Informe a cotacao do dolar (em reais):");
		cotacaoDolar = input.nextDouble();

		System.out.println("Informe quanto dinheiro voce tem (em dolar):");
		userDolar = input.nextDouble();

		ans = (cotacaoDolar * userDolar);

		System.out.printf("Voce tem R$ %.2f reais.", ans);
	}
}
