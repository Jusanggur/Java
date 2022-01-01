package exercicio3;

public class CelsiusToKelvin implements ConverteTemperatura {


	@Override
	public double converter(double c) {
		return c+273;
	}

}