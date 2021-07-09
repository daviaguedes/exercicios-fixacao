package br.com.utfpr.oo.java.exercicio09;

public class TesteEx3Array {

	public static void main(String[] args) {
		
		Ex3Array teste = new Ex3Array(4);
		
		System.out.println(teste.adicionar(3));
		System.out.println(teste.adicionar(4));
		System.out.println(teste.adicionar(9));
		System.out.println(teste.adicionar(134));
		System.out.println(teste.adicionar(134));
		
		System.out.println(teste.calculaMedia());

	}

}
