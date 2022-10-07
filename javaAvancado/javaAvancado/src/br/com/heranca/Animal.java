package br.com.heranca;

public class Animal {
	
	double peso;
	String comida;
	String nome;
	
	void dormi() {
		System.out.println("dormiu");
	}
	void fazerBarulho() {
		System.out.println("fazer barulho");
	}
	void comer() {
		System.out.println("Vai comer seu/sua "+ comida);
	}
	void nascerBebe() {
		System.out.println("O bebê de/da "+nome+" nasceu!!!");
	}
}
