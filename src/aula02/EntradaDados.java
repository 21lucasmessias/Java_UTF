package aula02;

import java.util.Scanner;

public class EntradaDados {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		String nome;
		int idade;
		double peso;
				
		System.out.println("Informe sua idade");		
		idade = scanf.nextInt();
		
		scanf.nextLine();
		
		System.out.println("Informe seu nome");		
		nome = scanf.nextLine();
		
		System.out.println("Informe seu peso");		
		peso = scanf.nextDouble();
		
		scanf.close();
	}
}
