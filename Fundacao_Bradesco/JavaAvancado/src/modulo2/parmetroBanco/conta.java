package modulo2.parmetroBanco;

public class conta {

    String clienteNome;
    double saldo;

    void exibeSaldo(){
        System.out.println("Cliente "+clienteNome+", seu saldo atual é R$"+saldo);

    }
    void saque(double valor){
        saldo -= valor;
    }
    void deposito(double valor){
        saldo+=valor;
    }

    void tranferencia(conta cliente2, double valor){
        this.saque(valor);
        cliente2.deposito(valor);
    }

}
