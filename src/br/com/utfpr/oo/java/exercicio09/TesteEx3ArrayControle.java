package br.com.utfpr.oo.java.exercicio09;

import java.util.Scanner;

public class TesteEx3ArrayControle {

	public static void main(String[] args) {

		int numero;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o tamanho do Array");
		int tamanho= scan.nextInt();
		Ex3ArrayControle array = new Ex3ArrayControle(tamanho);

		for(int i = 0; i<tamanho; i++) {
			System.out.println("Digite o número");
			numero = scan.nextInt();
			array.adicionar(numero);
		}
		System.out.println(array.calculaMedia());
		scan.close();
	}
}
