package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		int valor1, valor2, operacao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite os valores para soma");
		valor1= scan.nextInt();
		valor2= scan.nextInt();
		
		System.out.println("Digite o sinal para a operação desejada. ");
		String sinal = scan.next();
		if(sinal == "+") {
			operacao = valor1+valor2;
		}
		if(sinal == "-") {
			operacao = valor1-valor2;
		}
		if(sinal == "/") {
			operacao = valor1/valor2;
		}
		if(sinal == "*") {
			operacao = valor1*valor2;
		}
		
		scan.close();
	}

}
