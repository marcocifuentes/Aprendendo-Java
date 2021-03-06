package com.mac.javabasico;

/**
 * Comparando 4(quatro) tipos de operadores logicos: Conjuncao: && (and) ->
 * verdadeiro quando ambos sao verdadeiros Disjuncao: || (or) -> falso quando
 * ambos sao falsos Disjuncao exclusiva: ^ (xor) -> verdadeiro quando sao
 * opostos Negacao: ! (inversao) -> inverte o valor logico
 * 
 * @author cifuentes, 22/06/2022
 *
 */

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;

		// Exemplo de uso da Conjunção && (and), onde só é verdadeiro quando ambos são
		// verdadeiros.
		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 && b3: " + (b1 && b3));

		// Exemplo de uso da Disjunçãoo || (or), onde só é falso quando ambos são
		// falsos.
		System.out.println("b2 || b3: " + (b2 || b3));
		System.out.println("b2 || b4: " + (b2 && b4));

		// Exemplo de uso do Disjunçãoo exclusiva ^ (xor), onde só é verdade quando
		// ambos são opostos/diferentes.
		System.out.println("b1 ^ b3 : " + (b1 ^ b3));
		System.out.println("b4 ^ b1 : " + (b4 ^ b1));

		// Exemplo de negação; inverte o valor lógico: True vira False e vice-versa.
		System.out.println("!b1 : " + !b1);
		System.out.println("!b2 : " + !b2);

		// Comparando expressões
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		System.out.println("((i1 + i2) < (f2 - f1)) && true: " + (((i1 + i2) < (f2 - f1) && true)));
		System.out.println("((i1 + i2) < (f2 - f1)) && false: " + (((i1 + i2) < (f2 - f1) && false)));

		System.out.println("(i1 > i2) || (f2 < f1)         : " + ((i1 > i2) || (f2 < f1)));

		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;

		int quantidadeDependentes = 4;
		int mediaDependentes = 2;

		System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

		System.out.println((salarioBaixo) && (muitosDependentes));

		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		System.out.println("recebeAuxilio: " + recebeAuxilio);

	}

}
