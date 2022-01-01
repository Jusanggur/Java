package exercicio1;

public class Aluno extends Pessoa {
	
	public int matricula;
	public Aluno(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula2, int matricula) {
		this.matricula = matricula;
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("Matricula: " + matricula);
	}
}
