package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		System.out.println("Digite as 2 notas: ");
		Scanner scan = new Scanner(System.in);
		
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media>= 7) {
			System.out.println("Você foi aprovado com a média: " + media);
		}
		else if(media <7 && media >=4){
			System.out.println("AF");
			System.out.println("Digite a nota da AF");
			double notaAF = scan.nextDouble();
			System.out.println("A nota da AF foi " + notaAF);
		}
		else {
			System.out.println("Reprovado com a média: " + media);
		}
		scan.close();
	}

}
