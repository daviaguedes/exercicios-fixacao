package br.com.utfpr.oo.java.exercicio11;

import java.util.Scanner;

public class Exericicio11 {

	public static void main(String[] args) {

		int[] decom;
		int primo, numeroPrimo, index=0;
		int contador= 0;
		boolean maior = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o número");
		primo = scan.nextInt();
		numeroPrimo = primo;

		while(!maior) {

			for(int i =2; i<=primo; i++) {

				if(numeroPrimo%i==0) {
					numeroPrimo = numeroPrimo/i;
					contador++;
				}
				if(numeroPrimo==1) {
					maior = true;
				}

			}
		}
		
		maior= false;
		numeroPrimo = primo;
		decom = new int[contador];

		while(!maior) {

			for(int i =2; i<=primo; i++) {

				if(numeroPrimo%i==0) {
					numeroPrimo = numeroPrimo/i;
					decom[index]= i;
					index++;
				}
				if(numeroPrimo==1) {
					maior = true;
				}

			}
		}
		for (int i : decom) {
			System.out.print(i + " ");
		}
		

	}

}
