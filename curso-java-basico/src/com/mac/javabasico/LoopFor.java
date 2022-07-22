package com.mac.javabasico;

public class LoopFor {

	public static void main(String[] args) {

		/*
		 * O comando for executa uma operação de código que está dentro do bloco, enquanto uma
		 * expressão for verdadeira. Muito utilizado na programação.
		 * 
		 * for ( inicialização; condição; atualização) {
		 * bloco de código
		 * }
		 * 
		 */

		// exemplo 1
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}

		// exemplo 2
		for (int i = 3; i < 11; i += 2) {
			if (i == 7) {
			} else {
				System.out.println("i: " + i);
			}
		}
		
		// for com mais de uma variável
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor: " + i + " j tem valor: " + j);
		}

		// for com partes ausentes; não é recomendando
		int i = 0;
		for (; i < 5;) {
			System.out.println("i tem valor: " + i);
			i++;
		}

		// loop sem corpo; também nao é recomendado
		int soma = 0;
		for (i = 1; i < 5; soma += i++);
		System.out.println("A soma é " + soma);

	}

}
