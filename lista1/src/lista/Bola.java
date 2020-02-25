package lista;

public class Bola {
	private String cor;
	private float circunferencia;
	private String material;
	
	public Bola(String c, float cir, String mat) {
		this.cor = c;
		this.setCircunferencia(cir);
		this.setMaterial(mat);
	}
	
	public void trocarCor(String c) {
		this.cor = c;
	}
	
	public void mostrarCor() {
		System.out.println("A cor da bola é: " + this.cor);
	}

	public float getCircunferencia() {
		return circunferencia;
	}

	public void setCircunferencia(float circunferencia) {
		this.circunferencia = circunferencia;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
