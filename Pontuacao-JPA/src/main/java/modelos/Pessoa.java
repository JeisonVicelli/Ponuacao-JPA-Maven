package modelos;

public class Pessoa {
	
	private String nome;
	private String CPF;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", CPF=" + CPF + "]";
	}
	
	

}
