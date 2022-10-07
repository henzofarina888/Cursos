package javaAvancado;

public class conta {
	String clienteNome;
	double saldo;
	//classe e seus atributos....
	void exibirsaldo() {
		System.out.println(clienteNome+ " seu saldo é R$"+saldo);
	}
	
	void saque(double valor) {
		saldo-=valor;
	}
	
	void deposito(double valor) {
		saldo +=valor;
	}
	void transferencia2(conta conta1, double valor) {
		this.saque(valor);
		conta1.deposito(valor);
	}
	
	void transferencia(conta destino, double valor) {
		this.saque(valor);
		destino.deposito(valor);
	}
}
