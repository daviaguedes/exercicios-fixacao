package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		int fatorial =1;
		
		System.out.println("Digite um número inteiro positivo");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		for(int i = 1; i<numero ; numero--) {
		 fatorial *= numero;
		}
		
		System.out.println(fatorial);
		scan.close();
	}

}
