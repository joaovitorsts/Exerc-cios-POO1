package lista;

public class BombaCombustivel {

	private String tipoCombustivel;
	private float valorLitro;
	private int quantidadeCombustivel;
	
	public BombaCombustivel(String t, float v, int q) {
		this.tipoCombustivel = t;
		this.valorLitro = v;
		this.quantidadeCombustivel = q;
	}
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	public float abastecerPorValor(float valorAbastecer) {
		return (float)(valorAbastecer / this.valorLitro);
	}
	public float abastecerPorLitro(float qtdLitro) {
		return (float)(qtdLitro * this.valorLitro);
	}
}
