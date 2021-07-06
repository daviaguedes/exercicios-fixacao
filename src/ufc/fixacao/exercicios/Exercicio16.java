package ufc.fixacao.exercicios;

public class Exercicio16 {

	public static void main(String[] args) {
		
		int primeiro = 0, segundo = 1, terceiro;
		System.out.print(primeiro + "-" + segundo + "-");
		for(int i = 0; i < 8 ; i++) {
			terceiro = primeiro + segundo;
			primeiro = segundo;
			segundo = terceiro;
			System.out.print(terceiro + "-");
		}
	}

}
