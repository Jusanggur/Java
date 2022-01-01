package exercicio3;

public class FahrenheitToCelsius implements ConverteTemperatura {

	@Override
	public double converter(double f) {
		return -160.0/9.0+f*5.0/9.0;
	}

}