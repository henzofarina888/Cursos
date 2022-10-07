package javaAvancado;

public class matematicateste {

	public static void main(String[] args) {

		matematica m = new matematica();
		int maior = m.maior(2000,300);
		System.out.println(maior);
		
		double soma= m.soma(200, 30);
		System.out.println(soma);
	}

}
