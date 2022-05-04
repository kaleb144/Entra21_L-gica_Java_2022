package br.com.entra21.Switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Condicionais - switch");
		
		System.out.println("Serve para escolher entre opções pré definidas");
	
		System.out.println("Geralmente quando há muitos if eles ifs baseados em igualdade");
		
		float altura=1.5f;
		
		if(altura == 1.0) {
			System.out.println("é baixinho");
		}else if(altura==1.2) {
			System.out.println("Continua baixinho");
		}else if(altura==1.5) {
			System.out.println("Baixinho mas nem tanto");
		}else {
			System.out.println("já não é considerado baixinho");
		}
		
		System.out.println("1 = Intervalo");
		System.out.println("2 = Exercício");
		System.out.println("3 = Prova");
		
		Scanner entrada = new Scanner(System.in);
		byte opcao;
		System.out.println("Escolha a opcao 3 se tiver coragem");	
		System.out.println("Ou escolha qualquer opcao");
		opcao = entrada.nextByte();
		
		
		switch(opcao) {
		case 1:
			System.out.println("Vamos para o intervalo");
			
			break;
			
		case 2:
			System.out.println("Daqui a pouco tem exercicios");
			break;
		
		case 3:
			System.out.println("Era dia 5 mas podemos fazer hj");
			break;
			
			
			}
			String resposta;
			System.out.println("Queremos intervalo ?");
			resposta = entrada.next();
			
			switch(resposta) {
			
			case "sim":
				System.out.println("Hoje foi na hora");
				break;
				
			case "não":
				System.out.println("Esperar mais um pouco...");
				break;
				
				default:
					System.out.println("Era uma pergunta tão simples...");
					break;
			}	
		
				System.out.println("Escolha um número");
				System.out.println("1 = azul");
				System.out.println("2 = vermelho");
				resposta = entrada.next();
				
				switch(resposta) {
				
				case "1": 
					System.out.println("Azul é bom, mas nada contra quem gosta de vermelho");
					break; 
				case "2":
					System.out.println("Vermelhor é uma boa cor, mas nada contra quem gosta de azul");
					break;
				default:
					System.out.println("Opcao invalida");
					break;
						
					
			
				
				}	
				}	
				
		}
		
		
		
				
	
	
	
	


