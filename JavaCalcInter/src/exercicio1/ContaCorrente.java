package exercicio1;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Pessoa pessoa, int numConta) {
		super(pessoa, numConta);
	}

	@Override
	public void imprimeInfoConta() {
		// TODO Auto-generated method stub
		System.out.println("INFORMA��ES DA CONTA CORRENTE");
		System.out.println("NOME TITULAR: "+pessoa.getNome());
		System.out.println("CPF TITULAR: "+pessoa.getCpf());
		System.out.println("N�MERO DA CONTA: "+numConta);
		System.out.println("SALDO: "+verSaldo());

	}

}
