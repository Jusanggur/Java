package exercicio3;

public class FahrenheitToKelvin implements ConverteTemperatura {
	
	@Override
	public double converter(double f) {
		return 5.0/9.0*f+2297.0/9.0;
	}

}