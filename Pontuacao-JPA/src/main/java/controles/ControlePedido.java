package controles;

import java.util.List;

import daos.DAO;
import modelos.Pedido;
import modelos.Pedido.Status;

public class ControlePedido {
	
	public static ControlePedido instance;
	
	private DAO<Pedido> dao = new PedidoDAO();
	
	public static synchronized ControlePedido getPedidos() {
		if(instance == null) {
			instance = new ControlePedido();
		}
		return instance;
	}
	
	public List<Pedido> listar(){
		return dao.listar();
	}
	
	public void salvar(Pedido pedido) {
		dao.salvar(pedido);
	}
	
	public Pedido buscar(Long id) {
		return dao.buscarPorId(id);
	}
	
	public void cancelar(Pedido pedido) {
		pedido.setStatus(Status.CANCELADO);
		dao.atualizar(pedido);
	}
	
	

}
