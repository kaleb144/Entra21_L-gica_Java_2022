package br.com.entra21.aulapratica3;

import java.util.Scanner;

public class Main {

	public static void definirTamanhoVetorParaInicializar() {
		Scanner entrada = new Scanner(System.in);
		byte tamanho;
		byte vetorBytes[];
		System.out.println("Informe o tamanho do vetor");
		tamanho = entrada.nextByte();
		vetorBytes = new byte[tamanho];
		for (byte contador = 0; contador < vetorBytes.length; contador++) {
			System.out.println("Informe o valor para o item " + (contador + 1) + " no índice [" + contador + "]");
			vetorBytes[contador] = entrada.nextByte();

		}
		
	}
	
}
