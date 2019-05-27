package aplicacao;

import java.util.Scanner;

public class ProgPrincipal {

	public static void main(String[] args) {
		/*
		Fazer um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros. Em seguida, mostrar a diagonal
		principal e a quantidade de valores negativos da matriz.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho da matriz: ");
		int n = sc.nextInt();
		
		//Declarando a Matriz
		int[][] matriz = new int[n][n];
		
		//Preencher a Matriz com dados
		
		for (int i=0; i<matriz.length; i++) {
			System.out.println("Entre com os numeros da linha # " + i + " : " );
			for (int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		// Mostrando a diagonal - lembrando que os numeros da diagonal estão em posições que a coluna e linha são iguais
		System.out.println("*** Diagonal ***");
		
		for (int i=0; i<n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		// Contando o numero de numeros negativos
		int contador = 0;
		
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		System.out.println();
		System.out.println("Quantidade de numeros negativos= " + contador);
		
		sc.close();
	}

}
