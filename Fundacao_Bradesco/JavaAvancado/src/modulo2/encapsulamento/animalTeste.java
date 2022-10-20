package modulo2.encapsulamento;

public class animalTeste {
    public static void main(String[]args){
        cachorro lulu = new cachorro();
        lulu.comida ="ração";
        lulu.peso=5;
        lulu.latir();
        System.out.println("----------------------");
        galinha cocorico = new galinha();
        cocorico.comida="feno e sementes";
        cocorico.peso=5;
        cocorico.botarOvo();
        cocorico.chocarOvo();
        cocorico.nascer();
        System.out.println("----------------------");
        coruja josi = new coruja();
        josi.comida="frutas e insetos.";
        josi.peso=8;
        josi.fechaOlho();
        josi.abreOlho();
        josi.fechaOlho();
        josi.abreOlho();

    }
}
