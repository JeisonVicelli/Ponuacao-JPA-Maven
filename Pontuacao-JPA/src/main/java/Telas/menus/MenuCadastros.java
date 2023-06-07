package Telas.menus;

import Telas.Comando;
import Telas.TelaCadastros;
import Telas.TelaPrincipal;
import util.Mensagem;

public class MenuCadastros extends Menu {
	
	public MenuCadastros() {

		adicionar(1, Mensagem.MENU_CADASTRO_DE_PRODUTOS, new Comando() {
			public void executar() {
				TelaCadastros.mostrarTelaCadastroMercadorias();		
			}
		});
		
		adicionar(2, Mensagem.MENU_CADASTRO_DE_CLIENTES, new Comando() {
			public void executar() {
				TelaCadastros.mostrarTelaDeCadastroDeClientes();			
			}
		});
		
		adicionar(3, Mensagem.MENU_CADASTRO_DE_USUARIOS, new Comando() {
			public void executar() {
				TelaCadastros.mostrarTelaDeCadastroDeUsuarios();			
			}
		});
		
		adicionar(4, Mensagem.MENU_VOLTAR, new Comando() {
			public void executar() {
				TelaPrincipal.getInstance().mostrar();			
			}
		});
	}
}

