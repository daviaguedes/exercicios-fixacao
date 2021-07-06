package ufc.fixacao.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		String cpf;
		String[] parts = new String[4];
		String[] teste = new String [3];
		int verificador; 

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o CPF no formato xxx.xxx.xxx-xx");
		cpf = scan.nextLine();

		if(cpf.length() == 14) {
			
			parts[0] = cpf.substring(0, 3);
			parts[1] = cpf.substring(4, 7);
			parts[2] = cpf.substring(8, 11);
			parts[3] = cpf.substring(12,14);
			
			teste[0] = cpf.substring(3, 4);
			teste[1] = cpf.substring(7, 8);
			teste[2] = cpf.substring(11, 12);
			
			try {
			for(int i = 0; i< parts.length; i++) {
				verificador = Integer.parseInt(parts[i]);
			}
			}
			catch(NumberFormatException ex) {
				System.out.println("Digite um número válido.");
				
			}

			if(teste[0].contains(".") && teste[1].contains(".") && teste[2].contains("-")) {
				System.out.println("O CPF foi digitado corretamente.");
			}

			else {
				System.out.println("O CPF foi digitado incorretamente.");
			}
			
		}

	}

}
