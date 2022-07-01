package com.loiane.exerc.modulo1;

/*
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
 * calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */
import java.util.Scanner;

public class Exerc014 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite tamanho do arquivo em MB: ");
		double tamanhoArq = scan.nextDouble();
		
		System.out.println("Digite velocidade do Download em Mbps: ");
		double veloDownload = scan.nextDouble();
		
		double tempoDownload = tamanhoArq / veloDownload;
		
		System.out.println("Tempo estimado para o Download: " + tempoDownload);
		
	}

}