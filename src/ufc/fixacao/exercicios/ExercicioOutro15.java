package ufc.fixacao.exercicios;

import java.util.Scanner;

public class ExercicioOutro15 {

	public static void main(String[] args) {
		
		int[] numero = new int[10];
		int primo= 0, quantidadePrimo=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< numero.length; i++ ) {
			
			System.out.println("Digite o " + (i+1) +"º numero");
			numero[i] = scan.nextInt();
			primo=0;
			for(int j = 1; j <= numero[i]; j++) {
				
				if(numero[i]%j == 0) {
					primo++;
				}
				
			}
			if(primo == 2) {
				System.out.println("Esse numéro é primo");
				quantidadePrimo++;
			}
		}
		System.out.println("A quantidade de números primos é " +quantidadePrimo);
	}

}
