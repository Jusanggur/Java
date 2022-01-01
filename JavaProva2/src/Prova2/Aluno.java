package Prova2;

public class Aluno extends Pessoa {

	private int matricula;

	public Aluno(String nome, String cpf, int idade, int matricula) {
		super(nome, cpf, idade);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public void infoPessoa() {
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Matrícula: "+getMatricula());
	}

	@Override
	public void imprimirInfoConta() {
		getConta().infoConta();
		System.out.println("NOME TITULAR: "+getNome());
		System.out.println("CPF: "+getCpf());
	}
	
}
