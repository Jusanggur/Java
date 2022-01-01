package exercicio1;

public class Main {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Joao", "123.456.789-10");
		Conta conta1 = new ContaPoupanca(pessoa1,12345);
		conta1.depositar(1000);
		conta1.imprimeInfoConta();

		Pessoa pessoa2 = new Pessoa("Maria", "101.112.131-41");
		Conta conta2 = new ContaCorrente(pessoa2,678910);
		conta2.depositar(500);
		conta2.imprimeInfoConta();

	}
}
//SAIDA ESPERADA
//INFORMAÇÃO DETALHADA DA CONTA POUPANÇA
//NOME TITULAR: Joao
//NÚMERO DA CONTA: 12345
//SALDO: 1000.0
//VARIAÇÃO: 51
//INFORMAÇÕES DA CONTA CORRENTE
//NOME TITULAR: Maria
//CPF TITULAR: 101.112.131-41
//NÚMERO DA CONTA: 678910
//SALDO: 500.0