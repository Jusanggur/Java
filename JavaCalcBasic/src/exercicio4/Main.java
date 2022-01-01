package exercicio4;

public class Main {
	
	public static void main(String[] args) {
		
		Conta minhaConta;
		minhaConta = new Conta(12345,"Joao");
		minhaConta.sacar(200);
		minhaConta.depositar(500);
		minhaConta.sacar(200);
		System.out.println(minhaConta.getSaldo());
		minhaConta.imprimir();
	}
	
}
//SAIDA ESPERADA
//O saque se encontra indisponivel
//Deposito efetuado com sucesso
//Saque efetuado com sucesso
//300.0
//Informacoes da Conta
//Tiular: Joao
//Conta: 12345
//Saldo: 300.0