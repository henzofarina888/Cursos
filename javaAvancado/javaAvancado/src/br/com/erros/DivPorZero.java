package br.com.erros;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivPorZero {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		boolean continuar = true;
		do {
			try {
				
		
				System.out.println("NUMERO:");
				int a= ler.nextInt();
		
				System.out.println("DIVISOR:");
				int b= ler.nextInt();
		
				System.out.println("Resultado: "+a/b+"\n");
		}
	
			catch(InputMismatchException e1) {
				System.err.println("favor inserir número inteiro");
			}
			catch(Throwable e2) {
				System.err.println("O divisor deve ser diferente de zero");
			}
			finally {
				System.err.println("finally executando.../ recomeçando...");
			}
		}while(continuar);
	}
}

		
	


