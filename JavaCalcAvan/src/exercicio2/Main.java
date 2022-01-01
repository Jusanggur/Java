package exercicio2;

public class Main {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("João", "13.456.789.-10");
		
		CartaoCredito cartao = new CartaoNubank(pessoa, "134567", "10/10", "Elo", "123");
		pessoa.addCartao(cartao);
		
		cartao = new CartaoBancoDoBrasil(pessoa, "1564213", "03/14", "Visa", "123");
		pessoa.addCartao(cartao);
		
		cartao = new CartaoSantader(pessoa, "184123", "06/20", "MasterCard", "123");
		pessoa.addCartao(cartao);
		
		pessoa.listarCartoes();
		
		pessoa.imprimir();
		
	}
}


//Cartão Nubank
//Nome Titular: João
//Número: 134567
//Validade: 10/10
//Dígito Verificador: 123
//Bandeira: Elo
//
//Cartão Banco do Brasil
//Nome Titular: João
//Número: 1564213
//Validade: 03/14
//Dígito Verificador: 123
//Bandeira: Visa
//
//Cartão Santander
//Nome Titular: João
//Número: 184123
//Validade: 06/20
//Dígito Verificador: 123
//Bandeira: MasterCard
//
//Nome: João
//CPF: 13.456.789.-10
//>>> Cartão 01
//Número do Cartão: 134567
//Dígito Verificador: 123
//Validade: 10/10
//>>> Cartão 11
//Número do Cartão: 1564213
//Dígito Verificador: 123
//Validade: 03/14
//>>> Cartão 21
//Número do Cartão: 184123
//Dígito Verificador: 123
//Validade: 06/20