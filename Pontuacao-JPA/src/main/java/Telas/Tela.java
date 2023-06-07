package Telas;

import java.util.List;

import Telas.menus.ItemMenu;
import Telas.menus.Menu;
import util.Mensagem;
import util.Prompt;

public abstract class Tela {
	
	protected String titulo;
	protected Menu menu;
	
	public Tela(String titulo) {
		this.titulo = titulo;
	}
	
	public Tela(String titulo, Menu menu) {
		this.titulo = titulo;
		this.menu = menu;
	}
	
	public void mostrar() {
		if (menu != null) {
			Prompt.linhaEmBranco();
			Prompt.imprimir(titulo);
			Prompt.imprimir(Mensagem.MSG_ESCOLHA);
			List<ItemMenu> itensMenu = menu.getItens();
			for (ItemMenu item : itensMenu) {
				item.mostrar();
			}
			Integer opcao = Prompt.lerInteiro() - 1;
			ItemMenu itenSelecionado = itensMenu.get(opcao);
			itenSelecionado.executar();
		} 
	}

	

}
