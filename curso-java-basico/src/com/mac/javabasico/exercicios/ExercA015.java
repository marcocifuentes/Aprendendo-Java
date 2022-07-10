package com.mac.javabasico.exercicios;

/*
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
 * calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */

import java.util.Scanner;

public class ExercA015 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite tamanho do arquivo em MB      : ");
		double tamanhoArq = scan.nextDouble();
		
		System.out.print("Digite velocidade do Download em Mbps: ");
		double velocDownload = scan.nextDouble();
		
		double tempoDownload = tamanhoArq / velocDownload;
		
		System.out.println("Tempo estimado para o Download       : " + tempoDownload );
		
	}

}