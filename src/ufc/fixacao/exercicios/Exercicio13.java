package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		boolean valido = true;
		double nota = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(valido) {
			
			System.out.println("Digite o valor da nota:" );
			
			nota = scan.nextDouble();
			
			if(nota < 0 || nota > 10) {
				System.out.println("Valor inválido.");
			}
			
			else {
				valido= false;
			}
		}
		
		System.out.println("A nota é " + nota);
		scan.close();

	}

}
