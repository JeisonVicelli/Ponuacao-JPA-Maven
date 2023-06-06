package controles;

import java.util.List;

import daos.DAO;
import modelos.Usuario;

public class ControleUsuario {
	
	private static ControleUsuario instance;
	private DAO<Usuario> dao = new Usuario.DAO();
	
	private ControleUsuario () {}
	
	public static synchronized ControleUsuario getUsuario() {
		if(instance == null) {
			instance = new ControleUsuario();
		}
		return instance;
	}
	
	public List<Usuario> getUsuarios(){
		return dao.listar();
	}
	
	public void salvar(Usuario usuario) {
		dao.salvar(usuario);
	}
	
	public void atualizar(Usuario usuario) {
		dao.atualizar(usuario);
	}
	
	public Usuario buscar(Long id) {
		return dao.buscarPorId(id);
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
	}
	
	

}
