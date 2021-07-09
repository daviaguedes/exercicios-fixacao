package br.com.utfpr.oo.java.exercicio09;

public class Ex3ArrayControle {

	int[] inteiro;
	int atual, maximo, media;

	public Ex3ArrayControle(int tamanhoArray) {
		inteiro = new int[tamanhoArray];
		maximo = tamanhoArray;
		
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
