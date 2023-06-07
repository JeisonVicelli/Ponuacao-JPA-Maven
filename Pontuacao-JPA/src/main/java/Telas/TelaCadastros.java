package Telas;

import Telas.menus.Menu;
import Telas.menus.MenuCadastros;
import Telas.menus.MenuMercadorias;
import util.Mensagem;

public class TelaCadastros extends Tela {

	private static Tela instance;
	private static Tela instanceMercadorias;
	private static Tela instanceClientes;
	private static Tela instanceUsuarios;
	private static Tela instanceBrindes;

	private TelaCadastros(String titulo, Menu menu) {
		super(titulo, menu);
	}

	public static synchronized Tela getInstance() {
		if (instance == null) {
			instance = new TelaCadastros(Mensagem.TELA_CADASTROS, new MenuCadastros());
		}
		return instance;
	}

	public static synchronized void mostrarTelaCadastroMercadoria() {
		if (instanceMercadorias == null) {
			instanceMercadorias = new TelaCadastros(Mensagem.TELA_CADASTRO_DE_PRODUTOS, new MenuMercadorias());
		}
		instanceMercadorias.mostrar();
	}

	public static synchronized void mostrarTelaDeCadastroDeClientes() {
		if (instanceClientes == null) {
			instanceClientes = new TelaCadastros(Mensagem.TELA_CADASTRO_DE_CLIENTES, new MenuClientes());
		}
		instanceClientes.mostrar();
	}

	public static synchronized void mostrarTelaDeCadastroDeUsuarios() {
		if (instanceUsuarios == null) {
			instanceUsuarios = new TelaCadastros(Mensagem.TELA_CADASTRO_DE_USUARIOS, new MenuUsuarios());
		}
		instanceUsuarios.mostrar();
	}
	
	public static synchronized void mostrarTelaCadastroBrindes() {
		if (instanceBrindes == null) {
			instanceBrindes = new TelaCadastros(Mensagem.TELA_CADASTRO_DE_USUARIOS, new MenuBrindes());
		}
		instanceUsuarios.mostrar();
	}
}

