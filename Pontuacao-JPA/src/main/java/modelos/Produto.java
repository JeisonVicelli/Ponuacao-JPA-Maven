package modelos;

public class Produto {
	
	public String codigo;
	public String nome;
	public String marca;
	public double preco;
	public int pontos;
	
	public Produto() {		
	}

	public Produto(String codigo, String nome, String marca, double preco, int pontos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", marca=" + marca + ", valor=" + preco + ", pontos="
				+ pontos + "]";
	}
	
	
	

}
