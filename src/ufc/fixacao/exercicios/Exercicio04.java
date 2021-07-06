package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		System.out.println("Digite a nota e peso 1:");
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double peso1 = scan.nextDouble();

		System.out.println("Digite a nota e peso 2:");
		double nota2 = scan.nextDouble();
		double peso2 = scan.nextDouble();
		
		double media = ((nota1*peso1)+(nota2*peso2))/(peso1+peso2);
		
		System.out.println("A média é " + media);
		
		scan.close();
	}

}
