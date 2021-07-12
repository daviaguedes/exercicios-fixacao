package br.com.utfpr.oo.java.exercicio13;

import java.util.Scanner;

public class Exercicio13 {

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
			try {
			if(numero>palpite) {
				throw new MenorQueException("Número é maior");
			}
			else if(numero<palpite) {
				throw new MaiorQueException("Número é menor");
			}
			
			else {
				System.out.println("Você acertou !");
				acertou = true;
			}
			}catch(MaiorQueException ex) {
				System.out.println("Número é maior");
			}catch(MenorQueException ex) {
				System.out.println("Número é menor");
			}
			
		}
		scan.close();


	}

}
