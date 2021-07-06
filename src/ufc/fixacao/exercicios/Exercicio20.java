package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< vetor.length ; i++) {
			System.out.println("Digite o " + (i+1) + "º número");
			vetor[i] = scan.nextInt();
		}
		scan.close();
		
		
		for(int j = (vetor.length -1) ; j >= 0; j--) {
			System.out.print(vetor[j] + " ");
		}
		scan.close();

	}

}
