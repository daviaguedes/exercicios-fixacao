package br.com.utfpr.oo.java.exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		String frase, fraseFinal = "";
		int codigo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		frase= scan.nextLine();
		
		System.out.println("Digite um número para código");
		codigo = scan.nextInt();

		char[] a = frase.toCharArray();
		
		for(int i = 0; i < a.length; i++) {
			fraseFinal = fraseFinal + Character.toString((a[i]+codigo));
		}
			System.out.println(fraseFinal);

	}

}
