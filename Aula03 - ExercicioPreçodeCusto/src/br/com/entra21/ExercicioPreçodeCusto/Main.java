package br.com.entra21.ExercicioPre�odeCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Fa�a um programa que solicite o nome e pre�o de custo de um produto qualquer");
		System.out.println("ap�s, processe um aumento de 65% e informe qual ser� o pre�o de venda.");
		
		//criar variaveis
		String nomedoProduto = null;
		float pre�odeCusto = 0f;
		float pre�odeVenda = 0f;
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Informe o nome do produto ?");
		nomedoProduto = entrada.nextLine();
		System.out.println("Qual o valor de custo do produto " +nomedoProduto+ " ?");
		pre�odeCusto= entrada.nextFloat();
		
		pre�odeVenda = pre�odeCusto + (pre�odeCusto * 10/100); //forma longa
		//pre�odeVenda = pre�odeCusto*1.10f
	
		
		pre�odeVenda = pre�odeCusto * 65 / 100 + pre�odeVenda;
		
		System.out.println("Produto: " + nomedoProduto + "\t Pre�odeVenda: " + pre�odeVenda);
		
		
	

	}

}
