package exercicio3;

public class KelvinToFahrenheit implements ConverteTemperatura {

	@Override
	public double converter(double k) {
		return -2297.0/5.0+9.0/5.0*k;
	}

}
