package exercicio3;

public class CelsiusToFahrenheit implements ConverteTemperatura {

	@Override
	public double converter(double c) {
		return 1.8*c+32;
	}

}
