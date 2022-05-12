package br.com.entra21.exercitando;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Exercitando o conteúdo\n");
		byte opcao1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o programa ?");
		System.out.println();
		System.out.println("1 = Signos");
		System.out.println("2 = Calculadora");
		System.out.println("3 = Contagem regressiva");
		System.out.println("4 = Tábuada");
		
		opcao1 = entrada.nextByte();
		
			System.out.println("Signos Vamos lá!! \n ");
			System.out.println("Informe seu primeiro nome  ?");
			String name;
			Scanner entrada2 = new Scanner(System.in);
			System.out.println();
			name = entrada.next();
		 
		
			System.out.println(name+","+" seja muito bem vindo.");
			System.out.println();
			System.out.println("Agora nos informe seu dia de nascimento ?");
			byte dia;
			Scanner entrada3 = new Scanner(System.in);
			System.out.println();
			dia = entrada.nextByte();
			System.out.println(); 
			System.out.println("Seu nome é "+name+","+" você nasceu no dia "+dia+".");
			System.out.println();
			
	
			switch (dia) {
			case 1: 
				System.out.println("O número 1, é considerado o número da liderança.\n");
				break;
				
			case 2:
				System.out.println("O número 2, é considerado o número da sabedoria.\n");
				break;
				
			case 3:
				System.out.println("O número 3, é considerado o númeo do amor, a trindade.\n");
				break;
				
			case 4: 
				System.out.println("O número 4, é considerado o número da fortificação interior.\n");
				break;
				
			case 5:
				System.out.println("O número 5, é considerado o número da descobertas sobre a verdade.\n");
				break;
				
			case 6:
				System.out.println("O número 6, é considerado o número do místicismo.\n");
				break;
				
			case 7:
				System.out.println("O número 7, é considerado o número da consciência espiritual.\n");
				break;
				
			case 8:
				System.out.println("O número 8, é considerado o número da abundância.\n");
				break;
				
			case 9:
				System.out.println("O número 9, é considerado o número de início de novos ciclos.\n");
				break;
				
			case 10:
				System.out.println("O número 10, é considerado o número dos desejos.\n");
				break;
				
			case 11:
				System.out.println("O número 11, é considerado o número da busca constante por deus.\n");
				break;
				
			case 12:
				System.out.println("O número 12, é considerado o número da descendência pura, eleita por deus.\n");
				break;
				
			case 13:
				System.out.println("O número 13, é o número do rompimento, com tudo que está instável.\n");
				break;
				
			case 14:
				System.out.println("O número 14, é o número que representa a coragem.\n");
				break;
				
			case 15:
				System.out.println("O número 15, é o número que representa as consêquencias e ações.\n");
				break;
				
			case 16:
				System.out.println("O número 16, é o número que representa a perdição\n");
				break;
				
			case 17:
				System.out.println("O número 17, é o número que representa o encorajamento.\n");
				break;
				
			case 18:
				System.out.println("O número 18, é o número que representa os medos e inseguranças.\n");
				break;
				
			case 19:
				System.out.println("O número 19, é o número que representa a intuição.\n");
				break;
				
			case 20:
				System.out.println("O número 20, é o número que representa o perdão.\n");
				break;
				
			case 21:
				System.out.println("O número 21, é o número que representa a força interior, em busca de seus objetivos\n");
				break;
				
			case 22:
				System.out.println("O número 22, é o número que representa a busca pela harmonia em sua vida.\n");
				break;
				
			case 23:
				System.out.println("O número 23, é o número que representa a confiança em si mesmo.\n");
				break;
				
			case 24:
				System.out.println("O número 24, é o número que representa o reflexo do outro em você.\n");
				break;
				
			case 25:
				System.out.println("O número 25, é o número que representa o desequilíbrio.\n");
				break;
				
			case 26:
				System.out.println("O número 26, é o número representa, que você deve ter mais cuidado,consigo mesmo.\n ");
				break;
				
			case 27:
				System.out.println("O número 27, é o número que representa a transição.\n");
				break;
				
			case 28:
				System.out.println("O número 28, é o número que representa as decisões futuras.\n");
				break;
				
			case 29:
				System.out.println("O número 29, é o número que representa novas oportunidades.\n");
				break;
				
			case 30:
				System.out.println("O número 30, é o número que representa a articulação sobre as oportunidades.\n");
				break;
				
			case 31:
				System.out.println("O número 31, é o número que representa a criação de sua própria vida.\n");
				break;
			
	}
			System.out.println("Informe seu mês de nascimento ?");
			String mes;
			Scanner entrada4 = new Scanner(System.in);
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
				System.out.println(name+","+" você faz aniversário no dia "+dia+" de "+mes+", você é do signo de Câncer,"
						+ " esse signo representa as águas.");
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
			System.out.println("Calculadora\n");

			Scanner input = new Scanner(System.in);

			float numeroA, numeroB, dividir, multiplicar, somar, subtrair;
			byte opcao2;

			System.out.println("1 = somar\n" + "2 = subtrair\n" + "3 = multiplicar\n" + "4 = dividir\n");
			System.out.println("Escolha a operação:");

			opcao2 = input.nextByte();
			System.out.println();
			
			System.out.println("numeroA: ");
			numeroA = input.nextFloat();
			System.out.println();

			System.out.println("numeroB: ");
			numeroB = input.nextFloat();
			System.out.println();

			if ((numeroA == 0) && (numeroB == 0)) {
				System.out.println("Programa encerrado.");
				System.exit(1);
			}

			switch (opcao2) {
			case 1:
				somar = numeroA + numeroB;
				System.out.println("Resultado soma: " + numeroA + " + " + numeroB + " = " + somar);
				break;

			case 2:
				subtrair = numeroA - numeroB;
				System.out.println("Resultado subtração: " + numeroA + " - " + numeroB + " = " + subtrair);
				break;

			case 3:
				multiplicar = numeroA * numeroB;
				System.out.println("Resultado multiplicação: " + numeroA + " x " + numeroB + " = " + multiplicar);
				break;

			case 4:
				dividir = numeroA / numeroB;
				System.out.println("Resultado divisão: " + numeroA + " / " + numeroB + " = " + dividir);
			
			opcao2 = entrada.nextByte();
			
			
}
}
}