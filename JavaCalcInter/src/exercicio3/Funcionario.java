package exercicio3;

public class Funcionario extends Pessoa {

	private double Sal�rioBruto, SalarioLiquido, DescontoINSS;
	private int Matricula;

	public Funcionario(String nome, int idade, String sexo, double sal�rioBruto, int matricula) {
		super(nome, idade, sexo);
		this.Sal�rioBruto = sal�rioBruto;
		this.Matricula = matricula;
	}

	public double getSal�rioBruto() {
		return Sal�rioBruto;
	}

	public void setSal�rioBruto(double sal�rioBruto) {
		this.Sal�rioBruto = sal�rioBruto;
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		this.Matricula = matricula;
	}

	public double getSalarioLiquido() {
		SalarioLiquido = Sal�rioBruto-DescontoINSS;
		return SalarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.SalarioLiquido = salarioLiquido;
	}

	public double getDescontoINSS() {
		DescontoINSS = Sal�rioBruto*0.1;
		return DescontoINSS;
	}

	public void setDescontoINSS(double descontoINSS) {
		this.DescontoINSS = descontoINSS;
	}

	public void print() {
		super.print();
		System.out.println("Matr�cula: " + getMatricula());
		System.out.println("Sal�rio Bruto: " + getSal�rioBruto());
		System.out.println("Desconto INSS: " + getDescontoINSS());
		System.out.println("Sal�rio L�quido: " + getSalarioLiquido());
	}

}
