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
		System.out.println("Vamos l�!!\n");
		
		System.out.println("Qual seu dia de nascimento ?");
		byte dia;
		Scanner entrada2 = new Scanner(System.in);
		System.out.println();
		dia = entrada.nextByte();
		System.out.println("Legal!!"); 
		System.out.println("Seu nome � "+name+" e voc� nasceu no dia "+dia+".\n");
		
		switch (dia) {
		case 1: 
			System.out.println("O n�mero 1, � considerado o n�mero da lideran�a.");
			break;
			
		case 2:
			System.out.println("O n�mero 2, � considerado o n�mero da sabedoria.");
			break;
			
		case 3:
			System.out.println("O n�mero 3, � considerado o n�meo do amor, a trindade.");
			break;
			
		case 4: 
			System.out.println("O n�mero 4, � considerado o n�mero da fortifica��o interior.");
			break;
			
		case 5:
			System.out.println("O n�mero 5, � considerado o n�mero da descobertas sobre a verdade.");
			break;
			
		case 6:
			System.out.println("O n�mero 6, � considerado o n�mero do m�sticismo.");
			break;
			
		case 7:
			System.out.println("O n�mero 7, � considerado o n�mero da consci�ncia espiritual.");
			break;
			
		case 8:
			System.out.println("O n�mero 8, � considerado o n�mero da abund�ncia.");
			break;
			
		case 9:
			System.out.println("O n�mero 9, � considerado o n�mero de in�cio de novos ciclos.");
			break;
			
		case 10:
			System.out.println("O n�mero 10, � considerado o n�mero dos desejos.");
			break;
			
		case 11:
			System.out.println("O n�mero 11, � considerado o n�mero da busca constante por deus.");
			break;
			
		case 12:
			System.out.println("O n�mero 12, � considerado o n�mero da descend�ncia pura, eleita por deus.");
			break;
			
		case 13:
			System.out.println("O n�mero 13, � o n�mero do rompimento, com tudo que est� inst�vel.");
			break;
			
		case 14:
			System.out.println("O n�mero 14, � o n�mero que representa a coragem.");
			break;
			
		case 15:
			System.out.println("O n�mero 15, � o n�mero que representa as cons�quencias e a��es.");
			break;
			
		case 16:
			System.out.println("O n�mero 16, � o n�mero que representa a perdi��o");
			break;
			
		case 17:
			System.out.println("O n�mero 17, � o n�mero que representa o encorajamento.");
			break;
			
		case 18:
			System.out.println("O n�mero 18, � o n�mero que representa os medos e inseguran�as.");
			break;
			
		case 19:
			System.out.println("O n�mero 19, � o n�mero que representa a intui��o.");
			break;
			
		case 20:
			System.out.println("O n�mero 20, � o n�mero que representa o perd�o.");
			break;
			
		case 21:
			System.out.println("O n�mero 21, � o n�mero que representa a for�a interior, em busca de seus objetivos");
			break;
			
		case 22:
			System.out.println("O n�mero 22, � o n�mero que representa a busca pela harmonia em sua vida.");
			break;
			
		case 23:
			System.out.println("O n�mero 23, � o n�mero que representa a confian�a em si mesmo.");
			break;
			
		case 24:
			System.out.println("O n�mero 24, � o n�mero que representa o reflexo do outro em voc�.");
			break;
			
		case 25:
			System.out.println("O n�mero 25, � o n�mero que representa o desequil�brio.");
			break;
			
		case 26:
			System.out.println("O n�mero 26, � o n�mero representa, que voc� deve ter mais cuidado,consigo mesmo. ");
			break;
			
		case 27:
			System.out.println("O n�mero 27, � o n�mero que representa a transi��o.");
			break;
			
		case 28:
			System.out.println("O n�mero 28, � o n�mero que representa as decis�es futuras.");
			break;
			
		case 29:
			System.out.println("O n�mero 29, � o n�mero que representa novas oportunidades.");
			break;
			
		case 30:
			System.out.println("O n�mero 30, � o n�mero que representa a articula��o sobre as oportunidades.");
			break;
			
		case 31:
			System.out.println("O n�mero 31, � o n�mero que representa a cria��o de sua pr�pria vida.");
			break;
			
		}
		
		System.out.println("� isso ai, vamos l� "+name+"!\n");
		System.out.println("Qual seu m�s de nascimento ?");
		String mes;
		Scanner entrada3 = new Scanner(System.in);
		System.out.println();
		mes = entrada.next();
		
		switch (mes) {
		case "janeiro":
		case "Janeiro":
		if 	(dia <= 20) {
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Capric�rnio.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Aqu�rio." );
			break;
			
		case "fevereiro":
		case "Fevereiro":
		if 	(dia <= 18) {	
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Aqu�rio.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Peixes.");
			break;
			
		case "marco":
		case "Mar�o":
		case "mar�o":
		if 	(dia <= 20) {	
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Peixes.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de �ries.");
			break;
			
		case "Abril":
		case "abril":
		if	(dia <= 20)	{
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de �ries.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Touro.");
			break;
			
		case "Maio":
		case "maio":
		if	(dia <= 20) {
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Touro.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de G�meos.");
			break;
			
		case "Junho":
		case "junho":
		if	(dia <= 21)	{
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de G�meos");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de C�ncer.");
			break;
			
		case "Julho":
		case "julho":
		if	(dia <= 22) {	
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de C�ncer.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Le�o.");
			break;
			
		case "Agosto":
		case "agosto":
		if	(dia <= 23)	{
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Le�o.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Virgem.");
			break;
			
		case "Setembro":
		case "setembro":
		if	(dia <= 22) {
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Virgem.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Libra.");
			break;
			
		case "Outubro":
		case "outubro":
		if	(dia <= 22)	{
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Libra.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Escorpi�o.");
			break;
			
		case "Novembro":
		case "novembro":
		if	(dia <= 21)	{
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Escorpi�o.");	
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Sagit�rio.");
			break;
			
		case "Dezembro":
		case "dezembro":
		if	(dia <= 21) {	
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Sagit�rio.");
		}	else
			System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de Capric�rnio.");
			break;
			
			default:
				System.out.println("opcao inv�lida");
				break;
			
			
			
			
			
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
