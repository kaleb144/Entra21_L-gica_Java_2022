package br.com.entra21.variaveis;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		byte idade;
		idade = 34;

		byte outraidade = 35;

		short ano = 2022;

		short anoPassado;
		anoPassado = 2021;

		System.out.println("Minha idade é " + (idade + outraidade));
		System.out.println("Estamos em " + ano + " e ano passado foi " + anoPassado + ".");

		int habitantesBrasil;
		habitantesBrasil = 212060000;
		
		System.out.println("No Brasil em "+ano+" temos exatamente " +habitantesBrasil+ " habitantes." );
		
		long habitantesTerra1500;
		habitantesTerra1500=790000000;
		
		double habitantesAtualmente =7900000000.00;
		
		float peso = 70.5f, altura= 2.05f;
		
		System.out.println("Meu peso é " +peso+ " kilos"+ ".");
		System.out.println("Minha altura é " +altura+ " metros"+ ".");
		
		char letra='K'; //apenas para 1 carácter
		
		boolean intevaloAntesdasOito=false;
		boolean intervaloAgora=true;
		
		String nomecompleto="";
		
		String nome = null;
		byte minhaIdade = 0;
		float minhaAltura = 0f;
		float salario= 0f;
		
		
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		
	
		System.out.println("Informe o seu nome ?"); 
		nome = entrada.next(); //So para escrita.
		
		System.out.println("Informe a sua idade:");
		minhaIdade = entrada.nextByte(); 
		
		
		System.out.println("Informe sua altura cm");
		minhaAltura= entrada.nextFloat();
		
		System.out.println("Qual seu salario reais");
		salario= entrada.nextFloat();
		
		
		System.out.println("Bem vindo "+nome+"," + " agora consigo interagir com humanos"+"," + " e sei que vc tem " +minhaIdade+ " anos"+".");
		
		nome = JOptionPane.showInputDialog("Informe seu nome completo");
		
		JOptionPane.showMessageDialog(null, "Agora sei que seu nome é " + nome);
		
		minhaIdade = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua idade")
				) ;
				
		salario = Float.parseFloat(
				JOptionPane.showInputDialog("Informe seu salario")
						) ;
				
				JOptionPane.showMessageDialog(null, "Você têm " +minhaIdade+ " anos"+"," + " e está ganhando, "+" R$ " +salario+" reais por mês.");
				
				
		
		//System.out.println("depois");
		
		
		
		
		//control + shift / comenta
		//control + shift \ esconde
		
		
	

	}

}
