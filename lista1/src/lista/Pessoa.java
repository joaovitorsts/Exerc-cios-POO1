package lista;

public class Pessoa {

	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public Pessoa(String n, int i, float p, float a) {
		this.nome = n;
		this.idade = i;
		this.peso = p;
		this.altura = a;
	}
	
	public void envelhecer() {
		this.idade += 1;
		if(this.idade < 21) {
			this.altura += 0.005;
		}
	}
	
	public void engordar(float p) {
		this.peso += p;
	}
	
	public void emagrecer(float p) {
		this.peso -= p;
	}
	
	public void crescer(float a) {
		this.altura += a;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso(float p) {
		this.peso = p;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	public void setAltura(int a) {
		this.altura = a;
	}
	
}
