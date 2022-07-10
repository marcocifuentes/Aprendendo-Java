package com.mac.javabasico;

public class LoopFor {

	public static void main(String[] args) {

		/* 
		 * Comando for
		 * . executa um bloco de codigo que esta dentro do comando for enquanto
		 * uma expressao for verdadeira.
		 * 
		 * Muit utilizado na programacao.
		 * 
		 */
		
		// for ( inicializacao; condicao; atualizacao) {
					//bloco de codigo
		// }			
		for (int i = 0; i < 10; i++) {
			System.out.println("i = "+ i);
		}
		
		//for com mais de uma variavel
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i tem valor: " + i + " j tem valor: " + j);
		}
		
		//for com partes ausentes; nao é recomendando...
		int i = 0;
		for (; i < 5; ) {
			System.out.println("i tem valor: " + i);
			i++;
		}

		// loop sem corpo; tambem nao é recomendado...
		int soma = 0;
		for ( i = 1; i < 5; soma += i++);
		System.out.println("A soma é " + soma);
	
	
	}

	
}
