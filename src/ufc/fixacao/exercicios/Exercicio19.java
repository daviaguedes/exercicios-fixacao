package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i< vetor.length ; i++) {
			System.out.println("Digite o " + (i+1) + "º número");
			vetor[i] = scan.nextInt();
		}
		
		for(int i = 0 ; i<vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		scan.close();
	}

}
