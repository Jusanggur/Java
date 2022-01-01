package exercicio1;

public class Televisor {

	private int canal, volume;

	public void mostrar() {
		System.out.println("Volume: "+volume);
		System.out.println("Canal: "+canal);
	}

	public void aumentarCanal() {
		canal++;
	}

	public void diminuirVolume() {
		volume--;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if((canal>0)&&(canal<1000)) {
			this.canal = canal;
		}else {
			System.out.println("Canal indisponivel, deve ser um valor entre 0 e 1000.");
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if((volume>0)&&(volume<100)) {
			this.volume = volume;
		}else {
			System.out.println("Volume fora da faixa permitida, deve ser um valor entre 0 e 100.");
		}
	}
}
