package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		int[] vetor = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int indexPar =0;
		int indexImpar=0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<vetor.length; i++) {
			System.out.println("Digite o n�mero " + (i+1) +"�");
			vetor[i]= scan.nextInt();
			
		}
		
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i]%2==0) {
				par[indexPar]=vetor[i];
				indexPar++;
			}
			else{
				impar[indexImpar]=vetor[i];
				indexImpar++;
			}
		}
		
		for(int i = 0; i<vetor.length; i++) {
		System.out.println("Total: " + vetor[i] + " Pares: " + par[i] + " �mpar: " + impar[i]);	
		}
		scan.close();
		
	}

}
