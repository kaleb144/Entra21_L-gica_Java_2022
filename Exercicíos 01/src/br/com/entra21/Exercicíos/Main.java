package br.com.entra21.Exercicíos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculando o IMC = Índice de massa corporea");
		
		float peso,altura;
		double IMC;
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Informe seu peso:");
		peso = entrada.nextFloat();
		
		System.out.println("Informe sua altura:");
		altura = entrada.nextFloat();
		
		IMC = peso / altura;
		
		System.out.println("O seu IMC é de: "+ IMC);
		
		
		
	
		

	}

}
