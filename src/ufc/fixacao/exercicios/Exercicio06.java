package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[] args) {
		
		System.out.println("Digite o valor do raio: ");
		
		Scanner scan = new Scanner(System.in);
		
		double raio = scan.nextDouble();
		
		double area = Math.PI*(Math.pow(raio, 2));
		
		System.out.println("O valor da área é " + area);
		scan.close();
	}
}
