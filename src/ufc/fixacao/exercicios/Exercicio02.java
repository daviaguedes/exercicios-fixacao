package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		
		int numero = scan.nextInt();
		System.out.println("O n�mero informado foi " + numero );
		
		scan.close();

	}

}
