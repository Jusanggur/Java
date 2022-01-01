package exercicio3;

public class Gerente extends Funcionario {

	private String NomedaGerencia;

	public Gerente(String nome, int idade, String sexo, double sal�rioBruto, int matricula, String nomedaGerencia) {
		super(nome, idade, sexo, sal�rioBruto, matricula);
		this.NomedaGerencia = nomedaGerencia;
	}

	public String getNomedaGerencia() {
		return NomedaGerencia;
	}

	public void setNomedaGerencia(String nomedaGerencia) {
		this.NomedaGerencia = nomedaGerencia;
	}

	public void print() {
		super.print();
		System.out.println("Nome da Ger�ncia: " + getNomedaGerencia());
	}

}