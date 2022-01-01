package exercicio1;


public abstract class Conta {
	
	public Pessoa pessoa;
	public double saldo;
	public int numConta;

	public Conta(Pessoa pessoa, int numConta) {
		this.pessoa = pessoa;
		this.numConta = numConta;
	}

	public double verSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public abstract void imprimeInfoConta();
	
}

