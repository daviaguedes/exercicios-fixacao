package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		System.out.println("Digite 3 notas: ");
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		System.out.println("A média é " + media);
		
		scan.close();
	}

}
