package Telas.menus;

import java.util.List;

import Telas.Comando;
import Telas.TelaCadastros;
import controles.ControleMercadoria;
import modelos.Mercadoria;
import util.Mensagem;
import util.Prompt;

/*public class MenuMercadorias extends Menu {
		
		private ControleMercadoria cadastro = ControleMercadoria.getInstance();
		
		public MenuMercadorias() {
			
			Comando listarMercadorias = new Comando() {
				public void executar() {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_LISTA_DE_PRODUTOS);
					
					List<Mercadoria> mercadorias = cadastro.getMercadoria();
					if (mercadorias.isEmpty()) {
						Prompt.imprimir(Mensagem.MSG_NENHUM_PRODUTO); 
					} else {
						for (Mercadoria mercadoria : mercadorias) {
							Prompt.imprimir(mercadoria.toString());
						}
					}
					
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
					TelaCadastros.mostrarTelaCadastroMercadoria();
				}
			};
			
			adicionar(1, Mensagem.MENU_LISTAR_PRODUTOS, listarMercadorias);
			
			adicionar(2, Mensagem.MENU_INCLUIR_PRODUTO, new Comando() {
				public void executar() {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_INCLUSAO_PRODUTO);
					String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
					Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
					
					if (!nome.isEmpty()) {
						cadastro.adicionar(new Mercadoria(nome, preco));
						
						Prompt.linhaEmBranco();
						Prompt.pressionarEnter();
					}
					listarMercadorias.executar();
				}
			});
			
			adicionar(3, Mensagem.MENU_ALTERAR_PRODUTO, new Comando() {
				public void executar() {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_ALTERACAO_PRODUTO);
					Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);
					
					if (id > 0) {
						Produto produtoAlterar = cadastro.buscar(id);
					
						if (produtoAlterar != null) {
							String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
							Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
							
							if (!nome.isEmpty()) {		
								produtoAlterar.setId(id); 
								produtoAlterar.setNome(nome);
								produtoAlterar.setPreco(preco);
								
								cadastro.atualizar(produtoAlterar);
			
								Prompt.linhaEmBranco();
								Prompt.imprimir(Mensagem.MSG_PRODUTO_ALTERADO);
							}
						} else {
							Prompt.linhaEmBranco();
							Prompt.imprimir(Mensagem.MSG_PRODUTO_NAO_ENCONTRADO);
						}
						Prompt.linhaEmBranco();
						Prompt.pressionarEnter();
					}
					listarProdutos.executar();
				}
			});
			
			adicionar(4, Mensagem.MENU_EXCLUIR_PRODUTO, new Comando() {
				public void executar() {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_EXCLUSAO_PRODUTO);
					Long id = (long) Prompt.lerInteiro(Mensagem.MSG_INFORME_ID);	
					
					if (id > 0) {
						cadastro.excluir(id);
					
						Prompt.linhaEmBranco();
						Prompt.imprimir(Mensagem.MSG_PRODUTO_EXCLUIDO);
						Prompt.linhaEmBranco();
						Prompt.pressionarEnter();
					}
					listarProdutos.executar();
				}
			});
			
			adicionar(5, Mensagem.MENU_VOLTAR, new Comando() {
				public void executar() {
					TelaDeCadastros.getInstance().mostrar();			
				}
			});
		}
	}


}
