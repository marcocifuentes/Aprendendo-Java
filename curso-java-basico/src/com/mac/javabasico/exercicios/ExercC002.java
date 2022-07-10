package com.mac.javabasico.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
 * mostrando uma mensagem de erro e voltando a pedir as informações.
 */

public class ExercC002 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			boolean validacao = false;

			do {

				System.out.println("Informe usuário: ");
				String user = scan.next();

				System.out.println("Informe senha: ");
				String senha = scan.next();

				if (user.equalsIgnoreCase(senha)) {
					System.out.println("Senha inválida. Digite novamente.");
					// validacao = false;

				} else {
					System.out.println("Senha cadastrada com sucesso");
					validacao = true;

				}

			} while (!validacao);
		}

	}

}
