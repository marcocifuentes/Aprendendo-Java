package com.mac.javabasico;

public class Array {

	public static void main(String[] args) {

		// Array ou Vetor
		// definindo 7 posições, e inputando valores
		// o primeiro índice (index) é sempre zero 
		// exemplo 1 (tempereatura de alguns dias da semana)
		double[] temperaturas = new double [7];
		temperaturas[0]=31.3;
		temperaturas[1]=32;
		temperaturas[2]=33.7;
		temperaturas[3]=34;
		temperaturas[4]=30.3;
		
		// imprimindo a temperatura de um dia 
		System.out.println("Temperatura do dia 3 é: " + temperaturas[2]);
		
		// verificando tamanho do array
		System.out.println("O tamanho do array é: " + temperaturas.length);
		
		// imprimindo todos os valores do array (valores não inputados, assume zero)
		for (int i =0; i<temperaturas.length; i++) {
			System.out.println("A temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}
		
		// usando for com array (esse formato só funciona com array)
		int i = 0; 
		for (double temp: temperaturas) {
			i++;
			System.out.println("Temperatura do dia " + (i) + " é: " + temp);
		}
		
		
	}

}
