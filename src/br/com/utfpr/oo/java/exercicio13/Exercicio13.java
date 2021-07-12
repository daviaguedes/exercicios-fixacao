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
			System.out.println("Digite um n�mero:");
			
			palpite = scan.nextInt();
			try {
			if(numero>palpite) {
				throw new MenorQueException("N�mero � maior");
			}
			else if(numero<palpite) {
				throw new MaiorQueException("N�mero � menor");
			}
			
			else {
				System.out.println("Voc� acertou !");
				acertou = true;
			}
			}catch(MaiorQueException ex) {
				System.out.println("N�mero � maior");
			}catch(MenorQueException ex) {
				System.out.println("N�mero � menor");
			}
			
		}
		scan.close();


	}

}
