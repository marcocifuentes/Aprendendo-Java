package com.mac.javabasico;

// necessario para usar a variavel scan
import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		/*
		 * /ler uma linha inteira System.out.println("Digite seu nome completo: ");
		 * String nomeCompleto = scan.nextLine();
		 * System.out.println("Seu nome completo: " + nomeCompleto);
		 * 
		 * //ler tipo de dados especifico (antes de pressionar barra de espacos, tab,
		 * ...) System.out.println("Digite seu primeiro nome: "); String primeiroNome =
		 * scan.next(); System.out.println("Seu primeiro nome: " + primeiroNome);
		 * 
		 * //usando variavel do tipo int System.out.println("Digite idade: "); int idade
		 * = scan.nextInt(); System.out.println("Idade: " + idade);
		 * 
		 * //usando variavel do tipo double System.out.println("Digite altura:"); double
		 * altura = scan.nextDouble(); System.out.println("Altura: " + altura);
		 */

		// usando espaco para entrada de dados de cada variavel
		System.out.println("Digite sobrenome, idade, qtde filhos, altura, sem tem pet:");
		String sobrenome = scan.next();
		int idadeAtual = scan.nextInt();
		byte filhosQtd = scan.nextByte();
		float alturaAtual = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		System.out.println("Dados digitados: ");
		System.out.println("Sobrenome:" + sobrenome);
		System.out.println("Idade: " + idadeAtual);
		System.out.println("Qtd filhos: " + filhosQtd);
		System.out.println("Altura: " + alturaAtual);
		System.out.println("Tem Pet: " + temPet);

	}

}
