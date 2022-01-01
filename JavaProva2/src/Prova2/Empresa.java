package Prova2;

public class Empresa implements InfoConta {
	
	private String nomedaempresa, CNPJ; 
	private Conta conta;
	
	public Empresa(String nomedaempresa, String CNPJ) {
		this.nomedaempresa = nomedaempresa;
		this.CNPJ = CNPJ;
	}

	public String getNomedaempresa() {
		return nomedaempresa;
	}

	public void setNomedaempresa(String nomedaempresa) {
		this.nomedaempresa = nomedaempresa;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public void addConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void imprimirInfoConta() {
		getConta().infoConta();
		System.out.println("NOME TITULAR: "+getNomedaempresa());
		System.out.println("CNPJ: "+getCNPJ());
	}
	
}
