package br.com.entra21.PráticaOperadoresLógicos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Prática operadores lógicos");
		
		String nomeUsuario = null;
		byte idade=18;
		float altura=1.7f;
		boolean resultado;
		
		resultado = (idade>=18) && (altura>=2.0f);
		System.out.println(nomeUsuario +" É (>) ou (=) a "+altura+ "cm" +" ? " +resultado);
		System.out.println(nomeUsuario + " têm " + idade + " anos"+"."+ " Ele é maior de idade ? "+ resultado );
		
		
		
		
		resultado = (idade<18) || (altura>=2.0f);
		System.out.println(nomeUsuario +" É (>) ou (=) a "+altura+ "cm" +" ? " +resultado);
		System.out.println(nomeUsuario + " têm " + idade + " anos"+"."+ " Ele é maior de idade ? "+ resultado );


   }
}