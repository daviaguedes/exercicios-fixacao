package br.com.utfpr.oo.java.exercicio05;

import java.util.Scanner;

public class ExecString {

	public static void main(String[] args) {
		
		String primeira, segunda;
		int contador = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira String");
		primeira = scan.nextLine();
		
		System.out.println("Digite a segunda String");
		segunda = scan.nextLine();
		
		String[] novaPrimeira = primeira.split(" ");
		
		for (int i = 0; i< novaPrimeira.length; i++) {
			if(novaPrimeira[i].contains(segunda)) {
			contador++;	
			}
		}
		scan.close();
		System.out.println("A palavra " + segunda + " aparace " + contador + " vezes.");
		char[] a = primeira.toCharArray();
		char[] b = segunda.toCharArray();
		
		System.out.println("A primeira String tem " + a.length + " caracteres.");
		System.out.println("A segunda String tem " + b.length + " caracteres.");
		
	}

}
