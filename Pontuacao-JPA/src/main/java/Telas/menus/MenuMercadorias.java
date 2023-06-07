package Telas.menus;

import java.util.List;

import Telas.Comando;
import Telas.TelaCadastros;
import controles.ControleMercadoria;
import modelos.Mercadoria;
import util.Mensagem;
import util.Prompt;

public class MenuMercadorias extends Menu {
		
		private ControleMercadoria cadastro = ControleMercadoria.getInstance();
		
		public MenuMercadorias() {
			
			final Comando listarMercadorias = new Comando() {
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
					TelaCadastros.mostrarTelaCadastroMercadorias();
				}
			};
			
			adicionar(1, Mensagem.MENU_LISTAR_PRODUTOS, listarMercadorias);
			
			adicionar(2, Mensagem.MENU_INCLUIR_PRODUTO, new Comando() {
				public void executar() {
					Prompt.linhaEmBranco();
					Prompt.imprimir(Mensagem.MSG_INCLUSAO_PRODUTO);
					String codigo = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
					String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
					int pontos = Prompt.lerInteiro("Informe pontos");
					String marca = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
					Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
					
					if (!nome.isEmpty()) {
						cadastro.salvar(new Mercadoria(codigo, nome, pontos, marca, preco));
						
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
						Mercadoria mercadoriaAlterar = cadastro.buscar(id);
					
						if (mercadoriaAlterar != null) {
							String codigo = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
							String nome = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
							int pontos = Prompt.lerInteiro("Informe pontos");
							String marca = Prompt.lerLinha(Mensagem.MSG_INFORME_NOME);
							Double preco = Prompt.lerDecimal(Mensagem.MSG_INFORME_PRECO);
							
							if (!nome.isEmpty()) {		
								mercadoriaAlterar.setCodigo(codigo); 
								mercadoriaAlterar.setNome(nome);
								mercadoriaAlterar.setPreco(pontos);
								mercadoriaAlterar.setMarca(marca);
								mercadoriaAlterar.setPreco(preco);
								
								cadastro.atualizar(mercadoriaAlterar);
			
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
					listarMercadorias.executar();
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
					listarMercadorias.executar();
				}
			});
			
			adicionar(5, Mensagem.MENU_VOLTAR, new Comando() {
				public void executar() {
					TelaCadastros.getInstance().mostrar();			
				}
			});
		}
	}



