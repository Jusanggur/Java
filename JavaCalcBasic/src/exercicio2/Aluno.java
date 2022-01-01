package exercicio2;

public class Aluno {

	private int Matricula, Telefone;
	private String Email, Nome;
	
	public Aluno(String nome, String email, int telefone, int matricula) {
		this.Matricula = matricula;
		this.Telefone = telefone;
		this.Email = email;
		this.Nome = nome;
	}

	public Aluno() {
		
	}

	public void imprimir() {
		System.out.println("Nome: "+Nome);
		System.out.println("Matrícula: "+Matricula);
		System.out.println("Email: "+Email);
		System.out.println("Telefone "+Telefone);
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}	
	
}