package modulo2.retornoMaior;

public class matematicaTeste {
    public static void main(String[]args){

        matematica ex1 = new matematica();

        int maior = ex1.maior(10,20);
        System.out.println(maior);

        double soma= ex1.soma(100,30);
        System.out.println(soma);

    }
}
