package br.com.utfpr.oo.java.exercicio09;

public class Ex3Array {

	int[] inteiro;
	int atual=0, maximo, media;

	public Ex3Array(int tamanhoArray) {
		inteiro = new int[tamanhoArray];
		maximo = tamanhoArray;
		atual = 0;
	}

	public boolean adicionar(int n) {
		if(atual<maximo) {
			inteiro[atual] = n;
			atual++;
			return true;
		}
		else {
			return false;
		}

	}
	
	public int calculaMedia() {
		for (int i=0; i<maximo; i++) {
			media=media + inteiro[i];
		}
		return media/maximo;
	}
}
