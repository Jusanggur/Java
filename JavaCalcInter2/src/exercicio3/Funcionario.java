package exercicio3;

public abstract class Funcionario {
	private double salario;
	private String nome;
	private String departamento;	
	
	public Funcionario(double salario, String nome, String departamento) {
		this.salario = salario;
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public abstract double calculaBonificacao();

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimir() {
		System.out.println("Nome: "+ nome );
		System.out.println("Salário: " + salario);
		System.out.println("Bonificação: " + calculaBonificacao());
		System.out.println("Departamento: "+ departamento);
	}
}
