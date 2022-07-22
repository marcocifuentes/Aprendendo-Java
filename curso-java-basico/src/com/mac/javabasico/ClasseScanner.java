package com.mac.javabasico;

// necessário para usar a classe Scanner
import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// ler uma linha inteira "nextLine"
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo: " + nomeCompleto);

		// ler tipo de dados específico "next" (antes de pressionar barra de espaços, ou tab)
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome: " + primeiroNome);

		// usando variável do tipo int
		System.out.println("Digite idade: ");
		int idade = scan.nextInt();
		System.out.println("Idade: " + idade);

		// usando variável do tipo double
		System.out.println("Digite altura:");
		double altura = scan.nextDouble();
		System.out.println("Altura: " + altura);

		// exemplo
		// usando espaço para entrada de dados de cada variável
		System.out.println("Digite Sobrenome, Idade, Quantidade de filhos, Altura, Tem pet? (true/false): ");
		String sobrenome = scan.next();
		int idadeAtual = scan.nextInt();
		byte filhosQtd = scan.nextByte();
		float alturaAtual = scan.nextFloat();
		boolean temPet = scan.nextBoolean();

		System.out.println("< Dados digitados >  ");
		System.out.println("Sobrenome:" + sobrenome);
		System.out.println("Idade: " + idadeAtual);
		System.out.println("Quantidade de filhos: " + filhosQtd);
		System.out.println("Altura: " + alturaAtual);
		System.out.println("Tem Pet: " + temPet);

	}

}
