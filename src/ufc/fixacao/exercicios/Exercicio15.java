package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		int numero=0, primo =0;
		
		System.out.println("Digite um n�mero");
		
		Scanner scan = new Scanner(System.in);
		numero = scan.nextInt();
		
		for(int i = 1; i<=numero; i++) {
			
			if(numero%i==0) {
				primo++;
			}
			
		}
		if(primo>2) {
			System.out.println("N�o � primo.");
		}
		if(primo == 2) {
			System.out.println("� primo.");
		}
		
		
	}

}
