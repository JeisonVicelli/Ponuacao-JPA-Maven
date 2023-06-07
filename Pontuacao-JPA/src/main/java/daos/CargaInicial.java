package daos;

import modelos.Brinde;
import modelos.Cliente;
import modelos.Mercadoria;
import modelos.Pedido;
import modelos.Pedido.Status;
import modelos.Produto;
import modelos.Usuario;

public class CargaInicial {
	
public static void rodar() {
		
		/*DAO<Cliente> daoCliente = new ClienteDAO();
		Cliente cliente = daoCliente.salvar(new Cliente("Pedro", "123456","22/12/2000", "(41)998765546", 100));
		daoCliente.salvar(new Cliente("Ana", "123455", "30/01/2016", "(41)987657890", 3));
		
		DAO<Usuario> daoUsuario = new UsuarioDAO();
		Usuario usuario = daoUsuario.salvar(new Usuario("Jeison", "04716350908","jeisonvicelli@gmail.com", "senha"));
		daoUsuario.salvar(new Usuario("Gabriel","12312312312", "gabrielcesaro@hotmail.com","senha"));
		daoUsuario.salvar(new Usuario("Paulo Victor","23423423423","victorpam9@hotmail.com", "senha"));*/

		DAO<Mercadoria> daoMercadoria = new MercadoriaDAO();
		Mercadoria merc1 = daoMercadoria.salvar(new Mercadoria("1", "Jaqueta", 100, "Volcom", 299.90));
		Mercadoria merc2 = daoMercadoria.salvar(new Mercadoria("2", "Camisa,", 50, "Hurley", 149.90));
		Mercadoria merc3 = daoMercadoria.salvar(new Mercadoria("3", "Tenis", 300, "Nike Sb", 499.90));
		Mercadoria merc4 = daoMercadoria.salvar(new Mercadoria("4", "Calça", 45, "DC", 299.90));
		Mercadoria merc5 = daoMercadoria.salvar(new Mercadoria("5","Moletom", 66,"Billabong", 289.90));
		Mercadoria merc6 = daoMercadoria.salvar(new Mercadoria("6", "Bone", 25, "New Era", 179.90));
		
		DAO<Brinde> daoBrinde = new BrindeDAO();
		Brinde brin1 = daoBrinde.salvar(new Brinde("1","Copo", 25));
		Brinde brin2 = daoBrinde.salvar(new Brinde("2","Adesivo", 10));
		Brinde brin3 = daoBrinde.salvar(new Brinde("3","Chaveiro", 20));
		Brinde brin4 = daoBrinde.salvar(new Brinde("4","Camiseta", 100));
		Brinde brin5 = daoBrinde.salvar(new Brinde("5","Bone", 150));

		/*DAO<Pedido> daoPedido = new PedidoDAO();
		Pedido pedido = new Pedido(usuario);
		pedido.setCliente(cliente);
		pedido.adicionar(merc1);
		pedido.adicionar(merc2);
		pedido.setStatus(Status.CONCLUIDO);
		daoPedido.salvar(pedido);*/
	}


}
