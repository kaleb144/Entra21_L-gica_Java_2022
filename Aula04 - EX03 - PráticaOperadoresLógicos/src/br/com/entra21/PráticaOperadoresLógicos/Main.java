package br.com.entra21.Pr�ticaOperadoresL�gicos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Pr�tica operadores l�gicos");
		
		String nomeUsuario = null;
		byte idade=18;
		float altura=1.7f;
		boolean resultado;
		
		resultado = (idade>=18) && (altura>=2.0f);
		System.out.println(nomeUsuario +" � (>) ou (=) a "+altura+ "cm" +" ? " +resultado);
		System.out.println(nomeUsuario + " t�m " + idade + " anos"+"."+ " Ele � maior de idade ? "+ resultado );
		
		
		
		
		resultado = (idade<18) || (altura>=2.0f);
		System.out.println(nomeUsuario +" � (>) ou (=) a "+altura+ "cm" +" ? " +resultado);
		System.out.println(nomeUsuario + " t�m " + idade + " anos"+"."+ " Ele � maior de idade ? "+ resultado );


   }
}