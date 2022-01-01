package exercicio3;

public class Cliente extends Pessoa {


	private double ValordaDívida;
	private int AnodeNascimento;

	public Cliente(String nome, int idade, String sexo, double valordaDívida, int anodeNascimento) {
		super(nome, idade, sexo);
		this.ValordaDívida = valordaDívida;
		this.AnodeNascimento = anodeNascimento;
	}

	public double getValordaDívida() {
		return ValordaDívida;
	}

	public void setValordaDívida(double valordaDívida) {
		this.ValordaDívida = valordaDívida;
	}

	public int getAnodeNascimento() {
		return AnodeNascimento;
	}

	public void setAnodeNascimento(int anodeNascimento) {
		this.AnodeNascimento = anodeNascimento;
	}

	public void print() {
		super.print();
		System.out.println("Valor da dívida: " + getValordaDívida());
		System.out.println("Ano de Nascimento: " + getAnodeNascimento());
	}

}
