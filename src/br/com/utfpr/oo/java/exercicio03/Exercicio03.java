package br.com.utfpr.oo.java.exercicio03;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		boolean positivo1 = false;
		boolean positivo2 = false;
		int escolha1 = 0, escolha2 = 0;
		String numero1,numero2 ;
		Scanner scan = new Scanner(System.in);
		
		while(!positivo1) {
			System.out.println("Digite o primeiro número positivo");
			escolha1= scan.nextInt();
			
			if(escolha1<0) {
				System.out.println("Não é numero positivo");
			}
			else {
				positivo1 = true;
			}
			
		}
		
		while(!positivo2) {
			System.out.println("Digite o segundo número positivo");
			escolha2= scan.nextInt();
			
			if(escolha2<0) {
				System.out.println("Não é numero positivo");
			}
			else {
				positivo2= true;
			}
		}
		
		numero1 = Integer.toString(escolha1);
		numero2 = Integer.toString(escolha2);
		
		char[] algarismos1 = numero1.toCharArray();
		char[] algarismos2 = numero2.toCharArray();
		
		Arrays.sort(algarismos1);
		Arrays.sort(algarismos2);
		
		if (Arrays.equals(algarismos1, algarismos2)) {
			System.out.println("É um anagrama");
		} else {
			System.out.println("Não é anagrama");
		}
		scan.close();
		
	}

}

