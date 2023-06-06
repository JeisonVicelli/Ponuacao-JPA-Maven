package controles;

import java.util.List;

import daos.DAO;
import modelos.Mercadoria;
import modelos.Produto;

public class ControleMercadoria {
	
	private static ControleMercadoria instance;	
	private DAO<Mercadoria> dao = new MercadoriaDAO();
	
	private ControleMercadoria() {	}
	
	public static synchronized ControleMercadoria getInstance() {
		if(instance == null) {
			instance = new ControleMercadoria();
		}
		return instance;
	}
	
	public List<Mercadoria> getMercadoria(){
		return dao.listar();
	}
	
	public void salvar(Mercadoria mercadoria) {
		dao.salvar(mercadoria);
	}	
	
	public void atualizar(Mercadoria mercadoria) {
		dao.atualizar(mercadoria);
	}
	
	public Produto buscar(Long id) {
		return dao.buscarPorId(id);
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
	}

}
