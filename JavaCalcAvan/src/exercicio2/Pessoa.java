package exercicio2;

import java.util.ArrayList;

public class Pessoa {

	private String nome, cpf;
	private ArrayList<CartaoCredito> cartoes = new ArrayList<CartaoCredito>();

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void addCartao(CartaoCredito cartao) {
		cartoes.add(cartao);
	}

	public void listarCartoes() {
		for(int i=0;i<cartoes.size();i++) {
			cartoes.get(i).imprimir();
		}
	}
	
	public void imprimir() {
		System.out.println("Nome: "+getNome());
		System.out.println("CPF: "+getCpf());
		for(int i=0;i<cartoes.size();i++) {
			System.out.println(">>> Cartão "+i+"1");
			System.out.println("Número do Cartão: "+cartoes.get(i).getNumero());
			System.out.println("Dígito Verificador: "+cartoes.get(i).getDigitoVerificador());
			System.out.println("Validade: "+cartoes.get(i).getValidade());
		}
	}
	
}