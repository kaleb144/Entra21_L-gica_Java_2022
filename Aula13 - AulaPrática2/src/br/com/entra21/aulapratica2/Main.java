package br.com.entra21.aulapratica2;

import java.util.Scanner;

public class Main {

	public static void vetorCom5ParaInicializar() {
		byte vetorBytes[] = new byte[5];
		Scanner input = new Scanner(System.in);

		for (byte count = 0; count < vetorBytes.length; count++) {
			System.out.println("Inicializando a posição " + (count + 1) + " no indice " + count);
			vetorBytes[count] = input.nextByte();

		}
		
	}
	
}
