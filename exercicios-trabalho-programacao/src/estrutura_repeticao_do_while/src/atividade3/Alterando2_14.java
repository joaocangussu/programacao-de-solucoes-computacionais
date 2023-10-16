package atividade3;

import java.util.Scanner;

public class Alterando2_14 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			String resposta;

	        do {
			System.out.println("Digite um comando do git(clone/fetch/pull):");
			String comando = input.next();
			
			switch(comando){
			case "clone":
				System.out.println("git clone:");
				System.out.println("Faz uma cópia de um repositorio para um novo.");
				System.out.println("Exemplo: git clone https://github.com");
				;break;
			case "fetch":
				System.out.println("git fech:");
				System.out.println("Mostra as mudanças e como elas afetam as suas mudanças locais.");
				System.out.println("Exemplo: git fetch --all");
				;break;
			case "pull":
				System.out.println("git pull:");
				System.out.println("Busca e baixa os conteúdos de repositórios remotos e faz a atualização no seu repositótio local.");
				System.out.println("Exemplo: git pull origin main");
				;break;
			default:
				System.out.println("Comando invalido!");
				;break;
			}
			   System.out.print("Deseja calcular para outra pessoa? (S/N): ");
	            resposta = input.next();
	        } while (resposta.equalsIgnoreCase("S"));

		}

}
