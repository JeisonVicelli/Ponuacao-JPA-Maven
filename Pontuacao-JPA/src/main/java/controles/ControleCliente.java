package controles;

import java.util.List;

import org.hibernate.query.NativeQuery.ReturnableResultNode;

import daos.DAO;
import modelos.Cliente;

public class ControleCliente {
	
	private static ControleCliente instance;
		private DAO<Cliente> dao = new ClienteDAO();
		
		private ControleCliente () {}
		
		public static synchronized ControleCliente getInstance() {
			if(instance == null) {
				instance = new ControleCliente();
			}
			return instance;
		}
		public List<Cliente> getClientes(){
			return dao.listar();
		}
		
		public Cliente buscarPorId(Long id) {
			return dao.buscarPorId(id);
		}
		
		public void salvar(Cliente cliente) {
			 dao.salvar(cliente);
		}
		
		public void atualizar(Cliente cliente) {
			 dao.atualizar(cliente);
		}
		
		public void excluir(Long id) {
			dao.excluir(id);
		}

}
