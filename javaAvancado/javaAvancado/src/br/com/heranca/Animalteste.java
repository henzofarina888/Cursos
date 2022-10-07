package br.com.heranca;

public class Animalteste {

	public static void main(String[] args) {

		Cachorro lulu = new Cachorro();
		lulu.comida ="ração";
		lulu.peso=14;
		System.out.println("O Cachorro lulu:");
		lulu.dormi();
		lulu.fazerBarulho();
		lulu.comer();
		
		Galinha cocorico = new Galinha();
		cocorico.comida ="feno";
		System.out.println("\nA Galinha cocorico:");
		cocorico.dormi();
		cocorico.comer();
		
		
		System.out.println("\nA Coruja Zé:");
		coruja ze= new coruja();
		ze.nome="Zé";
		ze.comida="inseto";
		ze.corPenas="cinzas";
		ze.peso=10;
		ze.velocidadeMaxima= 72;
		ze.comer();
		ze.botar();
		ze.dormi();
		ze.fazerBarulho();
		ze.nascerBebe();
		
		
	}

}
