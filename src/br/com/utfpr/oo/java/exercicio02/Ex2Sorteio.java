package br.com.utfpr.oo.java.exercicio02;

import java.util.Scanner;

public class Ex2Sorteio {

	public static void main(String[] args) {
		
		int min = 0;
		int max = 1000;
		int numero, palpite;
		boolean acertou = false;
		
		Scanner scan = new Scanner(System.in);
		
		numero = (int)(min + Math.random() * (max - min + 1));
		System.out.println(numero);
		
		while(!acertou) {
			System.out.println("Digite um número:");
			
			palpite = scan.nextInt();
			if(numero>palpite) {
				System.out.println("Palpite menor que o número");
			}
			else if(numero<palpite) {
				System.out.println("Palpite maior que o número");
			}
			
			else {
				System.out.println("Você acertou !");
				acertou = true;
			}
			
		}
		scan.close();

	}

}
