package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor em metros: ");
		
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextDouble();

		valor = valor *100;
		
		System.out.println("O valor em centímetros é " + valor + " centímetros.");
	}

}
