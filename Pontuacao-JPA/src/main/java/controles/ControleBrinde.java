package controles;

import java.util.List;

import daos.BrindeDAO;
import daos.DAO;
import modelos.Brinde;

public class ControleBrinde {
	
	private static ControleBrinde instance;
	private DAO<Brinde> dao = new 	BrindeDAO();
	
	private ControleBrinde () {}

	public static synchronized ControleBrinde getBrinde() {
		if(instance == null) {
			instance = new ControleBrinde();
		}
		return instance;
	}
	
	public List<Brinde> getBrindes(){
		return dao.listar();
	}
	
	public void salvar(Brinde brinde) {
		dao.salvar(brinde);
	}
	
	public void atualizar(Brinde brinde) {
		dao.atualizar(brinde);
	}
	
	public Brinde buscar(Long id) {
		return dao.buscarPorId(id);
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
	}
	

}
