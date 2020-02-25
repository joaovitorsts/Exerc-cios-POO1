package lista;

public class Televisao {

	private int volume;
	private int canal;
	
	public Televisao(int v, int c) {
		this.volume = v;
		this.canal = c;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume > 100 && volume < 0) {
			System.out.println("Volume inválido, passe um valor entre 0 e 100");
		}else {
		this.volume = volume;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	
	public void informaCanal(int c) {
		if(c > 50 || c < 0) {
			System.out.println("Canal inválido, passe um valor entre 0 e 50");
		}else {
			this.canal = c;
		}
	}
	
	public void aumentaVolume(int v) {
		if((this.volume + v) > 100) {
			System.out.println("Volume inválido, passe um valor entre 0 e 100");
		}else {
			this.volume += v;
		}
	}
	
	public void diminuiVolume(int v) {
		if((this.volume - v) < 0) {
			System.out.println("Volume inválido, passe um valor entre 0 e 100");
		}else {
			this.volume -= v;
		}
	}
	
}
