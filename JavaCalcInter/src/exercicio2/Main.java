package exercicio2;

import java.util.ArrayList;

public class Main {
	public static void main(String a[]) {
		
		ArrayList<Forma> formas = new ArrayList<Forma>();
		
		formas.add(new Forma());
		formas.add(new Circulo(1));
		formas.add(new Retangulo(2,4) );
		formas.add(new Triangulo(10, 1, 1));
		formas.add(new Triangulo(2, 2, 2));
		formas.add(new Triangulo(10, 10, 12));
		formas.add(new Triangulo(4, 5, 3));
		
		for(Forma forma: formas) {
			System.out.println(forma.info());
			System.out.println("Área = " + forma.area());
			System.out.println("Perímetro = " + forma.perimetro());
			System.out.println();
			
		}

	}
}
//SAÍDA ESPERADA
//Sem forma definida
//Área = -1.0
//Perímetro = -1.0
//
//Círculo
//Área = 3.141592653589793
//Perímetro = 6.283185307179586
//
//Retângulo
//Área = 8.0
//Perímetro = 12.0
//
//Os lados não formam um triângulo
//Área = -1.0
//Perímetro = -1.0
//
//Triângulo Equilátero
//Área = 1.7320508075688772
//Perímetro = 6.0
//
//Triângulo Isósceles
//Área = 48.0
//Perímetro = 32.0
//
//Triângulo Escaleno
//Área = 6.0
//Perímetro = 12.0
//

