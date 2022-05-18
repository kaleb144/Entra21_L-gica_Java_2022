package br.com.entra21.praticaemsala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		byte option;

		do {
			System.out.println("Escolha uma das op��es: ");
			System.out.println(
					"0 - sair \n1 - Calcular soma \n2 - Repetir 20 vezes \n3 - Entre 20 pessoas e exiba a soma das idades \n4 - Quantas pessoas s�o maiores de idade \n5 - Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova \n6 - \n7 - \n8 - Capture N n�meros acumule a soma e s� para quando for informado um n�mero negativo \n9 - Escreva um algoritmo que solicite a quantidade de notas e calcule a m�dia do aluno");

			option = input.nextByte();
			switch (option) {
			case 0:
				System.out.println("Saindo...");
				break;

			case 1:

				runsoma();
				break;

			case 2:

				runRepeat20();

				break;

			case 3:
				sumAge();
				break;

			case 4:
				maioresDeIdade();
				break;

			case 5:
				exibirMaisNovo1();
				break;
				
			case 8:
				exerciseOito();
				break;

			case 9:
				mediaAlunos();

				break;

			default:
				System.out.println("Escolha uma op��o v�lida!");
				break;

			}

		} while (option != 0);
		System.out.println("Obrigado por usar o programa de lista de exercicios!");
	}

	private static void mediaAlunos() {
		Scanner input = new Scanner(System.in);
		byte qtd, contador = 0;
		float nota, soma = 0f;
		System.out.println("Quantas notas vc quer capturar?");
		qtd = input.nextByte();
		String resposta;

		do {
			contador++;
			System.out.println("Informe uma nota");
			nota = input.nextFloat();
			if (contador >= qtd) {
				System.out.println("Quer capturar mais alguma nota?");
				resposta = input.next();
				if (resposta.equals("sim")) {
					contador--;
				}
			}

			soma = soma + nota;
		} while (contador <= qtd);
		System.out.println("Soma =" + soma);
	}

	private static void maioresDeIdade() {
		System.out.println("Exibir apenas os maiores de idade");
		byte maiores = 0;
		byte idade, cont;
		Scanner input = new Scanner(System.in);
		for (cont = 1; cont <= 20; cont++)
			;
		System.out.println("Informe a idade da primeira pessoa: ");
		idade = input.nextByte();
		if (idade >= 18) {
			maiores++;
			System.out.println("A �ltima pessoa informada era de maior.");
		}

		System.out.println("Entre " + (cont - 1) + " pessoas, apenas " + maiores + " s�o maiores de idade.");

	}

	private static void sumAge() {
		int sumAge = 0;
		byte age;
		Scanner input = new Scanner(System.in);

		for (byte count = 1; count <= 5; count++) {
			System.out.println("No momento a soma est� em " + sumAge);
			System.out.println("Por favor, insira a idade: ");
			age = input.nextByte();
			sumAge = sumAge + age;

		}
		System.out.println("A soma total das idades foi " + sumAge);
	}

	private static void runRepeat20() {
		for (byte cont = 1; cont <= 20; cont++) {
			System.out.println("Eu gosto de algoritmos " + (cont % 5 == 0 ? "\n" : ""));
			if (cont % 5 == 0) {
				System.out.println("\n");
			}

		}

	}

	private static void exibirMaisNovo1() {
		Scanner input = new Scanner(System.in);
		String name, youngerName = "";
		byte age, ageMinimal = 0;

		for (byte count = 1; count <= 10; count++) {

			System.out.println("Digite seu nome: ");
			name = input.next();
			System.out.println(name + " por favor, Digite sua idade: ");
			age = input.nextByte();
			// no primeiro la�o sempre a primeira idade vai ser a menor
			if (count == 1) {
				ageMinimal = age;
				youngerName = name;
				System.out.println("Sou o primeiro e por isso sou o mais novo " + name + " " + age);
			} else {
				// a partir do segundo la�o j� tenho como comparar com "ageMinimal"
				System.out.println("Estou no la�o " + count + " e preciso verificar");
				if (age < ageMinimal) {
					System.out.println(
							"Ainda bem que testei porque a pessoa mais nova � " + name + " com " + age + " anos");
					ageMinimal = age;
					youngerName = name;
				}

			}

		}
		System.out.println("Ap�s isso tudo o mais novo �: " + youngerName + " " + ageMinimal);

	}

	private static void runsoma() {
		int soma = 0;
		for (byte cont = 1; cont <= 15; cont++) {
			System.out
					.println("Soma = soma + counter, " + soma + " = " + soma + " + " + cont + " ==> " + (soma + cont));
			soma = (byte) (soma + cont);
		}

	}

	private static void calculandoSoma() {
		System.out.println("CALCULANDO A SOMA");
		byte soma = 0;
		for (byte counter = 1; counter <= 15; counter++) {
			System.out.println(
					"Soma = soma + counter,  " + soma + " = " + soma + " + " + counter + " ==> " + (soma + counter));
			soma = (byte) (soma + counter);

		}
	}
    public static void exerciseOito() {

    	 

        // Escreva um algoritmo que leia uma sequ�ncia de n�meros do usu�rio e realize a
        // soma desses n�meros. Encerre a execu��o quando um n�mero negativo for
        // digitado.

 

        Scanner inPut = new Scanner(System.in);
        int number, sum = 0; // se n�o inicializa um valor na v�riavel ela fica com lixo da mem�ria.

 

        do {

 

            System.out.println("What number do you want?");
            number = inPut.nextInt();
            if (number >= 0) {
                sum = sum + number;
            } // somente n�meros positivos ser�o somados, ou n�meros naturais.

 

        } while (number >= 0); // enquanto o n�mero for maior que zero repita

 

        System.out.println("Your sum is: " + sum);

 

    }
}
