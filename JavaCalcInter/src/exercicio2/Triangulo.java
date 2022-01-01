package exercicio2;

public class Triangulo extends Forma {
	public Triangulo(int l1,int l2, int l3) {
		super(3);
		setMedida(0, l1);
		setMedida(1, l2);
		setMedida(2, l3);
	}

	public double perimetro() {
		if((getMedida(0)+getMedida(1)>=getMedida(2))&&(getMedida(0)+getMedida(2)>=getMedida(1))&&(getMedida(1)+getMedida(2)>=getMedida(0))) {
			return getMedida(0)+getMedida(1)+getMedida(2);
		}else {
			return -1;
		}
	}

	public double area() {
		if((getMedida(0)+getMedida(1)>getMedida(2))&&(getMedida(0)+getMedida(2)>getMedida(1))&&(getMedida(1)+getMedida(2)>getMedida(0))) {
			//Tri�ngulo Equil�tero
			if((getMedida(0)==getMedida(1))&&(getMedida(0)==getMedida(2))) {
				return ((getMedida(0)*getMedida(0))*Math.sqrt(3))/4;
			}
			//Tri�ngulo Is�sceles
			else if((getMedida(0)==getMedida(1))&&(getMedida(0)!=getMedida(2))&&(getMedida(1)!=getMedida(2))){
				return (getMedida(2)*Math.sqrt((getMedida(0)*getMedida(0))-((getMedida(2)/2)*(getMedida(2)/2))))/2;
			}
			//Tri�ngulo Is�sceles
			else if((getMedida(0)!=getMedida(1))&&(getMedida(0)==getMedida(2))&&(getMedida(1)!=getMedida(2))){
				return (getMedida(1)*Math.sqrt((getMedida(2)*getMedida(2))-((getMedida(1)/2)*(getMedida(1)/2))))/2;
			}
			//Tri�ngulo Is�sceles
			else if((getMedida(0)!=getMedida(1))&&(getMedida(0)!=getMedida(2))&&(getMedida(1)==getMedida(2))){
				return (getMedida(0)*Math.sqrt((getMedida(1)*getMedida(1))-((getMedida(0)/2)*(getMedida(0)/2))))/2;
			}
			//Tri�ngulo Escaleno
			else {
				return Math.sqrt((perimetro()/2)*((perimetro()/2)-getMedida(0))*((perimetro()/2)-getMedida(1))*((perimetro()/2)-getMedida(2)));
			}
		}else {
			return -1;
		}
	}

	public String info() {
		if((getMedida(0)+getMedida(1)>getMedida(2))&&(getMedida(0)+getMedida(2)>getMedida(1))&&(getMedida(1)+getMedida(2)>getMedida(0))) {
			if((getMedida(0)==getMedida(1))&&(getMedida(0)==getMedida(2))) {
				return "Tri�ngulo Equil�tero";
			}
			else if((getMedida(0)==getMedida(1))||(getMedida(0)==getMedida(2))||(getMedida(1)==getMedida(2))){
				return "Tri�ngulo Is�sceles";
			}else {
				return "Triangulo Escaleno";
			}
		}else {
			return "Os lados n�o formam um tri�ngulo";
		}
	}

}

