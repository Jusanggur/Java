package exercicio1;

public class ContaPoupanca extends Conta {
private int variacao;

	
	public ContaPoupanca(Pessoa pessoa, int numConta) {
		super(pessoa, numConta);
		variacao = 51;
	}

	@Override
	public void imprimeInfoConta() {
		// TODO Auto-generated method stub
		System.out.println("INFORMAÇÃO DETALHADA DA CONTA POUPANÇA");
		System.out.println("NOME TITULAR: "+pessoa.getNome());
		System.out.println("NÚMERO DA CONTA: "+numConta);
		System.out.println("SALDO: "+verSaldo());
		System.out.println("VARIAÇÃO: "+variacao);
	}

}

