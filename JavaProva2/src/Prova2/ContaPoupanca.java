package Prova2;

public class ContaPoupanca extends Conta {


	private int variaçao;
	
	public ContaPoupanca(int numConta, double saldo) {
		super(numConta, saldo);
		this.variaçao = 51;
	}

	public int getVariaçao() {
		return variaçao;
	}

	public void setVariaçao(int variaçao) {
		this.variaçao = variaçao;
	}

	@Override
	public void infoConta() {
		System.out.println("INFORMAÇÃO DETALHADA DA CONTA POUPANÇA");
		System.out.println("NÚMERO DA CONTA: "+getNumConta());
		System.out.println("VARIAÇÃO: "+getVariaçao());
		System.out.println("SALDO: "+getSaldo());
	}

}
