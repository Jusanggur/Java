package Prova2;

public class Professor extends Pessoa {

	private String disciplina;

	public Professor(String nome, String cpf, String disciplina, int idade) {
		super(nome, cpf, idade);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public void infoPessoa() {
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Profissão: Professor de "+getDisciplina());
	}

	@Override
	public void imprimirInfoConta() {
		getConta().infoConta();
		System.out.println("NOME TITULAR: "+getNome());
		System.out.println("CPF: "+getCpf());
	}
	
}
