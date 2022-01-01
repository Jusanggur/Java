package exercicio3;

public class Funcionario extends Pessoa {

	private double SalárioBruto, SalarioLiquido, DescontoINSS;
	private int Matricula;

	public Funcionario(String nome, int idade, String sexo, double salárioBruto, int matricula) {
		super(nome, idade, sexo);
		this.SalárioBruto = salárioBruto;
		this.Matricula = matricula;
	}

	public double getSalárioBruto() {
		return SalárioBruto;
	}

	public void setSalárioBruto(double salárioBruto) {
		this.SalárioBruto = salárioBruto;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		this.Matricula = matricula;
	}

	public double getSalarioLiquido() {
		SalarioLiquido = SalárioBruto-DescontoINSS;
		return SalarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.SalarioLiquido = salarioLiquido;
	}

	public double getDescontoINSS() {
		DescontoINSS = SalárioBruto*0.1;
		return DescontoINSS;
	}

	public void setDescontoINSS(double descontoINSS) {
		this.DescontoINSS = descontoINSS;
	}

	public void print() {
		super.print();
		System.out.println("Matrícula: " + getMatricula());
		System.out.println("Salário Bruto: " + getSalárioBruto());
		System.out.println("Desconto INSS: " + getDescontoINSS());
		System.out.println("Salário Líquido: " + getSalarioLiquido());
	}

}
