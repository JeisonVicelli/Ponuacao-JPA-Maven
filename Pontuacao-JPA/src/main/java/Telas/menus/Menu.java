package Telas.menus;

import java.util.ArrayList;
import java.util.List;

import Telas.Comando;

public class Menu {
	
	private List<ItemMenu> itens = new ArrayList<>();

	public void adicionar(Integer index, String texto, Comando comando) {
		itens.add(new ItemMenu(index, texto, comando));
	}

	public List<ItemMenu> getItens() {
		return itens;
	}


}
