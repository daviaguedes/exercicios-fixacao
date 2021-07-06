package ufc.fixacao.exercicios;

public class Exercicio12 {

	public static void main(String[] args) {
		
		int tabuada= 0;
		for(int i = 0; i<=10; i++) {
			System.out.println();
			for(int j = 1; j<=10; j++) {
				tabuada= i*j;
				System.out.println(i + " X " + j + " = " + tabuada );
			}
		}
			
	}

}
