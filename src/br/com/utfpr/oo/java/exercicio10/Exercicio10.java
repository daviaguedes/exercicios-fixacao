package br.com.utfpr.oo.java.exercicio10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int escolha1, escolha2;
		String numero1="", numero2="";
		boolean positivo1 = false;
		boolean positivo2 = false;
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		while(!positivo1) {
			System.out.println("Digite o primeiro número positivo");
			escolha1= scan.nextInt();
			
			if(lista.get(0)<0) {
				System.out.println("Não é numero positivo");
			}
			else {
				positivo1 = true;
				lista.add(escolha1);
			}
			
		}
		
		while(!positivo2) {
			System.out.println("Digite o segundo número positivo");
			escolha2= scan.nextInt();
			
			if(escolha2<0) {
				System.out.println("Não é numero positivo");
			}
			else {
				lista.add(escolha2);
				positivo2= true;
			}
		}
		
		numero1 = Integer.toString(lista.get(0));
		numero2 = Integer.toString(lista.get(1));
		
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
