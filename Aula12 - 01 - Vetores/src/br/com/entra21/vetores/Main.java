package br.com.entra21.vetores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Aprendendo sobre Vetores
		Scanner inPut = new Scanner(System.in);
		byte option;

		do {
			System.out.println("0- Exit");
			System.out.println("01- Declarando Vetores");
			System.out.println("02- Acessando �ndices");
			System.out.println("03- Atribuindo Valores e �ndices");
			System.out.println("04- M�dias com Valores\n");
			option = inPut.nextByte();

			switch (option) {

			case 0:
				// meu case vazio s� para n�o cair no default porque o zero atende a condi��o no
				// menu
				break;

			case 1:
				// chamada de fun��o
				declararVetores(); // dentro desses paranteses estariam meus argumentos
				break;

			case 2:
				// chama o caso 2 02- Acessando �ndices
				acessarIndices();
				break;

			case 3:
				// Atualizar valores
				atualizarValores();
				break;
			case 4:
				// Atualizar valores
				calcularMediaComVetores();
				break;
			}

		} while (option != 0); // Condi��o atendida enquanto o user n�o digitar 0

	}

	public static void declararVetores() { // aqui dentro do par�nteses est�o os parametros
		System.out.println("Aprendendo sobre Vetores");

		byte idades[]; // Primeiro, criar a vari�vel que � um vetor de algum tipo

		idades = new byte[15]; // Segundo, definir o tamanho

		System.out.println("O tamanho � " + idades.length+"\n"); // Depois, usar ou atualizar

		// como acessar cada posi��o e ver oq tem nela
		float notas[] = { 1, 3.5f, 8 }; // Criei a vari�vel e 2 defini o tamanho e os valores

	}

	public static void acessarIndices() {
		System.out.println("Aprendendo sobre Vetores");

		byte idades[]; // Primeiro, criar a vari�vel que � um vetor de algum tipo

		idades = new byte[15]; // Segundo, definir o tamanho

		System.out.println("O tamanho � " + idades.length); // Depois, usar ou atualizar
		System.out.println("O que tem no indice [1] " + idades[1]);
		System.out.println("O que tem no ultimo indice " + idades[2]+"\n");

	}

	public static void atualizarValores() {
		float notas[] = { 1, 3.5f, 8 }; // Criei a vari�vel e 2 defini o tamanho e os valores
		notas[0] = 33; // manda uma nota para o �ndice "0"
		notas[2] = 12; // manda uma nota para o �ndice "2"
		
	}

	public static void calcularMediaComVetores() {
		Scanner entrada = new Scanner(System.in);
		float notas[] = new float[2];

		for (byte contador = 0; contador < notas.length; contador++) {
			// System.out.println("Contagem em "+contador);
			System.out.println("Informe a " + (contador + 1) + "� nota:");
			notas[contador] = entrada.nextFloat();

		}
		System.out.println("A segunda nota foi " + notas[1]);
		float soma = 0;
		for (byte contador = 0; contador < notas.length; contador++) {
			System.out.println(notas[contador]);
			soma = soma + notas[contador];
		}
		System.out.println("Soma = " + soma);
		System.out.println("M�dia = " + soma / notas.length+"\n");
	}
}