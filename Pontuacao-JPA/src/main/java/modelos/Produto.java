package modelos;

public class Produto {
	
	public String codigo;
	public String nome;
	public int pontos;
	
	public Produto() {		
	}

	public Produto(String codigo, String nome, int pontos) {
		super();
		this.codigo = codigo;
		this.nome = nome;	
		this.pontos = pontos;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", pontos =" + pontos + "]";
	}
	
	
	

}
