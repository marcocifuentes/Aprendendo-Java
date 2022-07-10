// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);

		String nome;

		System.out.println("Digite seu nome ou s para sair: ");
		nome = entrada.nextLine();

		while (!nome.equalsIgnoreCase("s")) {

			System.out.printf("Bem Vindo %s\n", nome);

			System.out.println("Digite seu nome ou s para sair: ");
			nome = entrada.nextLine();
		}

		System.out.println("Fim da execução!");
	}
}