package br.com.entra21.Prova;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Crie um programa que faça vários cálculos\n");
		
		System.out.println("Calculadora\n");
		
		Scanner input = new Scanner(System.in);
		
		float numeroA, numeroB, dividir, multiplicar, somar, subtrair;
		byte opcao;
		
		System.out.println("1 = somar\n" + "2 = subtrair\n" + "3 = multiplicar\n" + "4 = dividir\n");
		System.out.println("Escolha a operação:");
		
		opcao = input.nextByte();
		System.out.println();
		
		System.out.println("numeroA: ");
		numeroA = input.nextFloat();
		System.out.println();
		
		System.out.println("numeroB: ");
		numeroB = input.nextFloat();
		System.out.println();
		
		if( (numeroA==0) && (numeroB==0) ) {
			System.out.println("Programa encerrado.");
			System.exit(1);
		}
		
		switch (opcao) {
		case 1:
		somar = numeroA + numeroB;
		System.out.println("Resultado soma: " +numeroA+ " + " +numeroB+ " = " +somar);
		break;
		
		case 2:
		subtrair = numeroA - numeroB;
		System.out.println("Resultado subtração: " +numeroA+ " - " +numeroB+ " = " +subtrair);
		break;
		
		case 3:
		multiplicar = numeroA * numeroB;
		System.out.println("Resultado multiplicação: " +numeroA+ " x " +numeroB+ " = " +multiplicar);
		break;
		
		case 4:
		dividir = numeroA / numeroB;
		System.out.println("Resultado divisão: " +numeroA+ " / " +numeroB+ " = " +dividir);
		
		
	}
	
	}

}
