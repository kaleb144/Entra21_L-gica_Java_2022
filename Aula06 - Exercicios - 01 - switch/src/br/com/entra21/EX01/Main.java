package br.com.entra21.EX01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	System.out.println("Exercicío - switch \n");
		
	System.out.println("Qual estação do ano, você prefere.\n");

	System.out.println("1) Primavera ");
	System.out.println("2) Outono ");
	System.out.println("3) Inverno ");
	System.out.println("4) Verão \n ");
	
	Scanner entrada = new Scanner(System.in);
	byte opcao;
	System.out.println("Escolha uma opcao ?");
	opcao = entrada.nextByte();
	
	switch (opcao) {
	case 1:
		System.out.println("Primavera estação temperada,amena e sempre florida.");
		break;
	
	case 2:
		System.out.println("Outono, essa é a estação da transição,transformação,mudanças para o crescimento interior.\n");
		break;
		
	case 3:
		System.out.println("Inverno, além de ser uma estação fria, é o tempo das provações e de lutas.\n");
		break;
		
	case 4:
		System.out.println("verão, além de ser uma estação calorosa, também é o momento de agradecer e pedir por grandes colheitas.\n");
		break;
	}	
		String resposta;
		System.out.println("Preferiria outra estaçao ?");
		resposta = entrada.next();
		
		switch (resposta) {
		case "sim":
			System.out.println("Que outra estação, você gostaria.\n");
			System.out.println("1) Primavera ");
			System.out.println("2) Outono ");
			System.out.println("3) Inverno ");
			System.out.println("4) Verão \n ");
			break;
			
		}	
		String resposta2;	
		System.out.println("Escolha uma opcao ?");
		resposta2 = entrada.next();
		
		switch (resposta2) {
		case "1":
			System.out.println("Primavera estação temperada,amena e sempre florida.");
			break;
			
		case "2":
			System.out.println("Outono, essa é a estação da transição,transformação,mudanças para o crescimento interior.\n");
			break;
			
		case "3":
			System.out.println("Inverno, além de ser uma estação fria, é o tempo das provações e de lutas.\n");
			break;
			
		case "4":
			System.out.println("verão, além de ser uma estação calorosa, também é o momento de agradecer e pedir por grandes colheitas.\n");
			break;
		
		case "não":
			System.out.println("Está certo!\n");
			break;
	}
		
		String opcao3;
		System.out.println("Qual a opcao de cor favorita ? \n");
		System.out.println("1) Verde");
		System.out.println("2) Azul");
		System.out.println("3) Amarelo");
		System.out.println("4) Vermelho\n");
		System.out.println("Escolha a opção de cor ?");
		opcao3 = entrada.next();
		
		switch (opcao3) {
		case "1":
			System.out.println("Verde significa esperança, liberdade, saúde e vitalidade.\n");
			break;
		
		case "2":
			System.out.println("Azul simboliza criatividade, juventude e alegria.\n");
			break;
			
		case "3":
			System.out.println("Amarela desperta, traz leveza, descontração, otimismo. Simboliza criatividade, juventude e alegria.\n");
			break;
			
		case "4":
			System.out.println("Vermelho raiva, paixão, fúria, ira, desejo,calor, amor, agressão, perigo, fogo, sangue, guerra, violência.\n");
			break;
			
		default:
			System.out.println("Era uma pergunta tão simples...");
			break;
			
		}	
		System.out.println("Obrigado por ajudar, na nossa pesquisa!!");
	
		}
		
}

