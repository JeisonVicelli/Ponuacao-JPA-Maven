package modelos;

public class Mercadoria extends Produto{
	
	public String marca;
	public double preco;
	
	
	public Mercadoria() {
		
	}
	public Mercadoria(String codigo, String nome, int pontos ) {
		super(codigo, nome, pontos);
	}
	
	public Mercadoria(String codigo, String nome, int pontos, String marca, double preco) {
		super(codigo, nome, pontos);
		this.marca = marca;
		this.preco = preco;
		
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

	@Override
	public String toString() {
		return "Mercadoria [ Nome =" + nome + "marca=" + marca + ", preco=" + preco + ", pontos=" + pontos + "]";
	}
	
	
	
	
	

}
