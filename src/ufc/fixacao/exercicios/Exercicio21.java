package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		int multiplicacao, soma;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< vetor.length ; i++) {
			System.out.println("Digite o " + (i+1) + "º número");
			vetor[i] = scan.nextInt();
		}
		scan.close();
		
		for(int j = 0; j< vetor.length; j++) {
			multiplicacao = vetor[j];
			soma = vetor[j];
			for(int k = 0; k< vetor.length; k++) {
			multiplicacao*= vetor[k];
			soma += vetor[k];
			
			System.out.println("A multiplicação entre " + vetor[j] + " e " + vetor[k] + " é " + multiplicacao);
			System.out.println("A soma entre " + vetor[j] + " e " + vetor[k] + " é " + soma);
			multiplicacao = vetor[j];
			soma = vetor[j];
			
			}
			
			System.out.println();
		}

		for(int i = 0; i<vetor.length; i++) {
			System.out.println(vetor[i]);
		}
	}

}
