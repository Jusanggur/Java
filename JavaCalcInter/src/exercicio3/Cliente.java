package exercicio3;

public class Cliente extends Pessoa {


	private double ValordaD�vida;
	private int AnodeNascimento;

	public Cliente(String nome, int idade, String sexo, double valordaD�vida, int anodeNascimento) {
		super(nome, idade, sexo);
		this.ValordaD�vida = valordaD�vida;
		this.AnodeNascimento = anodeNascimento;
	}

	public double getValordaD�vida() {
		return ValordaD�vida;
	}

	public void setValordaD�vida(double valordaD�vida) {
		this.ValordaD�vida = valordaD�vida;
	}

	public int getAnodeNascimento() {
		return AnodeNascimento;
	}

	public void setAnodeNascimento(int anodeNascimento) {
		this.AnodeNascimento = anodeNascimento;
	}

	public void print() {
		super.print();
		System.out.println("Valor da d�vida: " + getValordaD�vida());
		System.out.println("Ano de Nascimento: " + getAnodeNascimento());
	}

}
