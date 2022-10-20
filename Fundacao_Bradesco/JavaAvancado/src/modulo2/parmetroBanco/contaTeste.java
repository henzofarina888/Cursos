package modulo2.parmetroBanco;

import modulo2.parmetroBanco.conta;

public class contaTeste {
    public static void main(String[]args){
        conta cliente1 = new conta();
        cliente1.clienteNome ="Henzo Farina";
        cliente1.saldo= 2500;
        cliente1.exibeSaldo();

        //cliente1.deposito(1000);
        //cliente1.exibeSaldo();

        //cliente1.saque(2000);
        //cliente1.exibeSaldo();

        conta cliente2 = new conta();
        cliente2.clienteNome ="Ana Paula";
        cliente2.saldo= 5500;
        cliente2.exibeSaldo();

        //origem              destino
        cliente1.tranferencia(cliente2, 100);
        cliente1.exibeSaldo();
        cliente2.exibeSaldo();




        /*
        modulo2.parmetroBanco.conta cliente3 = new modulo2.parmetroBanco.conta();
        cliente3.clienteNome ="Giovanna Dias";
        cliente3.saldo= 15000;
        cliente3.exibeSaldo();
        */

    }

}
