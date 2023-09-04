package exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double celcius, ans;

		System.out.println("Informe a temperatura (em celcius):");
		celcius = input.nextInt();

		ans = (celcius * 1.8) + 32;

		System.out.printf("A temperatura em fahrenheit esta " + (int) ans + " graus.");
	}
}
