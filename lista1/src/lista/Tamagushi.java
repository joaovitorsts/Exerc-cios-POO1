package lista;

public class Tamagushi {
	
	private String nome;
	private boolean fome;
	private boolean saude;
	private int idade;

	public Tamagushi(String n, boolean f, boolean s, int i) {
		this.setNome(n);
		this.setFome(f);
		this.setSaude(s);
		this.setIdade(i);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFome() {
		return fome;
	}

	public void setFome(boolean fome) {
		this.fome = fome;
	}

	public boolean isSaude() {
		return saude;
	}

	public void setSaude(boolean saude) {
		this.saude = saude;
	}
	
	public String getHumor() {
		if(this.fome == false && this.saude == true) {
			return "Bem humorado";
		}else if(this.fome == true && this.saude == true) {
			return "Razoavelmente humorado";
		}else if(this.fome == false && this.saude == false) {
			return "Razoavelmente humorado";
		}else {
			return "Mal humorado";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
