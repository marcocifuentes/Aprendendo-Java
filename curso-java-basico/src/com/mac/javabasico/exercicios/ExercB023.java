package com.mac.javabasico.exercicios;

/*
 * O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente 
receberá ainda um desconto de 5% sobre o total da compra. 

Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.

 */
import java.util.Scanner;

public class ExercB023 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a opção de carne: ");
		System.out.println("(1) File Duplo");
		System.out.println("(2) Alcatra");
		System.out.println("(3) Picanha");

		int opcao = leia.nextInt();

		System.out.print("Informe o peso: ");
		double peso = leia.nextDouble();

		System.out.print("Compra no cartao? (S/N) ");
		String cartao = leia.next();

		double file = 0;
		double alcatra = 0;
		double picanha = 0;
		double total = 0;
		double desconto = 0.05;

		if (peso <= 5) {
			file = 4.9;
			alcatra = 5.9;
			picanha = 6.9;
		} else {
			file = 5.8;
			alcatra = 6.8;
			picanha = 7.8;
		}

		System.out.println("");

		if (opcao == 1) {
			total = file * peso;
			System.out.println("Carne escolhida: File Duplo ");
		} else if (opcao == 2) {
			total = alcatra * peso;
			System.out.println("Carne escolhida: Alcatra ");
		} else if (opcao == 3) {
			total = picanha * peso;
			System.out.println("Carne escolhida: Picanha ");
		}

		System.out.println("Peso: " + peso + " Kg");
		System.out.println("Preço total R$ " + total);

		if (cartao.equalsIgnoreCase("S")) {
			total = total - (total * desconto);
			System.out.println("Tipo de pagamento: Cartão Tabajara");
			System.out.println("Desconto (5%) R$ " + (total * desconto));
			System.out.println("Valor a pagar R$ " + total);
		} else {
			System.out.println("Tipo de pagamento: Dinheiro, Pix, outros cartoes");
			System.out.println("Valor a pagar R$ " + total);
		}

	}

}
