package br.com.entra21.aula08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Aprendendo sobre For");
		String opcao;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Sobre o for escolha uma opção para aprender");
		System.out.println("1 - for simples");
		System.out.println("2 - for dentro de for");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");

		opcao = entrada.nextLine();// aceita mais de uma palavra

		switch (opcao.toLowerCase()) {

		case "1", "for simples":
			// funcao aula simples
			aulaForSimples();// funcao do tipo procedimento não tem argumento nem retorno
			break;

		case "2":
			// olha veio por numero
		case "for dentro de for":
			// funcao aula complexa
			aulaForDentroDeFor();// funcao do tipo procedimento não tem argumento nem retorno
			break;

		case "3":
			
		case "4":
			
		case "5":
			
		case "6":

		}

		for (int contador1 = 1; contador1 <= 10; contador1 = contador1 + 1) {

			System.out.println("Repetindo " + contador1);
			System.out.println("-----------");

		}

		for (int contador2 = 1; contador2 <= 10; contador2 += 2) {
			System.out.println("Repetindo " + contador2);
			// System.out.println(contador1);
			// Não é possível usar a variavel contador1 pois ela só existe no outro escopo
			// do for

		}
		for (int contador3 = 4; contador3 <= 10; contador3 += 2) {
			System.out.println("Repetindo " + contador3);
			// System.out.println("------------");
		}
		for (int contador6 = 50; contador6 > -10; contador6--) {
			System.out.println("Contagem regressiva " + contador6);
		}

		System.out.println("Fazer coisas legais que eu não sabia");
		byte fator = 8;
		int contador8;
		int resultado;
		for (contador8 = 1; contador8 < 11; contador8++) {

		}
		for (int contador4 = 10; contador4 > 1; contador4 = contador4 - 1) {
			System.out.println("Repetindo contador4 = " + contador4);
		}

		int numero = 3;
		int contador;

		for (contador = 1; contador <= 10; contador++) {
			System.out.println("Tabuada " + contador + " x " + numero + " = " + (contador * numero));

		}

		System.out.println("Oha como o contador ficou: " + contador);

	}

	private static void aulaForDentroDeFor() {

		System.out.println("Aprendendo sobre FOR da maneira mais complexa");

		byte nivelMaior = 2, nivelDetalhe = 3;

		for (int contador = 1; contador <= nivelMaior; contador++) {
			// no primeiro for devo repetir até a quantidade e nesse caso seria 2x
			System.out.println("Para o nível maior repetindo pela " + contador + " pela primeira vez");

			// porem aqui dentro tem um outro for
			for (int contadorInterno = 1; contadorInterno <= nivelDetalhe; contadorInterno++) {
				// no for interno vou repetir 3x
				System.out.println("\tPara o nivel detalhe repetindo pela " + contadorInterno + "pela primeira vez");
				// minha repeticao interna acaba aqui
			}
			// vou ter que esperar esse for interno acabar para dar a volta no meu for
			// principal
			// até aqui é o primeiro for

		}

	}

	private static void aulaForSimples() {
		// TODO Auto-generated method stub
	}
}
