package modelos;

public class Usuario extends Pessoa {
	
	private String login;
	private String senha;
	
	public Usuario() {		
	}
	
	public Usuario(String nome, String cPF) {
		super(nome, cPF);
	}
	public Usuario(String nome, String cPF,String login, String senha) {
		super(nome,cPF);
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nome =" + getNome() + ", CPF =" + getCPF() + "]";
	}
	
	
	
	

}
