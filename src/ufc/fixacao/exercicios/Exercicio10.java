package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		System.out.println("Digite dois n�meros");
		
		Scanner scan = new Scanner(System.in);
		
		double numero1 = scan.nextDouble();
		double numero2 = scan.nextDouble();
		
		if(numero1 > numero2) {
			System.out.println("O n�mero " + numero1 + " � maior.");
		}
		else {
			System.out.println("O n�mero " + numero2 + " � maior.");
		}
		scan.close();
	}

}
