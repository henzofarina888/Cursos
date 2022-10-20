package modulo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dividirPorZero {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                System.out.println("numero:");
                int a = ler.nextInt();

                System.out.println("divisor:");
                int b = ler.nextInt();

                System.out.println(a / b);
                continuar = false;

            } catch (InputMismatchException e1) {
                System.err.println("PorFavor Números Inteiros.");
            } catch (Throwable e2) {
                System.err.println("O Divisor deve ser diferente de Zero;");
            } finally {
                System.err.println("Finally executando...");
            }
        } while (continuar);
    }
}