package exercicio2;

public class CartaoNubank implements CartaoCredito {
	
	private Pessoa titular;
	private String numCartao, digVerificador;
	private String bandeira, validade;

	public CartaoNubank(Pessoa titular, String numCartao, String validade, String bandeira,String digVerificador) {
		this.titular = titular;
		this.numCartao = numCartao;
		this.digVerificador = digVerificador;
		this.bandeira = bandeira;
		this.validade = validade;
	}
	public Pessoa getTitular() {
		return titular;
	}
	public void setTitular(Pessoa titular) {
		this.titular = titular;
	}
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getDigVerificador() {
		return digVerificador;
	}
	public void setDigVerificador(String digVerificador) {
		this.digVerificador = digVerificador;
	}
	public String getCardValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getCardBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	@Override
	public String getNomeTitular() {
		return titular.getNome();
	}

	@Override
	public String getNumero() {
		return getNumCartao();
	}

	@Override
	public String getValidade() {
		return getCardValidade();
	}

	@Override
	public String getBandeira() {
		return getCardBandeira();
	}

	@Override
	public String getDigitoVerificador() {
		return getDigVerificador();
	}

	@Override
	public void imprimir() {
		System.out.println("Cart�o Nubank");
		System.out.println("Nome Titular: "+titular.getNome());
		System.out.println("N�mero: "+getNumCartao());
		System.out.println("Validade: "+getCardValidade());
		System.out.println("D�gito Verificador: "+getDigitoVerificador());
		System.out.println("Bandeira: "+getCardBandeira());
		System.out.println("");
	}

}