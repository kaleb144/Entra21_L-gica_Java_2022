package br.com.entra21.exercitando;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Exercitando o conte�do\n");
		byte opcao1;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o programa ?");
		System.out.println();
		System.out.println("1 = Signos");
		System.out.println("2 = Calculadora");
		System.out.println("3 = Contagem regressiva");
		System.out.println("4 = T�buada");
		
		opcao1 = entrada.nextByte();
		
			System.out.println("Signos Vamos l�!! \n ");
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
			System.out.println("Seu nome � "+name+","+" voc� nasceu no dia "+dia+".");
			System.out.println();
			
	
			switch (dia) {
			case 1: 
				System.out.println("O n�mero 1, � considerado o n�mero da lideran�a.\n");
				break;
				
			case 2:
				System.out.println("O n�mero 2, � considerado o n�mero da sabedoria.\n");
				break;
				
			case 3:
				System.out.println("O n�mero 3, � considerado o n�meo do amor, a trindade.\n");
				break;
				
			case 4: 
				System.out.println("O n�mero 4, � considerado o n�mero da fortifica��o interior.\n");
				break;
				
			case 5:
				System.out.println("O n�mero 5, � considerado o n�mero da descobertas sobre a verdade.\n");
				break;
				
			case 6:
				System.out.println("O n�mero 6, � considerado o n�mero do m�sticismo.\n");
				break;
				
			case 7:
				System.out.println("O n�mero 7, � considerado o n�mero da consci�ncia espiritual.\n");
				break;
				
			case 8:
				System.out.println("O n�mero 8, � considerado o n�mero da abund�ncia.\n");
				break;
				
			case 9:
				System.out.println("O n�mero 9, � considerado o n�mero de in�cio de novos ciclos.\n");
				break;
				
			case 10:
				System.out.println("O n�mero 10, � considerado o n�mero dos desejos.\n");
				break;
				
			case 11:
				System.out.println("O n�mero 11, � considerado o n�mero da busca constante por deus.\n");
				break;
				
			case 12:
				System.out.println("O n�mero 12, � considerado o n�mero da descend�ncia pura, eleita por deus.\n");
				break;
				
			case 13:
				System.out.println("O n�mero 13, � o n�mero do rompimento, com tudo que est� inst�vel.\n");
				break;
				
			case 14:
				System.out.println("O n�mero 14, � o n�mero que representa a coragem.\n");
				break;
				
			case 15:
				System.out.println("O n�mero 15, � o n�mero que representa as cons�quencias e a��es.\n");
				break;
				
			case 16:
				System.out.println("O n�mero 16, � o n�mero que representa a perdi��o\n");
				break;
				
			case 17:
				System.out.println("O n�mero 17, � o n�mero que representa o encorajamento.\n");
				break;
				
			case 18:
				System.out.println("O n�mero 18, � o n�mero que representa os medos e inseguran�as.\n");
				break;
				
			case 19:
				System.out.println("O n�mero 19, � o n�mero que representa a intui��o.\n");
				break;
				
			case 20:
				System.out.println("O n�mero 20, � o n�mero que representa o perd�o.\n");
				break;
				
			case 21:
				System.out.println("O n�mero 21, � o n�mero que representa a for�a interior, em busca de seus objetivos\n");
				break;
				
			case 22:
				System.out.println("O n�mero 22, � o n�mero que representa a busca pela harmonia em sua vida.\n");
				break;
				
			case 23:
				System.out.println("O n�mero 23, � o n�mero que representa a confian�a em si mesmo.\n");
				break;
				
			case 24:
				System.out.println("O n�mero 24, � o n�mero que representa o reflexo do outro em voc�.\n");
				break;
				
			case 25:
				System.out.println("O n�mero 25, � o n�mero que representa o desequil�brio.\n");
				break;
				
			case 26:
				System.out.println("O n�mero 26, � o n�mero representa, que voc� deve ter mais cuidado,consigo mesmo.\n ");
				break;
				
			case 27:
				System.out.println("O n�mero 27, � o n�mero que representa a transi��o.\n");
				break;
				
			case 28:
				System.out.println("O n�mero 28, � o n�mero que representa as decis�es futuras.\n");
				break;
				
			case 29:
				System.out.println("O n�mero 29, � o n�mero que representa novas oportunidades.\n");
				break;
				
			case 30:
				System.out.println("O n�mero 30, � o n�mero que representa a articula��o sobre as oportunidades.\n");
				break;
				
			case 31:
				System.out.println("O n�mero 31, � o n�mero que representa a cria��o de sua pr�pria vida.\n");
				break;
			
	}
			System.out.println("Informe seu m�s de nascimento ?");
			String mes;
			Scanner entrada4 = new Scanner(System.in);
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
				System.out.println(name+","+" voc� faz anivers�rio no dia "+dia+" de "+mes+", voc� � do signo de C�ncer,"
						+ " esse signo representa as �guas.");
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
			System.out.println("Calculadora\n");

			Scanner input = new Scanner(System.in);

			float numeroA, numeroB, dividir, multiplicar, somar, subtrair;
			byte opcao2;

			System.out.println("1 = somar\n" + "2 = subtrair\n" + "3 = multiplicar\n" + "4 = dividir\n");
			System.out.println("Escolha a opera��o:");

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
				System.out.println("Resultado subtra��o: " + numeroA + " - " + numeroB + " = " + subtrair);
				break;

			case 3:
				multiplicar = numeroA * numeroB;
				System.out.println("Resultado multiplica��o: " + numeroA + " x " + numeroB + " = " + multiplicar);
				break;

			case 4:
				dividir = numeroA / numeroB;
				System.out.println("Resultado divis�o: " + numeroA + " / " + numeroB + " = " + dividir);
			
			opcao2 = entrada.nextByte();
			
			
}
}
}