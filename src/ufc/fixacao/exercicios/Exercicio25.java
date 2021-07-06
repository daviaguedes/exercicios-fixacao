package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		int soma, s1, s2, s3;
		
		Scanner scan = new Scanner(System.in);
		
		s1= scan.nextInt();
		s2= scan.nextInt();
		s3= scan.nextInt();
		
		soma = s1 + s2 + s3;
		System.out.println(soma);
		
		scan.close();
				
	}

}
