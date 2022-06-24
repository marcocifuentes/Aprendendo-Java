package me.dio.javabasico;

/**
 * Comparando  4(quatro) tipos de operadores logicos:
 * Conjuncao: && (and) -> verdadeiro quando ambos sao verdadeiros
 * Disjuncao: || (or) -> falso quando ambos sao falsos
 * Disjuncao exclusiva: ^ (xor) -> verdadeiro quando sao opostos
 * Negacao: ! (inversao) -> inverte o valor logico
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
		
		System.out.println("b1 && b2: " + (b1 && b2));
		System.out.println("b1 && b3: " + (b1 && b3));
		/** 
		* Exemplo de uso da Conjuncao && (and), onde so' e' verdadeiro
		* quando ambos sao verdadeiros.
		*/
		
		System.out.println("b2 || b3: " + (b2 || b3));
		System.out.println("b2 || b4: " + (b2 && b4));
		/** 
		* Exemplo de uso da Disjuncao || (or), onde so' e' falso
		* quando ambos sao falsos.
		*/

		System.out.println("b1 ^ b3: " + (b1 ^ b3));
		System.out.println("b4 ^ b1: " + (b4 ^ b1));
		/** 
		* Exemplo de uso do Disjuncao exclusiva ^ (xor), onde so' e' verdade
		* quando ambos sao opostos/diferentes.
		*/
		
		System.out.println(!b1);
		System.out.println(!b2);
		/*
		 * Exemplo da negacao; inverte o valor logico:
		 * True vira False e vice-versa
		 */
		
		// exemplo comparando expressoes
		int i1 = 10;
		int i2 = 5;
		float f1 = 20f;
		float f2 = 50f;
		System.out.println("((i1 + i2) < (f2 - f1)) && true: " + (((i1 + i2) < (f2 -f1) && false)));
		System.out.println("(i1 > i2) || (f2 < f1): " + ((i1 > i2) || (f2 < f1)));
		
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
