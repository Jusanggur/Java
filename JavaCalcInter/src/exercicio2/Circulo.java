package exercicio2;

public class Circulo extends Forma {
	
	public Circulo(int r) {
		super(1);
		setMedida(0, r);
	}

	public double perimetro() {
		return Math.PI*2*getMedida(0);
	}

	public double area() {
		return Math.PI*(getMedida(0)*getMedida(0));
	}

	public String info() {
		return "Círculo";
	}

}
