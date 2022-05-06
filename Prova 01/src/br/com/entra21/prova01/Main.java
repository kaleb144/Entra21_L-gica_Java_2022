package br.com.entra21.prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Prova - 01\n");
		
		System.out.println("Qual seu nome ?");
		String name;
		Scanner entrada = new Scanner(System.in);
		System.out.println();
		name = entrada.next();
	
		System.out.println("Ola "+name+","+" Seja muito bem vindo!!\n");
		System.out.println("Vamos lá!!\n");
		
		System.out.println("Qual seu dia de nascimento ?");
		byte dia;
		Scanner entrada2 = new Scanner(System.in);
		System.out.println();
		dia = entrada.nextByte();
		System.out.println("Legal!!"); 
		System.out.println("Seu nome é "+name+" e você nasceu no dia "+dia+".\n");
		
		switch (dia) {
		case 1: 
			System.out.println("O número 1, é considerado o número da liderança.");
			break;
			
		case 2:
			System.out.println("O número 2, é considerado o número da sabedoria.");
			break;
			
		case 3:
			System.out.println("O número 3, é considerado o númeo do amor, a trindade.");
			break;
			
		case 4: 
			System.out.println("O número 4, é considerado o número da fortificação interior.");
			break;
			
		case 5:
			System.out.println("O número 5, é considerado o número da descobertas sobre a verdade.");
			break;
			
		case 6:
			System.out.println("O número 6, é considerado o número do místicismo.");
			break;
			
		case 7:
			System.out.println("O número 7, é considerado o número da consciência espiritual.");
			break;
			
		case 8:
			System.out.println("O número 8, é considerado o número da abundância.");
			break;
			
		case 9:
			System.out.println("O número 9, é considerado o número de início de novos ciclos.");
			break;
			
		case 10:
			System.out.println("O número 10, é considerado o número dos desejos.");
			break;
			
		case 11:
			System.out.println("O número 11, é considerado o número da busca constante por deus.");
			break;
			
		case 12:
			System.out.println("O número 12, é considerado o número da descendência pura, eleita por deus.");
			break;
			
		case 13:
			System.out.println("O número 13, é o número do rompimento, com tudo que está instável.");
			break;
			
		case 14:
			System.out.println("O número 14, é o número que representa a coragem.");
			break;
			
		case 15:
			System.out.println("O número 15, é o número que representa as consêquencias e ações.");
			break;
			
		case 16:
			System.out.println("O número 16, é o número que representa a perdição");
			break;
			
		case 17:
			System.out.println("O número 17, é o número que representa o encorajamento.");
			break;
			
		case 18:
			System.out.println("O número 18, é o número que representa os medos e inseguranças.");
			break;
			
		case 19:
			System.out.println("O número 19, é o número que representa a intuição.");
			break;
			
		case 20:
			System.out.println("O número 20, é o número que representa o perdão.");
			break;
			
		case 21:
			System.out.println("O número 21, é o número que representa a força interior, em busca de seus objetivos");
			break;
			
		case 22:
			System.out.println("O número 22, é o número que representa a busca pela harmonia em sua vida.");
			break;
			
		case 23:
			System.out.println("O número 23, é o número que representa a confiança em si mesmo.");
			break;
			
		case 24:
			System.out.println("O número 24, é o número que representa o reflexo do outro em você.");
			break;
			
		case 25:
			System.out.println("O número 25, é o número que representa o desequilíbrio.");
			break;
			
		case 26:
			System.out.println("O número 26, é o número representa, que você deve ter mais cuidado,consigo mesmo. ");
			break;
			
		case 27:
			System.out.println("O número 27, é o número que representa a transição.");
			break;
			
		case 28:
			System.out.println("O número 28, é o número que representa as decisões futuras.");
			break;
			
		case 29:
			System.out.println("O número 29, é o número que representa novas oportunidades.");
			break;
			
		case 30:
			System.out.println("O número 30, é o número que representa a articulação sobre as oportunidades.");
			break;
			
		case 31:
			System.out.println("O número 31, é o número que representa a criação de sua própria vida.");
			break;
			
		}
		
		System.out.println("É isso ai, vamos lá "+name+"!\n");
		System.out.println("Qual seu mês de nascimento ?");
		String mes;
		Scanner entrada3 = new Scanner(System.in);
		System.out.println();
		mes = entrada.next();
		
		switch (mes) {
		case "janeiro":
		case "Janeiro":
		if 	(dia <= 20) {
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Capricórnio.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Aquário." );
			break;
			
		case "fevereiro":
		case "Fevereiro":
		if 	(dia <= 18) {	
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Aquário.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Peixes.");
			break;
			
		case "marco":
		case "Março":
		case "março":
		if 	(dia <= 20) {	
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Peixes.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Áries.");
			break;
			
		case "Abril":
		case "abril":
		if	(dia <= 20)	{
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Áries.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Touro.");
			break;
			
		case "Maio":
		case "maio":
		if	(dia <= 20) {
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Touro.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Gêmeos.");
			break;
			
		case "Junho":
		case "junho":
		if	(dia <= 21)	{
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Gêmeos");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Câncer.");
			break;
			
		case "Julho":
		case "julho":
		if	(dia <= 22) {	
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Câncer.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Leão.");
			break;
			
		case "Agosto":
		case "agosto":
		if	(dia <= 23)	{
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Leão.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Virgem.");
			break;
			
		case "Setembro":
		case "setembro":
		if	(dia <= 22) {
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Virgem.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Libra.");
			break;
			
		case "Outubro":
		case "outubro":
		if	(dia <= 22)	{
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Libra.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Escorpião.");
			break;
			
		case "Novembro":
		case "novembro":
		if	(dia <= 21)	{
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Escorpião.");	
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Sagitário.");
			break;
			
		case "Dezembro":
		case "dezembro":
		if	(dia <= 21) {	
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Sagitário.");
		}	else
			System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Capricórnio.");
			break;
			
			default:
				System.out.println("opcao inválida");
				break;
			
			
			
			
			
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
