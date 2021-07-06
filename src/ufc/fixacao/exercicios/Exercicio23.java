package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {

		String[] nomes = new String[2];

		Scanner scan = new Scanner(System.in);

		for(int i = 0; i<nomes.length; i++) {

			nomes[i] = scan.nextLine();

		}
		
		if(nomes[0].chars().count() == nomes[1].chars().count()) {
			System.out.println("Elas tem o mesmo comprimento");
		}
		else {
			System.out.println("Não tem o mesmo comprimento");
		}
		
		if(nomes[0].equals(nomes[1])) {
		System.out.println("Tem o mesmo conteúdo");	
		}
		else {
			System.out.println("Não tem o mesmo conteúdo");
		}
		scan.close();
	}

}
