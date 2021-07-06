package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		System.out.println("Digite um número inteiro: ");
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		if(numero%2 == 0) {
			System.out.println("O número " + numero + " é par.");
		}
		
		else{
			System.out.println("O número " + numero + " é impar.");
		}
		
		scan.close();
	}

}
