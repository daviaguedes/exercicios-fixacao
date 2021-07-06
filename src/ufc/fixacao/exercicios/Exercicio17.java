package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		int soma = 0;
		
		System.out.println("Digite um número inteiro maior que 0");
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
			
		while(numero>0) {
			soma +=(numero%10);
			
			numero = numero/10;
			
		}
		System.out.println("O valor da soma é " + soma);
		scan.close();
	}

}
