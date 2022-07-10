package com.mac.javabasico.exercicios;

/*
 * Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';
 */

import java.util.Scanner;

public class ExercC003 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		boolean validacao = false;
		String nome, sexo, estadoCivil;
		double salario;

		do {

			System.out.println("Digite seu nome: ");
			nome = input.next();

			if (nome.length() > 3) {
				validacao = true;

			} else {
				System.out.println("Inválido! Nome deve ter no mínimo 3 caracteres.");
			}

		} while (!validacao);

		validacao = false;

		do {

			System.out.println("Digite sua idade: ");
			int idade = input.nextInt();

			if (idade > 0 && idade <= 150) {
				validacao = true;

			} else {
				System.out.println("Idade inválida! Informe valor acima de 0 até 150.");
			}

		} while (!validacao);

		validacao = false;

		do {

			System.out.println("Digite o salário: ");
			salario = input.nextDouble();

			if (salario > 0) {
				validacao = true;

			} else {
				System.out.println("Inválido! Informe valor acima de 0.");
			}

		} while (!validacao);

		validacao = false;

		do {

			System.out.println("Digite o sexo: ");
			sexo = input.next();

			if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
				validacao = true;

			} else {
				System.out.println("Inválido! Informe ( m / f )");
			}

		} while (!validacao);

		validacao = false;

		do {

			System.out.println("Digite o estado civil: ");
			estadoCivil = input.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				validacao = true;

			} else {
				System.out.println("Inválido! Digite ( s / c / v / d )");
			}

		} while (!validacao);

		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Salário: " + salario);
	}

}
