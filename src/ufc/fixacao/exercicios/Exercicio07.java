package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		System.out.println("Digite o preço dos três produtos: ");
		double preco1, preco2, preco3;
		
		Scanner scan = new Scanner(System.in);
		
		preco1 = scan.nextDouble();
		preco2 = scan.nextDouble();
		preco3 = scan.nextDouble();
		
		if (preco1 < preco2 && preco1 < preco3) {
			System.out.println("Deve escolher o produto 1");
		}
		if (preco2 < preco1 && preco2 < preco3) {
			System.out.println("Deve escolher o produto 2");
		}
		if (preco3 < preco2 && preco3 < preco1) {
			System.out.println("Deve escolher o produto 3");
		}
	}

}
