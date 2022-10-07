package javaAvancado;

public class contaTeste {

	public static void main(String[] args) {
		
		//conta 1.
		conta conta1=new conta();
		conta1.clienteNome="henzo farina";
		conta1.saldo=1738;
		conta1.exibirsaldo();
		//conta 2.
		conta destino= new conta();
		destino.clienteNome="ana paula";
		destino.saldo=3500;
		destino.exibirsaldo();
		
		
		
		System.out.println("saldo sem tranferencia\n");
		
		destino.transferencia(conta1, 2000);
		destino.exibirsaldo();
		System.out.println("^para esse v");
		conta1.exibirsaldo();
		System.out.println("saldo com tranferencia, de Paula para Henzo\n");
		
		
		
		conta1.transferencia2(destino, 1000);
		conta1.exibirsaldo();
		destino.exibirsaldo();
		System.out.println("saldo com tranferencia, de Henzo para Paula\n");
		
		
		
		
		
		
		
		
		
		

		//conta.saque(1000);
		//conta.exibirsaldo();
		
		//conta.deposito(2000);
		//conta.exibirsaldo();
	}

}
