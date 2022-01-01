package exercicio1;

import java.util.ArrayList;

public class EquacaoSegundoGrau implements Equacao {

	private int a,b,c;

	public EquacaoSegundoGrau(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	private double x,xx;
	
	@Override
	public boolean existemRaizesReais() {
		if(getRaizes().isEmpty()==true) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public void resolver() {
		if(delta()==0) {
			x = -b/(2*a);
		}else if(delta()>0){
			x = (- b - (Math.sqrt(delta()))) / (2*a);
			xx = (- b + (Math.sqrt(delta()))) / (2*a);
		}
	}

	@Override
	public double delta() {
		return (b*b)-4*a*c;
	}

	@Override
	public ArrayList<Double> getRaizes() {
		ArrayList<Double> raizes = new ArrayList<Double>();
		if(delta()<0) {
			return raizes;
		}else if(delta()==0) {
			raizes.add(x);
			return raizes;
		}else {
			raizes.add(x);
			raizes.add(xx);
			return raizes;
		}
	}

}