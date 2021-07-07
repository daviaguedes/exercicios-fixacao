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
			System.out.println("Digite um n�mero:");
			
			palpite = scan.nextInt();
			if(numero>palpite) {
				System.out.println("Palpite menor que o n�mero");
			}
			else if(numero<palpite) {
				System.out.println("Palpite maior que o n�mero");
			}
			
			else {
				System.out.println("Voc� acertou !");
				acertou = true;
			}
			
		}
		scan.close();

	}

}
