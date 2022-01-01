package exercicio3;

public class Main {

	public static void validar(boolean valor) {
		if (valor)
			System.out.println("OK");
		else
			System.out.println("ERRO");
	}

	public static void main(String arg[]) {

		ConverteTemperatura temperatura;
		
		System.out.print("1) ");
		temperatura = new CelsiusToKelvin();
		validar(temperatura.converter(37) == 310);
		
		System.out.print("2) ");
		temperatura = new CelsiusToFahrenheit();
		validar(temperatura.converter(10) == 50);

		System.out.print("3) ");
		temperatura = new KelvinToCelsius();
		validar(temperatura.converter(310) == 37);

		System.out.print("4) ");
		temperatura = new KelvinToFahrenheit();
		validar(temperatura.converter(373) == 212);

		System.out.print("5) ");
		temperatura = new FahrenheitToKelvin();
		validar(temperatura.converter(32) == 273);

		System.out.print("6) ");
		temperatura = new FahrenheitToCelsius();
		validar(temperatura.converter(95) == 35);

	}
}
