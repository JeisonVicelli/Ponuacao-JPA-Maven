package modelos;

public class Cliente extends Pessoa {
	
	public String dataNascimento;
	public String tefefone;
	public int pontos;
	
	public Cliente() {		
	}

	public Cliente(String nome, String cPF) {
		super(nome, cPF);
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, String CPF, String dataNascimento, String tefefone, int pontos) {
		super(nome, CPF);
		this.dataNascimento = dataNascimento;
		this.tefefone = tefefone;
		this.pontos = pontos;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTefefone() {
		return tefefone;
	}

	public void setTefefone(String tefefone) {
		this.tefefone = tefefone;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
		return "Cliente [Nome =" + getNome() + ", CPF =" + getCPF() + ", pontos=" + pontos + "]";
	}
	
	

}
