package exercicio2;

public class Retangulo extends Forma {
	public Retangulo(int b,int h) {
		super(2);
		setMedida(0, b);
		setMedida(1, h);
	}

	public double perimetro() {
		return 2*getMedida(0)+2*getMedida(1);
	}

	public double area() {
		return getMedida(0)*getMedida(1);
	}

	public String info() {
		return "Retângulo";
	}

}


