package Prova2;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numConta, double saldo) {
		super(numConta, saldo);
	}

	@Override
	public void infoConta() {
		System.out.println("INFORMA��O DETALHADA DA CONTA POUPAN�A");
		System.out.println("N�MERO DA CONTA: "+getNumConta());
		System.out.println("SALDO: "+getSaldo());
	}

}
