package br.com.entra21.ExercicioAreaPerimetro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que solicite a base e altura de um ret�ngulo e informe sua �rea e perimetro.");
		System.out.println("Sabendo que a �rea � calculada com base no produto entre base e altura");
		System.out.println("O per�metro � obtido ao somar todos os v�rtices do ret�ngulo.");
		
		
		//Criar variaveis
		float base,altura,area,perimetro; //boas praticas nomeclatura
		
		Scanner entrada= new Scanner(System.in);
		
		//definir valores as variaveis
		
		System.out.println("Informe a base do retangulo");
		base= entrada.nextFloat();
		
		System.out.println("Informe a altura do retangulo");
		altura = entrada.nextFloat();
		
		//momento de processamentos...
		area= base * altura;
		perimetro= base * 2 + altura * 2;
		//perimetro= base * (2 + altura) * 2; //faria primeiro a soma entre parenteses
		
		System.out.println("O resultado da �rea �: " +area+" , O resultado do perimetro �: " +perimetro+"." );
		
		
		
		
	
		
		
		
		
		

	}

}
