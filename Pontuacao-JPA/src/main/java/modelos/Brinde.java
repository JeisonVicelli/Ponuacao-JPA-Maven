package modelos;

public class Brinde extends Produto{
	
	
	
	public Brinde() {
		
	}	
	

	public Brinde(String codigo,String nome, int pontos) {
		super(codigo, nome, pontos);
		
	}

	@Override
	public String toString() {
		return "Brinde [nome=" + nome + ", Pontos=" + pontos + "]";
	}
	

}
