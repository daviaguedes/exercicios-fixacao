package br.com.utfpr.oo.java.exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		String nome= "", nomeInvertido = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um nome ou frase");
		nome = scan.nextLine();
		
		char[] invertido = nome.toCharArray();
		
		System.out.println(invertido.length);
		
		for(int i = invertido.length -1; i>=0; i--) {
			nomeInvertido = nomeInvertido + invertido[i];
		}
		scan.close();
		System.out.println(nomeInvertido);
	}

}
