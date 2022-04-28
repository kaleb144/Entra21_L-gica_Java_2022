package br.com.entra21.ExercicioPreçodeCusto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Faça um programa que solicite o nome e preço de custo de um produto qualquer");
		System.out.println("após, processe um aumento de 65% e informe qual será o preço de venda.");
		
		//criar variaveis
		String nomedoProduto = null;
		float preçodeCusto = 0f;
		float preçodeVenda = 0f;
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Informe o nome do produto ?");
		nomedoProduto = entrada.nextLine();
		System.out.println("Qual o valor de custo do produto " +nomedoProduto+ " ?");
		preçodeCusto= entrada.nextFloat();
		
		preçodeVenda = preçodeCusto + (preçodeCusto * 10/100); //forma longa
		//preçodeVenda = preçodeCusto*1.10f
	
		
		preçodeVenda = preçodeCusto * 65 / 100 + preçodeVenda;
		
		System.out.println("Produto: " + nomedoProduto + "\t PreçodeVenda: " + preçodeVenda);
		
		
	

	}

}
