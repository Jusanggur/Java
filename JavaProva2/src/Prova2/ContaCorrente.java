package Prova2;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numConta, double saldo) {
		super(numConta, saldo);
	}

	@Override
	public void infoConta() {
		System.out.println("INFORMAÇÃO DETALHADA DA CONTA POUPANÇA");
		System.out.println("NÚMERO DA CONTA: "+getNumConta());
		System.out.println("SALDO: "+getSaldo());
	}

}
