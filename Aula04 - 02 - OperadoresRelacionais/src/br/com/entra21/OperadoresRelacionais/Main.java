package br.com.entra21.OperadoresRelacionais;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Operadores relacionais");
		
		System.out.println("Menor < (dica voltando ou apagando <<<<<-----  )");
		
		byte idadeA=50,idadeB=51;
		boolean resultado;
		
		resultado = idadeA < idadeB;//idadeA � menor que idadeB ?
		
		System.out.println("idadeA � (<)menor que idadeB ? " +resultado);
		
		System.out.println("idadeA � (<)menor que idadeB ? "+ (idadeA<idadeB));
		
		
		resultado = idadeA <= idadeB;
		
		System.out.println( idadeA+" � (<)menor que "+ idadeB+" ? "+resultado);
		
		System.out.println("Maior > (dica � 'sempre em frente ----->>>>>')");
		
		resultado = idadeA > idadeB;
		
		System.out.println(idadeA+" � maior (>) que "+idadeB+" ? "+resultado);
		
		System.out.println(idadeA+" � maior ou igual (>=) que "+idadeB+" ? "+resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
