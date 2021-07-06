package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		int algarismo1, algarismo2, algarismo3;
		
		System.out.println("Digite um número");
		
		Scanner scan = new Scanner(System.in);
		
		int numero = scan.nextInt();
		
		algarismo3 = numero%10;
		algarismo2 = (numero/10)%10;
		algarismo1 = (numero/100)%10;
		
		String s = Integer.toString(algarismo3) + Integer.toString(algarismo2) + Integer.toString(algarismo1); 
		
		System.out.println(s);
		scan.close();
	}

}
