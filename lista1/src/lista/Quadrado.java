package lista;

public class Quadrado {
	private int tamanhoLado;
	
	public Quadrado(int t) {
		this.tamanhoLado = t;
	}
	
	public void mudarValorLado(int val) {
		this.tamanhoLado = val;
	}
	
//	public int GetTamanhoLado() {
//		
//	}
	
	public int retornarValorLado() {
		return this.tamanhoLado;
	}
	
	public int calcularArea() {
		return this.tamanhoLado * this.tamanhoLado;
	}
}
