package br.com.utfpr.oo.java.exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		String nome, nomeFinal ="";
		char[] a;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		nome = scan.nextLine();
		String[] novoNome = nome.split(" ");
		
		for (int i = 0; i<novoNome.length; i++) {
			a = novoNome[i].toCharArray();
			
			if(a.length>2) {
			nomeFinal = nomeFinal + a[0] + ". " ;
			}
			else {
				nomeFinal = nomeFinal + a[0] + a[1] + " ";
			}
		}
		System.out.println(nomeFinal);
		scan.close();
	}

}
