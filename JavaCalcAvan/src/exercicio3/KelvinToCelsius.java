package exercicio3;

public class KelvinToCelsius implements ConverteTemperatura {

	@Override
	public double converter(double k) {
		return -273+k;
	}

}
