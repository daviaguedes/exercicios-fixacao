package br.com.utfpr.oo.java.exercicio01;

import java.util.Scanner;

public class Ex1Primos {

	public static void main(String[] args) {
		
		int numero,primo = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número");
		numero= scan.nextInt();
		
		for(int i = 2; i< numero; i++) {
		if(numero%i==0) {
			primo++;
		}
		
		}
		if(primo>0) {
			System.out.println("Não é primo");
		}else {
			System.out.println("É primo");
		}
		scan.close();

	}

}
