package exercicio1;

public class Main {

	public static void validar(boolean valor) {
		if (valor)
			System.out.println("OK");
		else
			System.out.println("ERRO");
	}

	public static void main(String[] args) {

		Equacao equacao1 = new EquacaoSegundoGrau(4, 0, -16);
		Equacao equacao2 = new EquacaoSegundoGrau(2, 1, 2);
		Equacao equacao3 = new EquacaoSegundoGrau(1, 2, 1);

		equacao1.resolver();
		equacao2.resolver();
		equacao3.resolver();

		System.out.print("1) ");
		validar(equacao1.existemRaizesReais());

		System.out.print("2) ");
		validar(equacao1.delta() == 256);

		System.out.print("3) ");
		validar(equacao1.getRaizes().size() == 2);

		System.out.print("4) ");
		validar(equacao1.getRaizes().get(0) == 2);

		System.out.print("5) ");
		validar(equacao1.getRaizes().get(1) == -2);

		System.out.print("6) ");
		validar(!equacao2.existemRaizesReais());

		System.out.print("7) ");
		validar(equacao2.getRaizes().size() == 0);

		System.out.print("8) ");
		validar(equacao3.existemRaizesReais());

		System.out.print("9) ");
		validar(equacao3.getRaizes().size() == 1);

		System.out.print("10) ");
		validar(equacao3.getRaizes().get(0) == -1);

	}
}
//SAIDA ESPERADA
//1) OK
//2) OK
//3) OK
//4) OK
//5) OK
//6) OK
//7) OK
//8) OK
//9) OK
//10) OK
