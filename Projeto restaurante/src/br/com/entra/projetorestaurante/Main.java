package br.com.entra.projetorestaurante;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			byte option;
			
			do {
				
				System.out.println("Digite a opção desejada!!");
				System.out.println();
				System.out.println("----------------------------------");
				System.out.println("| 1 - Cadastramento              |");
				System.out.println("|                                |");
				System.out.println("| 2 - Pesquisa gastronômicas     |");
				System.out.println("|                                |");
				System.out.println("| 3 - Prefêrencias gastronômicas |");
				System.out.println("----------------------------------");
				System.out.println();
				
				
				option = input.nextByte();
				
				switch (option) {
				
				case 1:
					cadastrAmento();
					break;
					
				case 2:
					pesGastro();
					break;
					
				case 3:
					prefGastro();
					break;
					
				default:
					System.out.println("Escolha uma opção válida!!");
					break;
					
					
				}
				
				
			} while (option != 0); 

	
	
	
		
		}

	private static void prefGastro() {
		// TODO Auto-generated method stub
		
	}

	private static void pesGastro() {
		// TODO Auto-generated method stub
		
	}

	private static void cadastrAmento() {
		
		
		Scanner input = new Scanner(System.in);
		String name,cidade,bairro,end,youngerName = "";
		byte age, ageMinimal = 0,numero;
		float telefone,cep,cpf;
		
		System.out.println("Vamos cadastrar!!\n");
		System.out.println("");
		System.out.println("Por favor digite seu nome: ");
		name = input.next();
		System.out.println();
		System.out.println(name + " Agora digite sua idade: ");
		age = input.nextByte();
		System.out.println("Informe seu telefone: ");
		telefone = input.nextFloat();
		System.out.println("Informe seu CPF: ");
		cpf = input.nextFloat();
		System.out.println("Informe o nome da sua cidade: ");
		cidade = input.next();
		System.out.println("Informe qual seu bairro:");
		bairro = input.next();
		System.out.println("Confira seu cadastro!!");
		System.out.println();
		System.out.println("Seu nome é "+name);
		System.out.println("portador do CPF "+cpf);		
		System.out.println("Você têm "+age+" anos" );
	
	
	
	}
}			
				
				
				
				
