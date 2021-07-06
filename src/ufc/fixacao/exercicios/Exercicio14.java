package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		int candidato1 = 0, candidato2 = 0, candidato3 = 0;
		int eleitores = 0;
		int voto=0;
		System.out.println("Digite o número de eleitores");
		Scanner scan = new Scanner(System.in);
		
		eleitores = scan.nextInt();
		
		for(int i = 1; i<=eleitores; i++) {
			System.out.println("Eleitor " + i + " digite o número do candidato que deseja votar:");
			
			voto= scan.nextInt();
			if(voto == 1) {
				candidato1++;
			}
			if(voto ==2) {
				candidato2++;
			}
			if(voto ==3) {
				candidato3++;
			}
		}
		System.out.println("A quantidade de votos do candidato 1 é " + candidato1);
		System.out.println("A quantidade de votos do candidato 2 é " + candidato2);
		System.out.println("A quantidade de votos do candidato 3 é " + candidato3);
	}

}
