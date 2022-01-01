package exercicio1;


public class Main {
	public static void main(String[] args) {
		Televisor tv = new Televisor();
		tv.mostrar();
		tv.setCanal(150);
		tv.aumentarCanal();
		tv.setVolume(3);
		tv.diminuirVolume();
		tv.mostrar();
		System.out.println(tv.getCanal());
		System.out.println(tv.getVolume());
		tv.setCanal(1500);
		tv.setVolume(3000);
		tv.mostrar();

	}
}
//SAIDA ESPERADA
//Volume: 0
//Canal: 0
//Volume: 2
//Canal: 151
//151
//2
//Canal indisponível, deve ser um valor entre 0 e 1000.
//Volume fora da faixa permitida, deve ser um valor entre 0 e 100.
//Volume: 2
//Canal: 151