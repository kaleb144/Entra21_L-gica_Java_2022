package br.com.entra21.EX01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	System.out.println("Exercic�o - switch \n");
		
	System.out.println("Qual esta��o do ano, voc� prefere.\n");

	System.out.println("1) Primavera ");
	System.out.println("2) Outono ");
	System.out.println("3) Inverno ");
	System.out.println("4) Ver�o \n ");
	
	Scanner entrada = new Scanner(System.in);
	byte opcao;
	System.out.println("Escolha uma opcao ?");
	opcao = entrada.nextByte();
	
	switch (opcao) {
	case 1:
		System.out.println("Primavera esta��o temperada,amena e sempre florida.");
		break;
	
	case 2:
		System.out.println("Outono, essa � a esta��o da transi��o,transforma��o,mudan�as para o crescimento interior.\n");
		break;
		
	case 3:
		System.out.println("Inverno, al�m de ser uma esta��o fria, � o tempo das prova��es e de lutas.\n");
		break;
		
	case 4:
		System.out.println("ver�o, al�m de ser uma esta��o calorosa, tamb�m � o momento de agradecer e pedir por grandes colheitas.\n");
		break;
	}	
		String resposta;
		System.out.println("Preferiria outra esta�ao ?");
		resposta = entrada.next();
		
		switch (resposta) {
		case "sim":
			System.out.println("Que outra esta��o, voc� gostaria.\n");
			System.out.println("1) Primavera ");
			System.out.println("2) Outono ");
			System.out.println("3) Inverno ");
			System.out.println("4) Ver�o \n ");
			break;
			
		}	
		String resposta2;	
		System.out.println("Escolha uma opcao ?");
		resposta2 = entrada.next();
		
		switch (resposta2) {
		case "1":
			System.out.println("Primavera esta��o temperada,amena e sempre florida.");
			break;
			
		case "2":
			System.out.println("Outono, essa � a esta��o da transi��o,transforma��o,mudan�as para o crescimento interior.\n");
			break;
			
		case "3":
			System.out.println("Inverno, al�m de ser uma esta��o fria, � o tempo das prova��es e de lutas.\n");
			break;
			
		case "4":
			System.out.println("ver�o, al�m de ser uma esta��o calorosa, tamb�m � o momento de agradecer e pedir por grandes colheitas.\n");
			break;
		
		case "n�o":
			System.out.println("Est� certo!\n");
			break;
	}
		
		String opcao3;
		System.out.println("Qual a opcao de cor favorita ? \n");
		System.out.println("1) Verde");
		System.out.println("2) Azul");
		System.out.println("3) Amarelo");
		System.out.println("4) Vermelho\n");
		System.out.println("Escolha a op��o de cor ?");
		opcao3 = entrada.next();
		
		switch (opcao3) {
		case "1":
			System.out.println("Verde significa esperan�a, liberdade, sa�de e vitalidade.\n");
			break;
		
		case "2":
			System.out.println("Azul simboliza criatividade, juventude e alegria.\n");
			break;
			
		case "3":
			System.out.println("Amarela desperta, traz leveza, descontra��o, otimismo. Simboliza criatividade, juventude e alegria.\n");
			break;
			
		case "4":
			System.out.println("Vermelho raiva, paix�o, f�ria, ira, desejo,calor, amor, agress�o, perigo, fogo, sangue, guerra, viol�ncia.\n");
			break;
			
		default:
			System.out.println("Era uma pergunta t�o simples...");
			break;
			
		}	
		System.out.println("Obrigado por ajudar, na nossa pesquisa!!");
	
		}
		
}

