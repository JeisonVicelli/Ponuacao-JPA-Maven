package modelos;

public class Brinde {
	
	public String nome;
	public int valorPontos;
	
	public Brinde() {
		
	}

	public Brinde(String nome, int valorPontos) {
		super();
		this.nome = nome;
		this.valorPontos = valorPontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValorPontos() {
		return valorPontos;
	}

	public void setValorPontos(int valorPontos) {
		this.valorPontos = valorPontos;
	}

	@Override
	public String toString() {
		return "Brinde [nome=" + nome + ", valorPontos=" + valorPontos + "]";
	}
	

}
